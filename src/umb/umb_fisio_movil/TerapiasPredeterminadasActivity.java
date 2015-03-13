package umb.umb_fisio_movil;

import umb.adaptadores.ImageAdapter;
import umb.adaptadores.ImageTerapiaAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Gallery;

public class TerapiasPredeterminadasActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_terapias_predeterminadas);
		llenarGaleria();
	}
	
	private void llenarGaleria() {
		// TODO Auto-generated method stub
		Gallery galeria = (Gallery) findViewById(R.id.gallery2);
		
		ImageTerapiaAdapter adaptador = new ImageTerapiaAdapter(getApplicationContext());
		galeria.setAdapter(adaptador);
	}
}
