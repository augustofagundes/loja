package br.com.alura.loja.http;

import java.util.Map;

public interface HttpAdapter {
	
	void enviar(String url, Map<String, Object> dados);

}
