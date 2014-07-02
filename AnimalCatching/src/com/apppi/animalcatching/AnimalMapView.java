package com.apppi.animalcatching;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;

import tool.AnimalInfo;
import tool.BlurImage;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnCameraChangeListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import database.AnimalTable;
import database.MainDataBase;
import android.app.Dialog;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalMapView extends Fragment implements OnCameraChangeListener{

	MainDataBase mDb;
	SQLiteDatabase db;
	Cursor cursor;

	private MapView mapView;
	public GoogleMap mMap;
	static Marker[] animalMarker;
	private static float zoomLevel = 5.0f;

	static ArrayList<String> nameTh, nameEn, nameSci, detail, imgName,icon,animal_catch;
	static ArrayList<Double> lat, lng;
	static ArrayList<Boolean> catched;
	static ArrayList<Integer> id;
	private static int HOUR = 0;
	MainActivity m;
	static Bitmap[] blurBitmap;
	private static int markerId = 0;
	
	private static Marker mMarker;
	

	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.map_view, container, false);

		m = new MainActivity();
		
		getTime();

		
		mDb = new MainDataBase(MainActivity.mContext);
		db = mDb.getWritableDatabase();

//		// Gets the MapView from the XML layout and creates it
		mapView = (MapView) view.findViewById(R.id.mapview);
		mapView.onCreate(savedInstanceState);
//
//		// Gets to GoogleMap from the MapView and does initialization stuff
		mMap = mapView.getMap();
		MapsInitializer.initialize(this.getActivity());
