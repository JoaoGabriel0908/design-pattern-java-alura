package br.com.alura.loja.http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

//Código de implementação para requisitar uma API por meio de um código HTTP
public class JavaHttpClient implements HttpAdapter{

	@Override
	public void post(String url, Map<String, Object> dados) {
		
		try {
			URL urlDaApi = new URL(url);
			URLConnection openConnection = urlDaApi.openConnection();
			openConnection.connect();
		} catch (Exception e) {
			throw new RuntimeException("Erro ao enviar requisição http", e);
		}
		
	}

}
