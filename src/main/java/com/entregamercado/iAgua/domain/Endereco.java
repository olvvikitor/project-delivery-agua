package com.entregamercado.iAgua.domain;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "endereco")
public class Endereco {

	@Id
	private String id;
	private String cep;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	private String numero;
	
	@DBRef
	private Client client;

	public Endereco(String cep, String numero) {
		this.cep = cep;
		consultarViaCEP();
		this.numero = numero;
	}

	private void consultarViaCEP() {
		try {
			URL url = new URL("https://viacep.com.br/ws/" + cep + "/json/");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");

			int responseCode = connection.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				StringBuilder response = new StringBuilder();
				String inputLine;

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();
				JSONObject dados = new JSONObject(response.toString());

				logradouro = dados.getString("logradouro");
				bairro = dados.getString("bairro");
				cidade = dados.getString("localidade");
				estado = dados.getString("uf");

			} else {
				System.out.println("Requisição falhou. Código de resposta: " + responseCode);
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
}
