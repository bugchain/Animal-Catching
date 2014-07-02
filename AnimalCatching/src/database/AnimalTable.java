package database;

import java.util.ArrayList;
import java.util.List;

import tool.AnimalCatchedInfo;
import tool.AnimalInfo;
import tool.AnimalMapInfo;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class AnimalTable {

	private static MainDataBase objMainDataBase;
	private static SQLiteDatabase ReadDatabase;
	private static SQLiteDatabase WriteDatabase;

	public AnimalTable(Context context) {
		// TODO Auto-generated constructor stub
		objMainDataBase = new MainDataBase(context);
		ReadDatabase = objMainDataBase.getReadableDatabase();
		WriteDatabase = objMainDataBase.getWritableDatabase();
	}

	public int countAllAnimal(){
		int all = 0;
		Cursor cursor = ReadDatabase.rawQuery("SELECT * FROM "+MainDataBase.AnimalTableName, null);
		if(cursor != null){
			all = cursor.getCount();
		}
		cursor.close();
		Log.i("All animal", String.valueOf(all));
		return all;
	}
	public int countAllCatch(){
		int all = 0;
		Cursor cursor = ReadDatabase.rawQuery("SELECT "+MainDataBase.AnimalTableColAnameth
				+" FROM "+MainDataBase.AnimalTableName 
				+ " WHERE "+MainDataBase.AnimalTableColAcatched +"='TRUE'", null);
		if(cursor!=null){
			all = cursor.getCount();
		}
		Log.i("All catch", String.valueOf(all));
		return all;
	}
	
	public List<AnimalMapInfo> getAllAnimalMap(int hour) {

		List<AnimalMapInfo> output = new ArrayList<AnimalMapInfo>();
		String time = "day";
		int aid;
		String aname, icon;
		double lattitude, longtitude;

		if(hour >= 18 || hour < 6)
			time = "night";
		
		Cursor mCursor = ReadDatabase.query(MainDataBase.AnimalTableName,
				new String[] { MainDataBase.AnimalTableColAid,
						MainDataBase.AnimalTableColAnameth,
						MainDataBase.AnimalTableColAlattitude,
						MainDataBase.AnimalTableColAlongtitude,
						MainDataBase.AnimalTableColAicon },MainDataBase.AnimalTableColAtime+ " ='" +time+"'" , null, null,
				null, null);
		if (mCursor.getCount() > 0) {
			mCursor.moveToFirst();
			for (int i = 0; i < mCursor.getCount(); i++) {
				aid = Integer.valueOf(mCursor.getString(mCursor
						.getColumnIndex(MainDataBase.AnimalTableColAid)));
				aname = mCursor.getString(mCursor
						.getColumnIndex(MainDataBase.AnimalTableColAnameth));
				lattitude = Double
						.valueOf(mCursor.getString(mCursor
								.getColumnIndex(MainDataBase.AnimalTableColAlattitude)));
				longtitude = Double
						.valueOf(mCursor.getString(mCursor
								.getColumnIndex(MainDataBase.AnimalTableColAlongtitude)));
				icon = mCursor.getString(mCursor
						.getColumnIndex(MainDataBase.AnimalTableColAicon));
				output.add(new AnimalMapInfo().Create(aid, aname, lattitude,
						longtitude, icon));
			}
			return output;
		}
		return null;

	}

	public boolean CatchtAnimal(int aid) {
		Cursor objCursor = ReadDatabase.rawQuery("SELECT "
				+ MainDataBase.AnimalTableColAcatched + " FROM "
				+ MainDataBase.AnimalTableName + " WHERE "
				+ MainDataBase.AnimalTableColAid + " = " + String.valueOf(aid),
				null);
		if (objCursor.getCount() == 0)
			return false;
		ContentValues data = new ContentValues();
		data.put(MainDataBase.AnimalTableColAcatched, "TRUE");
		WriteDatabase.update(MainDataBase.AnimalTableName, data,
				MainDataBase.AnimalTableColAid + "=" + String.valueOf(aid),
				null);

		return true;
	}

	public List<AnimalCatchedInfo> getAnimalCatched() {
		List<AnimalCatchedInfo> output = new ArrayList<AnimalCatchedInfo>();
		String Aname, Aicon;
		int Aid;

		Cursor mCursor = ReadDatabase.query(MainDataBase.AnimalTableName,
				new String[] { MainDataBase.AnimalTableColAid,
						MainDataBase.AnimalTableColAicon,
						MainDataBase.AnimalTableColAnameth },
				MainDataBase.AnimalTableColAcatched + "='TRUE'", null, null,
				null, null);
		if (mCursor.getCount() > 0) {
			mCursor.moveToFirst();
			for (int i = 0; i < mCursor.getCount(); i++) {
				Aid = Integer.parseInt(mCursor.getString(mCursor
						.getColumnIndex(MainDataBase.AnimalTableColAid)));
				Aname = mCursor.getString(mCursor
						.getColumnIndex(MainDataBase.AnimalTableColAnameth));
				Aicon = mCursor.getString(mCursor
						.getColumnIndex(MainDataBase.AnimalTableColAicon));
				output.add(new AnimalCatchedInfo().Create(Aid, Aname, Aicon));
			}
			return output;
		}
		return null;
	}

	public AnimalInfo getAnimalInfo(int aid) {
		Cursor mCursor = ReadDatabase.query(MainDataBase.AnimalTableName,
				new String[] { MainDataBase.AnimalTableColAnameth,
						MainDataBase.AnimalTableColAnameen,
						MainDataBase.AnimalTableColAnamesci,
						MainDataBase.AnimalTableColAdetail,
						MainDataBase.AnimalTableColimage,
						MainDataBase.AnimalTableColAicon,
						MainDataBase.AnimalTableColAlattitude,
						MainDataBase.AnimalTableColAlongtitude},
				MainDataBase.AnimalTableColAid + "=" + String.valueOf(aid),
				null, null, null, null);
		if (mCursor != null) {
			mCursor.moveToFirst();
			return new AnimalInfo()
					.Create(mCursor
							.getString(mCursor
									.getColumnIndex(MainDataBase.AnimalTableColAnameth)),
							mCursor.getString(mCursor
									.getColumnIndex(MainDataBase.AnimalTableColAnameen)),
							mCursor.getString(mCursor
									.getColumnIndex(MainDataBase.AnimalTableColAnamesci)),
							mCursor.getString(mCursor
									.getColumnIndex(MainDataBase.AnimalTableColAdetail)),
							mCursor.getString(mCursor
									.getColumnIndex(MainDataBase.AnimalTableColimage)),
							mCursor.getString(mCursor
									.getColumnIndex(MainDataBase.AnimalTableColAicon)),
							mCursor.getString(mCursor
									.getColumnIndex(MainDataBase.AnimalTableColAlattitude)),
							mCursor.getString(mCursor
									.getColumnIndex(MainDataBase.AnimalTableColAlongtitude)));
			
		}
		return null;
	}
	
	public List<String> getBadge(){
		
		//Cursor mCursor = ReadDatabase.rawQuery(,null);
		
		return null;
		
	}

}
