package com.apppi.animalcatching;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class AnimalSplashScreen extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.animal_splash_screen);
        
       Handler handler = new Handler();
       handler.postDelayed(new Runnable(){
		@Override
		public void run() {
			Intent intent = new Intent(getApplicationContext(),MainActivity.class);
			startActivity(intent);
			finish();
		}},1000);
        
    }
}