//
		mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(
				13.767646, 100.534740), zoomLevel));
		setInitial();
		getAnimalData();
		animalMarker = new Marker[nameTh.size()];

		Log.i("All animal ", ""+nameTh.size());

		mMap.setOnMarkerClickListener(new OnMarkerClickListener() {

			@Override
			public boolean onMarkerClick(Marker marker) {
				int id = Integer.valueOf(marker.getTitle().toString());
				if(mMarker != null){
					mMarker.remove();
					mMarker = null;
				}
				markerId = id;
				getAnimalDetail(id);
				mMarker = marker;
				return true;
			}
		});
		mMap.setOnCameraChangeListener(this);
		
		new ProcessImage().execute();
		m.titleView.setText(getResources().getString(R.string.app_name)+" [ "+m.allAnimalCatch+"/"+m.allAnimal+" ]");
		return view;
	}

	private void getAnimalData() {

		mDb = new MainDataBase(MainActivity.mContext);
		String time = "day";
		db = mDb.getWritableDatabase();
		
		if(HOUR >= 18 || HOUR < 6)
			time = "night";
		
		Cursor cursor = db.rawQuery("SELECT * FROM " + MainDataBase.AnimalTableName + " WHERE " + MainDataBase.AnimalTableColAtime + " ='" + time +"'",
				null);

		cursor.moveToFirst();
		while (!cursor.isAfterLast()) {
			nameTh.add(cursor.getString(cursor
					.getColumnIndex(MainDataBase.AnimalTableColAnameth)));
			nameEn.add(cursor.getString(cursor
					.getColumnIndex(MainDataBase.AnimalTableColAnameen)));
			nameSci.add(cursor.getString(cursor
					.getColumnIndex(MainDataBase.AnimalTableColAnamesci)));
			detail.add(cursor.getString(cursor
					.getColumnIndex(MainDataBase.AnimalTableColAdetail)));
			imgName.add(cursor.getString(cursor
					.getColumnIndex(MainDataBase.AnimalTableColimage)));
			lat.add(cursor.getDouble(cursor
					.getColumnIndex(MainDataBase.AnimalTableColAlattitude)));
			lng.add(cursor.getDouble(cursor
					.getColumnIndex(MainDataBase.AnimalTableColAlongtitude)));
			id.add(cursor.getInt(cursor
					.getColumnIndex(MainDataBase.AnimalTableColAid)));
			icon.add(cursor.getString(cursor
					.getColumnIndex(MainDataBase.AnimalTableColAicon)));
			animal_catch.add(cursor.getString(cursor.getColumnIndex(MainDataBase.AnimalTableColAcatched)));
			cursor.moveToNext();
		}

		db.close();
		cursor.close();

	}

	private void getAnimalDetail(int id) {
		
		AnimalInfo data = new AnimalTable(MainActivity.mContext).getAnimalInfo(id);
		
		showAnimalDetailDialog(data.getanameth(), data.getanameen(), data.getanamesci(), data.getadetail(),data.geticon(),data.getLat(),data.getLng());
	
		if(new AnimalTable(MainActivity.mContext).CatchtAnimal(id)){
			AnimalListView GG = (AnimalListView) MainActivity.fragments.get(1);
			Log.d("GGGGGG", "SaHara");
			GG.GG();
		}
	}
	
	private void setInitial() {

		nameTh = new ArrayList<String>();
		nameEn = new ArrayList<String>();
		nameSci = new ArrayList<String>();
		imgName = new ArrayList<String>();
		detail = new ArrayList<String>();
		lat = new ArrayList<Double>();
		lng = new ArrayList<Double>();
		catched = new ArrayList<Boolean>();
		id = new ArrayList<Integer>();
		icon = new ArrayList<String>();
		animal_catch = new ArrayList<String>();

	}

	private void hideAllAnimal() {
		for (int i = 0; i < animalMarker.length; i++) {
			if (animalMarker[i] != null) {
				animalMarker[i].remove();
				animalMarker[i] = null;
			}			
		}
		if(mMarker != null){
			mMarker.remove();
			mMarker = null;
		}
	}

	private void showAllAnimal() {
		
		for(int i=0;i<blurBitmap.length;i++){
			
			
			LatLng latLng = new LatLng(lat.get(i), lng.get(i));
			if(blurBitmap[i] != null ){
				animalMarker[i] = mMap.addMarker(new MarkerOptions()
				.position(latLng)
				.title(id.get(i).toString())
				.icon(BitmapDescriptorFactory
				.fromBitmap(blurBitmap[i] )));
				
			}else{
				animalMarker[i] = mMap.addMarker(new MarkerOptions()
				.position(latLng)
				.title(id.get(i).toString())
				.icon(BitmapDescriptorFactory
						.fromResource(R.drawable.not_found_icon)));
			}
		}
	}
	

	@Override
	public void onResume() {
		mapView.onResume();
		super.onResume();
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		mapView.onDestroy();
	}

	@Override
	public void onLowMemory() {
		super.onLowMemory();
		mapView.onLowMemory();
	}

	private void showAnimalDetailDialog(String nameTh, String nameEn,
			String nameSci, String detail,final String icon,
			String lat,String lng) {
		LayoutInflater factory = LayoutInflater.from(MainActivity.mContext);
		final View formDialog = factory.inflate(R.layout.dialog_animal_detail,
				null);
		final Dialog dialog = new Dialog(MainActivity.mContext);

		dialog.getWindow();
		dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		dialog.setContentView(formDialog);
		ImageView img = (ImageView) formDialog
				.findViewById(R.id.imageView_animal);
		
		img.setImageResource(getResources().getIdentifier(
                icon, "drawable", MainActivity.mContext.getPackageName()));
		
		TextView txt_detail = (TextView) formDialog
				.findViewById(R.id.textView_animal_detail);
		Button btn_ok = (Button) formDialog.findViewById(R.id.button_dialog_ok);
		txt_detail.setText("ชื่อภาษาไทย : " + nameTh + "\nชื่อภาษาอังกฤษ : "
				+ nameEn + "\nชื่อวิทยาศาสตร์  : " + nameSci + "\n\n\t\t"
				+ detail + "\n");
		btn_ok.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				m.allAnimalCatch  = new AnimalTable(m.mContext).countAllCatch();
				//m.textCatchAll.setText("Catched : "+m.allAnimalCatch+"/"+m.allAnimal);
				m.titleView.setText(getResources().getString(R.string.app_name)+" [ "+m.allAnimalCatch+"/"+m.allAnimal+" ]");
				Log.i("Catched", String.valueOf(m.allAnimalCatch));
				
				dialog.dismiss();
				
				int gg = getResources().getIdentifier(
		                icon + "_border", "drawable", MainActivity.mContext.getPackageName());
				Bitmap bm =  BitmapFactory.decodeResource(getResources(),gg);
				//Bitmap bm =  BitmapFactory.decodeResource(getResources(),R.drawable.asiatic_black_bear_icon_border);
				//Bitmap mm = addWhiteBorder(bm,3);
				//Bitmap nB = new BlurImage().getBlurBitmap(mm,5);
				if(mMarker != null){
					//mMarker.remove();
					mMarker = mMap.addMarker(new MarkerOptions()
					.position(mMarker.getPosition())
					.title(String.valueOf(markerId))
					.icon(BitmapDescriptorFactory
					.fromBitmap(bm)));
				}
				
				
			}
		});

		dialog.show();
		
	}

	@Override
	public void onCameraChange(CameraPosition position) {
		
		if (position.zoom >= 12) {
			hideAllAnimal();
			showAllAnimal();
		}
		if (position.zoom < 12) {
			hideAllAnimal();
		}
		Log.i("Zoom Level",position.zoom+"");
	}

	/*  get day  */

	private void getTime() {
		TimeZone tz = TimeZone.getTimeZone("GMT+07");
		Calendar c = Calendar.getInstance(tz);
		HOUR = c.get(Calendar.HOUR_OF_DAY);

	}/* */
	
	class ProcessImage extends AsyncTask<Void,Void,Void>{

		BlurImage blurImage;
		
		public ProcessImage(){
			blurImage = new BlurImage();
		}
		
		@Override
		protected Void doInBackground(Void... params) {
			
			
			blurBitmap = new Bitmap[nameTh.size()];
			
			for (int i = 0; i < nameTh.size(); i++) {
			
				
				int img = getResources().getIdentifier(
						icon.get(i).toString(), "drawable", MainActivity.mContext.getPackageName());
				
				Bitmap bm = BitmapFactory.decodeResource(getResources(),img);
				if(bm != null){
					if(animal_catch.get(i).toString().equals("FALSE")){
						blurBitmap[i] = blurImage.getBlurBitmap(bm,4);
					}else{
						blurBitmap[i] = bm;
					}
					Log.i("Process", "Round " + i );
				}
			}
			
			return null;
		}
		@Override
		protected void onPreExecute() {
			// TODO Auto-generated method stub
			super.onPreExecute();
		}
		@Override
		protected void onPostExecute(Void result) {
			
			super.onPostExecute(result);
		}
	}

	public Bitmap addWhiteBorder(Bitmap bmp, int borderSize) {
	    Bitmap bmpWithBorder = Bitmap.createBitmap(bmp.getWidth() + borderSize * 2, bmp.getHeight() + borderSize * 2, bmp.getConfig());
	    Canvas canvas = new Canvas(bmpWithBorder);
	    canvas.drawColor(Color.parseColor("#f8f2e4"));
	    canvas.drawBitmap(bmp, borderSize, borderSize, null);
	    return bmpWithBorder;
	}
	
}/* End of MapView class */
