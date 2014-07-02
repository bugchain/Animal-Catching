package com.apppi.animalcatching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import com.google.android.gms.maps.model.LatLng;

import database.AnimalTable;
import database.GetAnimalData;
import tool.PagerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabContentFactory;
import android.widget.TextView;

public class MainActivity extends FragmentActivity implements
		TabHost.OnTabChangeListener, ViewPager.OnPageChangeListener {

	private TabHost mTabHost;
	private ViewPager mViewPager;
	private HashMap<String, TabInfo> mapTabInfo = new HashMap<String, MainActivity.TabInfo>();
	private PagerAdapter mPagerAdapter;
	public static Context mContext;
	public static List<Fragment> fragments;
	public static Typeface tf_th,tf_en;
	public static TextView[] txt_host = new TextView[2];
	public static int allAnimal = 0;
	public static int allAnimalCatch = 0;
	public static TextView textCatchAll;
	public static Bitmap[] blurBitmap;
	public static TextView titleView;
	
	GetAnimalData getAnimalData;
	static ArrayList<String> nameTh, nameEn, nameSci, detail, imgName,icon;

	/**
	 * 
	 * @author mwho Maintains extrinsic info of a tab's construct
	 */
	private class TabInfo {
		private String tag;
		private Class<?> clss;
		private Bundle args;
		private Fragment fragment;

		TabInfo(String tag, Class<?> clazz, Bundle args) {
			this.tag = tag;
			this.clss = clazz;
			this.args = args;
		}

	}

	/**
	 * A simple factory that returns dummy views to the Tabhost
	 * 
	 * @author mwho
	 */
	class TabFactory implements TabContentFactory {

		private final Context mContext;

		/**
		 * @param context
		 */
		public TabFactory(Context context) {
			mContext = context;
		}

		/**
		 * (non-Javadoc)
		 * 
		 * @see android.widget.TabHost.TabContentFactory#createTabContent(java.lang.String)
		 */
		public View createTabContent(String tag) {
			View v = new View(mContext);
			v.setMinimumWidth(0);
			v.setMinimumHeight(0);
			return v;
		}

	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see android.support.v4.app.FragmentActivity#onCreate(android.os.Bundle)
	 */
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Inflate the layout
		setContentView(R.layout.main_layout);
		mContext = this;
		AnimalTable animaltable = new AnimalTable(mContext);
		
		getAnimalData = new GetAnimalData(mContext);
		
		allAnimal = animaltable.countAllAnimal();
		allAnimalCatch = animaltable.countAllCatch();
		textCatchAll = (TextView)findViewById(R.id.textViewCatchAll);
		textCatchAll.setText("Catched : "+allAnimalCatch+"/"+allAnimal);
		textCatchAll.setVisibility(View.GONE);
		blurBitmap = new Bitmap[allAnimal];
		
		Log.i("Get Animal Count", String.valueOf(getAnimalData.getCountAllAnimal()));
		
		// Initialise the TabHost
		
		this.initialiseTabHost(savedInstanceState);
		tf_th = Typeface.createFromAsset(getAssets(), "fonts/thai.ttf");
		tf_en = Typeface.createFromAsset(getAssets(), "fonts/quicksand.ttf");
		
		if (savedInstanceState != null) {
			mTabHost.setCurrentTabByTag(savedInstanceState.getString("tab")); // set
		}
		// Intialise ViewPager

		this.intialiseViewPager();
		
		int titleId = 0;
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			titleId = getResources().getIdentifier("action_bar_title", "id",
					"android");
		} else {
			// This is the id is from your app's generated R class when
			// ActionBarActivity is used for SupportActionBar

			// titleId = android.R.id.action_bar_title;
		}

		if (titleId > 0) {
			// Do whatever you want ? It will work for all the versions.

			// 1. Customize your fonts
			// 2. Infact, customize your whole title TextView

			titleView = (TextView) findViewById(titleId);
			titleView.setText(getResources().getString(R.string.app_name)+" [ "+allAnimalCatch+"/"+allAnimal+" ]");
//			titleView.setTextSize(getResources()
//					.getDimension(R.dimen.set_list_view_text_size));
			titleView.setTextColor(getResources().getColor(
					R.color.black));
			titleView.setTypeface(tf_en);
			titleView.setTextSize(pxToDp((int)getResources().getDimension(R.dimen.set_title_text_size)));
			
			
		}
		
	}

	/*   */

	
	/**
	 * (non-Javadoc)
	 * 
	 * @see android.support.v4.app.FragmentActivity#onSaveInstanceState(android.os.Bundle)
	 */
	protected void onSaveInstanceState(Bundle outState) {
		outState.putString("tab", mTabHost.getCurrentTabTag()); // save the tab
																// selected
		super.onSaveInstanceState(outState);
	}

	/**
	 * Initialise ViewPager
	 */
	private void intialiseViewPager() {

		fragments = new Vector<Fragment>();
		fragments
				.add(Fragment.instantiate(this, AnimalMapView.class.getName()));
		fragments
				.add(Fragment.instantiate(this, AnimalListView.class.getName()));
		this.mPagerAdapter = new PagerAdapter(
				super.getSupportFragmentManager(), fragments);
		//
		this.mViewPager = (ViewPager) super.findViewById(R.id.viewpager);
		this.mViewPager.setAdapter(this.mPagerAdapter);
		this.mViewPager.setOnPageChangeListener(this);
		
	}

	/**
	 * Initialise the Tab Host
	 */
	private void initialiseTabHost(Bundle args) {
		mTabHost = (TabHost) findViewById(android.R.id.tabhost);
		mTabHost.setup();
		TabInfo tabInfo = null;
		MainActivity.AddTab(this, this.mTabHost,
				this.mTabHost.newTabSpec("Tab1").setIndicator("Maps"),
				(tabInfo = new TabInfo("Tab1", AnimalMapView.class, args)));
		this.mapTabInfo.put(tabInfo.tag, tabInfo);
		MainActivity.AddTab(this, this.mTabHost,
				this.mTabHost.newTabSpec("Tab2").setIndicator("List"),
				(tabInfo = new TabInfo("Tab2", AnimalListView.class, args)));
		this.mapTabInfo.put(tabInfo.tag, tabInfo);

		
		mTabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.parseColor("#87d4ae"));
		mTabHost.getTabWidget().getChildAt(1).setBackgroundColor(Color.parseColor("#ffffff"));
		
		int h = pxToDp((int)getResources().getDimension(R.dimen.set_tab_width_height));
        for(int i=0;i<mTabHost.getTabWidget().getChildCount();i++) { 
        	mTabHost.getTabWidget().getChildAt(i).getLayoutParams().height = h;
            TextView tv = (TextView) mTabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title); //Unselected Tabs
            tv.setTextColor(Color.parseColor("#ffffff"));
            tv.setTypeface(tf_en,Typeface.BOLD);
            tv.setTextSize(pxToDp((int)getResources().getDimension(R.dimen.set_tabhost_text_size)));
            txt_host[i] = tv;
        }
        txt_host[1].setTextColor(Color.parseColor("#87d4ae"));
		
		// Default to first tab
		// this.onTabChanged("Tab1");
		//
		mTabHost.setOnTabChangedListener(this);
	}

	/**
	 * Add Tab content to the Tabhost
	 * 
	 * @param activity
	 * @param tabHost
	 * @param tabSpec
	 * @param clss
	 * @param args
	 */
	private static void AddTab(MainActivity activity, TabHost tabHost,
			TabHost.TabSpec tabSpec, TabInfo tabInfo) {
		// Attach a Tab view factory to the spec
		tabSpec.setContent(activity.new TabFactory(activity));
		tabHost.addTab(tabSpec);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see android.widget.TabHost.OnTabChangeListener#onTabChanged(java.lang.String)
	 */
	public void onTabChanged(String tag) {
		// TabInfo newTab = this.mapTabInfo.get(tag);
		int pos = this.mTabHost.getCurrentTab();
		this.mViewPager.setCurrentItem(pos);
		if(tag.equals("Tab1")){
			mTabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.parseColor("#87d4ae"));
			mTabHost.getTabWidget().getChildAt(1).setBackgroundColor(Color.parseColor("#ffffff"));
			txt_host[0].setTextColor(Color.parseColor("#ffffff"));
			txt_host[1].setTextColor(Color.parseColor("#87d4ae"));
		}else if(tag.equals("Tab2")){
			mTabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.parseColor("#ffffff"));
			mTabHost.getTabWidget().getChildAt(1).setBackgroundColor(Color.parseColor("#87d4ae"));
			txt_host[0].setTextColor(Color.parseColor("#87d4ae"));
			txt_host[1].setTextColor(Color.parseColor("#ffffff"));
			
		}
		txt_host[0].setTypeface(tf_en,Typeface.BOLD);
		txt_host[1].setTypeface(tf_en,Typeface.BOLD);
		txt_host[0].setTextSize(pxToDp((int)getResources().getDimension(R.dimen.set_tabhost_text_size)));
		txt_host[0].setTextSize(pxToDp((int)getResources().getDimension(R.dimen.set_tabhost_text_size)));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * android.support.v4.view.ViewPager.OnPageChangeListener#onPageScrolled
	 * (int, float, int)
	 */
	@Override
	public void onPageScrolled(int position, float positionOffset,
			int positionOffsetPixels) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * android.support.v4.view.ViewPager.OnPageChangeListener#onPageSelected
	 * (int)
	 */
	@Override
	public void onPageSelected(int position) {
		// TODO Auto-generated method stub
		this.mTabHost.setCurrentTab(position);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.support.v4.view.ViewPager.OnPageChangeListener#
	 * onPageScrollStateChanged(int)
	 */
	@Override
	public void onPageScrollStateChanged(int state) {
		// TODO Auto-generated method stub

	}
	
	public static int dpToPx(int dp) {
	    DisplayMetrics displayMetrics = mContext.getResources().getDisplayMetrics();
	    int px = Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));       
	    return px;
	}
	
	public static int pxToDp(int px){
	    Resources resources = mContext.getResources();
	    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
	    int dp =   Math.round(px / (displayMetrics.densityDpi / 160f));
	    return dp;
	}

	
}
