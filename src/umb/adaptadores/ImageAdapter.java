package umb.adaptadores;

import umb.umb_fisio_movil.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ImageAdapter extends BaseAdapter{

	Context miContexto;
	Integer[] imgIds = 	{
			
			R.drawable.evitteescaleras,
			R.drawable.evitteescaleras2,
			R.drawable.medidasposturales,
			R.drawable.posturasdepie,
			R.drawable.carro,
			R.drawable.buenaalimentacion1,
			R.drawable.buenaalimentacion2,
			R.drawable.buenaalimentacion3,
			R.drawable.buenaalimentacion4,
			
	};
	
	public ImageAdapter(Context con){
		miContexto=con;
	}
	
	@Override
	public int getCount() {
		return imgIds.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return imgIds[arg0];
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return imgIds[arg0];
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		
		ImageView vista = new ImageView(miContexto);
		vista.setImageResource(imgIds[arg0]);
		
		return vista;
		
	}

}
