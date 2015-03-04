package umb.umb_fisio_movil;

import umb.servicios.WSLogin;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends Activity {

	TextView texto;
	EditText numeroHistoria;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		//inicializar componentes
		texto = (TextView) findViewById(R.id.txtResultado);
		numeroHistoria = (EditText)findViewById(R.id.editText1);
		
	}
	
	public void entrar(boolean p, boolean problemas){
		if(p){
			Intent a = new Intent();
			a.setClass(this, MainActivity.class);
			startActivity(a);
		}
		else{
			String txt;
			if(problemas){
				txt = "Hubo problemas en la conexión";
			}
			else{
				txt= "No se encuentra la historia";
			}
			texto.setText(txt);
		}
	}
	
	public void llamar(View v){
		 
		 WSLogin wslogin = new WSLogin(this);
		 wslogin.execute(numeroHistoria.getText().toString());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
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
