package com.apppi.animalcatching;


import tool.BlurImage;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AnimalDetail extends Activity {

	private String nameTh, nameEn, nameSci, detail, bg, type,place_bg;
	private TextView txt_nameTh, txt_nameEn, txt_nameSci,  txt_star,
			txt_heart, txt_money, txt_pet, txt_eat, txt_plane, txt_hunt,txt_en_title,
			txt_sci_title;
	private ImageView image,place_header_bg;
	private WebView txt_detail;
	private LinearLayout[] linType;
	
	BlurImage blurImage;

    String pas = "</body></html>";

	String pish = ""+
	"<html>"+
    "<head>"+
        "<meta http-equiv=\"content-type\" content=\"text/html;\" charset=\"UTF-8\">"+
            "<style>"+
            /** Specify a font named "MyFont",
            and specify the URL where it can be found: */
           " @font-face {"+
                "font-family: \"MyFont\";"+
                "src: url('file:///android_asset/fonts/thai.ttf');"+
            "}"+
            "{ font-family:\"MyFont\"}"+
            "</style>"+
   " </head>"+
   " <body>";
    

    
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.animal_detail);
		blurImage = new BlurImage();
		
		viewMatching();
		getIntentData();
		setAnimalType();
		

	}

	private void viewMatching() {
		txt_nameTh = (TextView) findViewById(R.id.text_name_th);
		txt_nameEn = (TextView) findViewById(R.id.text_name_en);
		txt_nameSci = (TextView) findViewById(R.id.text_name_sci);
		txt_detail = (WebView) findViewById(R.id.text_animal_detail);
		
		image = (ImageView) findViewById(R.id.image_animal);
		place_header_bg = (ImageView) findViewById(R.id.detail_header);
		
		txt_star = (TextView) findViewById(R.id.text_start);
		txt_heart = (TextView) findViewById(R.id.text_heart);
		txt_money = (TextView) findViewById(R.id.text_money);
		txt_pet = (TextView) findViewById(R.id.text_pet);
		txt_eat = (TextView) findViewById(R.id.text_eat);
		txt_plane = (TextView) findViewById(R.id.text_plane);
		txt_hunt = (TextView) findViewById(R.id.text_hunt);

		txt_en_title = (TextView) findViewById(R.id.text_name_en_title);
		txt_sci_title = (TextView) findViewById(R.id.text_name_sci_title);

		txt_en_title.setText("ชื่ออังกฤษ");
		txt_en_title.setTypeface(MainActivity.tf_th);
		txt_en_title.setTextSize(MainActivity.pxToDp((int) getResources()
				.getDimension(R.dimen.text_size_animal_detail)));
		txt_sci_title.setText("ชื่อวิทยาศาสตร์");
		txt_sci_title.setTypeface(MainActivity.tf_th);
		txt_sci_title.setTextSize(MainActivity.pxToDp((int) getResources()
				.getDimension(R.dimen.text_size_animal_detail)));

		txt_star.setText("สัตว์สงวน");
		txt_star.setTypeface(MainActivity.tf_th);
		txt_star.setTextSize(MainActivity.pxToDp((int) getResources()
				.getDimension(R.dimen.text_size_animal_detail)));

		txt_heart.setText("สัตว์หายาก");
		txt_heart.setTypeface(MainActivity.tf_th);
		txt_heart.setTextSize(MainActivity.pxToDp((int) getResources()
				.getDimension(R.dimen.text_size_animal_detail)));

		txt_money.setText("สัตว์เศรษฐกิจ");
		txt_money.setTypeface(MainActivity.tf_th);
		txt_money.setTextSize(MainActivity.pxToDp((int) getResources()
				.getDimension(R.dimen.text_size_animal_detail)));

		txt_pet.setText("สัตว์เลี้ยง");
		txt_pet.setTypeface(MainActivity.tf_th);
		txt_pet.setTextSize(MainActivity.pxToDp((int) getResources()
				.getDimension(R.dimen.text_size_animal_detail)));

		txt_eat.setText("สัตว์บริโภค");
		txt_eat.setTypeface(MainActivity.tf_th);
		txt_eat.setTextSize(MainActivity.pxToDp((int) getResources()
				.getDimension(R.dimen.text_size_animal_detail)));

		txt_plane.setText("สัตว์ส่งออก");
		txt_plane.setTypeface(MainActivity.tf_th);
		txt_plane.setTextSize(MainActivity.pxToDp((int) getResources()
				.getDimension(R.dimen.text_size_animal_detail)));
		
		txt_hunt.setText("สัตว์ถูกล่า");
		txt_hunt.setTypeface(MainActivity.tf_th);
		txt_hunt.setTextSize(MainActivity.pxToDp((int) getResources()
				.getDimension(R.dimen.text_size_animal_detail)));

		linType = new LinearLayout[] {
				(LinearLayout) findViewById(R.id.linear_star),
				(LinearLayout) findViewById(R.id.linear_heart),
				(LinearLayout) findViewById(R.id.linear_money),
				(LinearLayout) findViewById(R.id.linear_pet),
				(LinearLayout) findViewById(R.id.linear_eat),
				(LinearLayout) findViewById(R.id.linear_plane), 
				(LinearLayout) findViewById(R.id.linear_hunt)};
		
	}/* end view matching */

	private void getIntentData() {
		Intent intent = getIntent();
		nameTh = intent.getStringExtra("nameTh");
		nameEn = intent.getStringExtra("nameEn");
		nameSci = intent.getStringExtra("nameSci");
		detail = intent.getStringExtra("detail");
		bg = intent.getStringExtra("background");
		type = intent.getStringExtra("type");
		place_bg = intent.getStringExtra("place_bg");
		Log.i("Place bg", place_bg);
		
		/* show animal detail */
		txt_nameTh.setText("\t\t" + nameTh);
		txt_nameTh.setTypeface(MainActivity.tf_th);
		txt_nameTh.setTextSize(MainActivity.pxToDp((int) getResources()
				.getDimension(R.dimen.text_size_name_th)));
		txt_nameTh.setTypeface(Typeface.DEFAULT_BOLD);

		txt_nameEn.setText("\t\t" + nameEn);
		txt_nameEn.setTypeface(MainActivity.tf_en);
		txt_nameEn.setTextSize(MainActivity.pxToDp((int) getResources()
				.getDimension(R.dimen.text_size_name_en)));

		txt_nameSci.setText("\t\t" + nameSci);
		txt_nameSci.setTypeface(MainActivity.tf_en);
		txt_nameSci.setTextSize(MainActivity.pxToDp((int) getResources()
				.getDimension(R.dimen.text_size_name_sci)));

		
		
//		String head = "<head><style>@font-face {font-family: 'verdana';src: url('file:///android_asset/fonts/thai.ttf');}body {font-family: 'verdana';}</style></head>";
//		String htmlData= "<html>"+head+"<body style=\"font-family: verdana\">"+detail+"</body></html>" ;

//		txt_detail.loadDataWithBaseURL("http://nada", htmlData,
//		                "text/html", "utf-8", "");
//		
		String myHtmlString = pish + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+detail + pas;
//	
		txt_detail.loadData(myHtmlString, "text/html; charset=utf-8", "utf-8");
		txt_detail.setBackgroundColor(Color.parseColor("#f8f2e4"));
//	      
//		txt_detail.setText("\t\t" + detail);
//		txt_detail.setTypeface(MainActivity.tf_th);
//		txt_detail.setTextSize(MainActivity.pxToDp((int) getResources()
//				.getDimension(R.dimen.text_size_animal_detail)));

		  WebSettings webSettings = txt_detail.getSettings();
	       webSettings.setDefaultFontSize(MainActivity.pxToDp((int) getResources()
					.getDimension(R.dimen.text_size_animal_detail_webview)));
	      
//	       txt_detail.loadUrl("file:///android_asset/demo.html");
//		txt_detail.loadDataWithBaseURL("file:///android_asset/demo.html", myHtmlString,  "text/html", "utf-8", "");
	       
		if (bg != null) {
			image.setImageResource(getResources().getIdentifier(bg, "drawable",
					MainActivity.mContext.getPackageName()));
		}
		if (place_header_bg != null) {
			place_header_bg.setImageResource(getResources().getIdentifier(place_bg, "drawable",
						MainActivity.mContext.getPackageName()));
				

		}
	}/* end get data */

	private void setAnimalType() {
		for (int i = 0; i < type.length(); i++) {
			String j = type.substring(i, i + 1);
			if (j.equals("1")) {
				linType[i].setVisibility(View.VISIBLE);
			} else {
				linType[i].setVisibility(View.GONE);
			}
		}
	}/* end setanimal type */

}/* end of class */