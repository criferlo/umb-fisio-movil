package umb.servicios;

import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import umb.umb_fisio_movil.LoginActivity;
import android.os.AsyncTask;

public class WSLogin extends AsyncTask<String,String,String> {

	private LoginActivity miActivity;

	public WSLogin(LoginActivity act) {
		this.miActivity = act;
	}

	@Override
	protected void onPostExecute(String result) {
		if(result.equals("fracaso")){
			miActivity.entrar(false,true);
		}
		if(result.equals("exitoso-sin-resultados")){
			miActivity.entrar(false,false);
		}
		if(result.equals("exitoso-con-resultados")){
			miActivity.entrar(true,false);
		}
		
	}

	@Override
	protected String doInBackground(String... params) {
		String resx = "";

		try {
			HttpClient httpClient = new DefaultHttpClient();
			String ruta = "http://162.243.173.93:8081/umb-fisio-web/api/sesionmovil/login/"+params[0]+"";

			HttpGet get = new HttpGet(ruta);
			get.setHeader("content-type", "application/json");

			HttpResponse res = httpClient.execute(get);// envia el pedido al
														// servidor
			String respStr = EntityUtils.toString(res.getEntity());
			
			//JSONObject 
			
			JSONObject resj = new JSONObject(respStr);
			String estado = (String) resj.get("estado");

			resx = estado;
		} catch (Exception ex) {
			resx = "fracaso";
		}

		return resx;
	}

}
