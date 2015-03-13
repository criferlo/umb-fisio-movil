package umb.umb_fisio_movil;


import umb.adaptadores.ImageAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Gallery;

public class EducacionPacienteActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_educacion_paciente);
		llenarGaleria();
	}

	private void llenarGaleria() {
		// TODO Auto-generated method stub
		Gallery galeria = (Gallery) findViewById(R.id.gallery1);
		
		ImageAdapter adaptador = new ImageAdapter(getApplicationContext());
		galeria.setAdapter(adaptador);
	}



	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
