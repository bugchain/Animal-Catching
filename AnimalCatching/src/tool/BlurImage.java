package tool;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;

public class BlurImage {

	public Bitmap getBlurBitmap(Bitmap src,int blur) {
		  
		  final int widthKernal = blur;
		  final int heightKernal = blur;

		  int w = src.getWidth();
		  int h = src.getHeight();

		  Bitmap blurBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);

		  for (int x = 0; x < w; x++) {
		   for (int y = 0; y < h; y++) {

		    int r = 0;
		    int g = 0;
		    int b = 0;
		    int a = 0;
		    
		    for (int xk = 0; xk < widthKernal; xk++) {
		     for (int yk = 0; yk < heightKernal; yk++) {
		      int px = x + xk -2;
		      int py = y + yk -2;

		      if(px < 0){
		       px = 0;
		      }else if(px >= w){
		       px = w-1;
		      }
		      
		      if(py < 0){
		       py = 0;
		      }else if(py >= h){
		       py = h-1;
		      }
		      
		      int intColor = src.getPixel(px, py);
		      r += Color.red(intColor);
		      g += Color.green(intColor);
		      b += Color.blue(intColor);
		      a += Color.alpha(intColor);
		      
		     }
		    }
		    
		    blurBitmap.setPixel(x, y, Color.argb(a/25, r/25, g/25, b/25));

		   }
		  }

		  return blurBitmap;
		 }
	public Bitmap addWhiteBorder(Bitmap bmp, int borderSize) {
	    Bitmap bmpWithBorder = Bitmap.createBitmap(bmp.getWidth() + borderSize * 2, bmp.getHeight() + borderSize * 2, bmp.getConfig());
	    Canvas canvas = new Canvas(bmpWithBorder);
	    canvas.drawColor(Color.BLACK);
	    canvas.drawBitmap(bmp, borderSize, borderSize, null);
	    return bmpWithBorder;
	}
}
