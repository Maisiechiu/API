package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.rest.dto.BybitPriceDTO;
import com.example.demo.rest.dto.BybitTimeDTO;
import com.example.demo.rest.dto.Result;
import com.example.demo.service.Bybitservice;
import com.example.demo.bybitsignature.Encryption;

@RestController
@RequestMapping("/bybit")

public class BybitController {
	@Autowired
	private Bybitservice bybitservice;

	@RequestMapping(value = "/price", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> getinprice() {
		try {
			BybitPriceDTO bybit = new BybitPriceDTO();
			bybit = bybitservice.sendGET();
			Result BTCUSDT = new Result();

			for (Result R : bybit.getResult()) {
				if (R.getSymbol().equals("BTCUSDT")) {
					BTCUSDT.setBid_price(R.getBid_price());
				}

			}

			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(BTCUSDT.getBid_price());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("fault");

		}

	}

	@RequestMapping(value = "/authentication", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> getaccountinfo() {
		try {

			String time = bybitservice.getTimestemp();
			String signature = Encryption.getsign(time);
			System.out.println(time);
			System.out.println(signature);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Bybitservice.authen(time,signature));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("fault1");

		}
	}
}
