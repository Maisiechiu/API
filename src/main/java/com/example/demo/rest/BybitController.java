package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.rest.dto.BybitDTO;
import com.example.demo.rest.dto.Result;
import com.example.demo.service.Bybitservice;

@RestController
@RequestMapping("/bybit")

public class BybitController {
	@Autowired
	private Bybitservice bybitservice;

	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> getinfo() {
		try {
			BybitDTO bybit = new BybitDTO();
			bybit = bybitservice.sendGET();
			Result BTCUSDT = new Result();

			for (Result R : bybit.getResult()) {
				if (R.getSymbol().equals("BTCUSDT")) {
					BTCUSDT.setBid_price(R.getBid_price());
				}

			}
			System.out.println(BTCUSDT.getBid_price());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(BTCUSDT.getBid_price());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("fault");

		}

	}
}
