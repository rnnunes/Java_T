package entities;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;

public class ServiceCNPJ {

	static String webService = "https://receitaws.com.br/v1/cnpj/";
	static int codigoSucesso = 200;

	public static EntitiesCNPJ bucarCNPJ(String CNPJ) throws Exception {
		String urlChamada = webService + CNPJ;

		try {
			URL url = new URL(urlChamada);
			HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

			if (conexao.getResponseCode() != codigoSucesso)
				throw new RuntimeException("HTTP error code: " + conexao.getResponseCode());

			BufferedReader resp = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
			String jsonString = Util.converteJsonString(resp);

			Gson gson = new Gson();
			EntitiesCNPJ entitiesCnpj = gson.fromJson(jsonString, EntitiesCNPJ.class);

			return entitiesCnpj;
		} catch (Exception e) {
			throw new Exception("ERRO: " + e);
		}

	}
}
