package tool;

import java.util.ArrayList;

import com.apppi.animalcatching.MainActivity;
import com.apppi.animalcatching.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListViewAdapter extends ArrayAdapter<String>{

	ArrayList<String> object;
	LayoutInflater layoutInflater;
	int[] imageId;
	
	public CustomListViewAdapter(Context context, int textViewId,ArrayList<String> object,int[] imageId) {
		super(context,textViewId,object);

		layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		this.object = object;
		this.imageId = imageId;
		
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		View row = layoutInflater.inflate(R.layout.set_listview_style, parent, false);
		TextView textView = (TextView)row.findViewById(R.id.textView_animal_name);
		textView.setText(object.get(position));
		textView.setTypeface(MainActivity.tf_th);
		ImageView image = (ImageView)row.findViewById(R.id.imageView_animal_icon);
		image.setBackgroundResource(imageId[position]);
		
		return row;
	}
}
