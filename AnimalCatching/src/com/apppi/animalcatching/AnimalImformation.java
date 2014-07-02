package com.apppi.animalcatching;

import database.AnimalTable;
import tool.AnimalInfo;
import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

@SuppressLint("ValidFragment")
public class AnimalImformation extends Fragment{

	int aid;
	
	public AnimalImformation(int aid) {
		// TODO Auto-generated constructor stub
		this.aid = aid;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.imformation, container, false);
		AnimalInfo info = new AnimalTable(MainActivity.mContext).getAnimalInfo(aid);
		
		TextView nameth = (TextView) view.findViewById(R.id.imformation_nameth);
		nameth.setText(info.getanameth());
		TextView nameen = (TextView) view.findViewById(R.id.imformation_nameen);
		nameth.setText(info.getanameen());
		TextView namesci = (TextView) view.findViewById(R.id.imformation_namesci);
		nameth.setText(info.getanamesci());
		TextView detail = (TextView) view.findViewById(R.id.imformation_detail);
		detail.setText(info.getadetail());
		
		
		
		
		return view;
	}
	
}
