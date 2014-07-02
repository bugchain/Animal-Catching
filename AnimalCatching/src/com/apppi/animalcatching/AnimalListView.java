package com.apppi.animalcatching;

import java.util.ArrayList;
import java.util.List;
import database.MainDataBase;
import tool.AnimalCatchedInfo;
import tool.CustomListViewAdapter;
import android.app.Dialog;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class AnimalListView extends Fragment {

	MainDataBase mDb;
	SQLiteDatabase db;
	Cursor cursor;

	ArrayList<String> nameTh, nameEn, nameSci, detail, imgName, icon;
	ArrayList<Double> lat, lng;

	ListView listView;
	public List<AnimalCatchedInfo> Alldata;
	int[] imageId;
	String[] animal;
	View view;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		view = inflater.inflate(R.layout.list_view, container, false);
		mDb = new MainDataBase(MainActivity.mContext);
		db = mDb.getWritableDatabase();
		setInitial();
		GG();
		return view;
	}

	private void setInitial() {

		listView = (ListView) view.findViewById(R.id.listView_animal);

	}

	private void getAnimalData() {


		
		nameTh = new ArrayList<String>();
		nameEn = new ArrayList<String>();
		nameSci = new ArrayList<String>();
		imgName = new ArrayList<String>();
		detail = new ArrayList<String>();
		lat = new ArrayList<Double>();
		lng = new ArrayList<Double>();
		icon = new ArrayList<String>();

		cursor = db.rawQuery(
				"SELECT *FROM " + MainDataBase.AnimalTableName + " WHERE "
						+ MainDataBase.AnimalTableColAcatched + " = 'TRUE'",
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
			icon.add(cursor.getString(cursor
					.getColumnIndex(MainDataBase.AnimalTableColAicon)));

			cursor.moveToNext();
		}

		imageId = new int[nameTh.size()];

		for (int i = 0; i < icon.size(); i++) {
			// imageId[i] = R.drawable.bos_gaurus_icon;
			imageId[i] = getResources().getIdentifier(icon.get(i).toString(),
					"drawable", MainActivity.mContext.getPackageName());
		}
	}

	public void GG() {

		getAnimalData();

		listView.setAdapter(new CustomListViewAdapter(MainActivity.mContext,
				android.R.id.text1, nameTh, imageId));
		listView.setDivider(new ColorDrawable(Color.parseColor("#87d4ae")));
		listView.setDividerHeight(1);
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {

				cursor.moveToPosition(position);
				String nameTh = cursor.getString(cursor
						.getColumnIndex(MainDataBase.AnimalTableColAnameth));
				String nameEn = cursor.getString(cursor
						.getColumnIndex(MainDataBase.AnimalTableColAnameen));
				String nameSci = cursor.getString(cursor
						.getColumnIndex(MainDataBase.AnimalTableColAnamesci));
				String detail = cursor.getString(cursor
						.getColumnIndex(MainDataBase.AnimalTableColAdetail));
				String bg = cursor.getString(cursor
						.getColumnIndex(MainDataBase.AnimalTableColimage));
				String type = cursor.getString(cursor
						.getColumnIndex(MainDataBase.AnimalTableColAtype));
				
				String place_bg = cursor.getString(cursor
						.getColumnIndex(MainDataBase.AnimalTableColApalceBg));
				

				Intent intent = new Intent(MainActivity.mContext,
						AnimalDetail.class);
				intent.putExtra("nameTh", nameTh);
				intent.putExtra("nameEn", nameEn);
				intent.putExtra("nameSci", nameSci);
				intent.putExtra("detail", detail);
				intent.putExtra("background", bg);
				intent.putExtra("type", type);
				intent.putExtra("place_bg", place_bg);
				startActivity(intent);

			}
		});

	}

}/* end of class */
