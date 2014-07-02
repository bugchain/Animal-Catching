package database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class GetAnimalData {

	private static MainDataBase objMainDataBase;
	private static SQLiteDatabase ReadDatabase;
	private static SQLiteDatabase WriteDatabase;
	
	public GetAnimalData(Context context){
		objMainDataBase = new MainDataBase(context);
		ReadDatabase = objMainDataBase.getReadableDatabase();
		WriteDatabase = objMainDataBase.getWritableDatabase();
	}
	
	///////////////////////////////    GET COUNT ALL ANIMAL /////////////////////
	public int getCountAllAnimal(){
		int count = 0;
		Cursor cursor = ReadDatabase.rawQuery("SELECT " + MainDataBase.AnimalTableColAnameen
				       + " FROM " + MainDataBase.AnimalTableName, null);
		if(cursor != null){
			count = cursor.getCount();
		}
		return count;
	}
	//////////////////////////////  GET ALL ANIMAL DATA  CATCHED  /////////////////////////////
	
	
}
