package com.example.demo.service;

import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.example.demo.rest.dto.BybitDTO;
import com.example.demo.rest.dto.Result;

@Service
public class Bybitservice {
	public static String BYBIT_PATH = "https://api.bybit.com/v2/public/tickers";
	public static String symble = "BTCUSDT" ; 
	public static String information = "bid_price";

	public BybitDTO sendGET() throws Exception {
		
		Gson gson = new Gson();
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet get = new HttpGet(BYBIT_PATH);
		CloseableHttpResponse response = client.execute(get);
		String content = IOUtils.toString(response.getEntity().getContent(), "UTF-8");
		
		if (response.getStatusLine().getStatusCode() == 200) {
	
			BybitDTO resdto = gson.fromJson(content, BybitDTO.class);
			return resdto;
		}

		else
			return null;

	}

}
