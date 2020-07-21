package com.example.demo.service;

import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.example.demo.rest.dto.BybitPriceDTO;
import com.example.demo.rest.dto.BybitTimeDTO;

@Service
public class Bybitservice {
	public static String BYBIT_PATH_PRICE = "https://api.bybit.com/v2/public/tickers";
	public static String BYBIT_PATH_TIMESTAMP = "https://api-testnet.bybit.com/v2/public/time";


	public BybitPriceDTO sendGET() throws Exception {

		Gson gson = new Gson();
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet get = new HttpGet(BYBIT_PATH_PRICE);
		CloseableHttpResponse response = client.execute(get);
		String content = IOUtils.toString(response.getEntity().getContent(), "UTF-8");
		if (response.getStatusLine().getStatusCode() == 200) {

			BybitPriceDTO resdto = gson.fromJson(content, BybitPriceDTO.class);
			return resdto;
		}

		else
			return null;

	}

	public String getTimestemp() throws Exception {
		Gson gson = new Gson();
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet get = new HttpGet(BYBIT_PATH_TIMESTAMP);
		CloseableHttpResponse response = client.execute(get);
		String content = IOUtils.toString(response.getEntity().getContent(), "UTF-8");
		if (response.getStatusLine().getStatusCode() == 200) {

			BybitTimeDTO timeDTO = gson.fromJson(content, BybitTimeDTO.class);
			String time = timeDTO.getTime_now();
			String a=time.substring(0,10);
			String b=time.substring(11,14);
			System.out.println(time);
			System.out.println(a);
			System.out.println(b);
			time = a+b;
			return time;
		} else
			return null;
	}

	public static String authen(String time, String sign) throws Exception {
		CloseableHttpClient client = HttpClients.createDefault();
		StringBuilder sb = new StringBuilder();
		sb.append("http://api-testnet.bybit.com/user/leverage?api_key=tLQz4dYfK74DF3Nzal&timestamp=" + time+ "&sign=" +sign);
		System.out.println(sb.toString());
		HttpGet get = new HttpGet(sb.toString());
		CloseableHttpResponse response = client.execute(get);
		String content = IOUtils.toString(response.getEntity().getContent(), "UTF-8");
		return content;
	}

}
