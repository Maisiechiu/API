package com.example.demo.rest.dto;


public class Result {
	
		private String symbol;
		private String bid_price;
		private String ask_price;
		private String last_price;
		private String last_tick_direction;
		private String prev_price_24h;
		private String price_24h_pcnt;
		private String high_price_24h;
		private String low_price_24h;
		private String prev_price_1h;
		private String price_1h_pcnt;
		private String mark_price;
		private String index_price;
		private String open_interest;
		private String open_value;
		private String total_turnover;
		private String turnover_24h;
		private String total_volume;
		private String volume_24h;
		private String funding_rate;
		private String predicted_funding_rate;
		private String next_funding_time;
		private String countdown_hour;
		
		public Result() {

		}
		public static Result createDTO() {
			Result dto = new Result();
			return dto;
		}

		public String getIndex_price() {
			return index_price;
		}

		public void setIndex_price(String index_price) {
			this.index_price = index_price;
		}

		public String getSymbol() {
			return symbol;
		}

		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}

		public String getBid_price() {
			return bid_price;
		}

		public void setBid_price(String bid_price) {
			this.bid_price = bid_price;
		}

		public String getAsk_price() {
			return ask_price;
		}

		public void setAsk_price(String ask_price) {
			this.ask_price = ask_price;
		}

		public String getLast_price() {
			return last_price;
		}

		public void setLast_price(String last_price) {
			this.last_price = last_price;
		}

		public String getLast_tick_direction() {
			return last_tick_direction;
		}

		public void setLast_tick_direction(String last_tick_direction) {
			this.last_tick_direction = last_tick_direction;
		}

		public String getPrev_price_24h() {
			return prev_price_24h;
		}

		public void setPrev_price_24h(String prev_price_24h) {
			this.prev_price_24h = prev_price_24h;
		}

		public String getPrice_24h_pcnt() {
			return price_24h_pcnt;
		}

		public void setPrice_24h_pcnt(String price_24h_pcnt) {
			this.price_24h_pcnt = price_24h_pcnt;
		}

		public String getHigh_price_24h() {
			return high_price_24h;
		}

		public void setHigh_price_24h(String high_price_24h) {
			this.high_price_24h = high_price_24h;
		}

		public String getLow_price_24h() {
			return low_price_24h;
		}

		public void setLow_price_24h(String low_price_24h) {
			this.low_price_24h = low_price_24h;
		}

		public String getPrev_price_1h() {
			return prev_price_1h;
		}

		public void setPrev_price_1h(String prev_price_1h) {
			this.prev_price_1h = prev_price_1h;
		}

		public String getPrice_1h_pcnt() {
			return price_1h_pcnt;
		}

		public void setPrice_1h_pcnt(String price_1h_pcnt) {
			this.price_1h_pcnt = price_1h_pcnt;
		}

		public String getMark_price() {
			return mark_price;
		}

		public void setMark_price(String mark_price) {
			this.mark_price = mark_price;
		}

		public String getOpen_interest() {
			return open_interest;
		}

		public void setOpen_interest(String open_interest) {
			this.open_interest = open_interest;
		}

		public String getOpen_value() {
			return open_value;
		}

		public void setOpen_value(String open_value) {
			this.open_value = open_value;
		}

		public String getTotal_turnover() {
			return total_turnover;
		}

		public void setTotal_turnover(String total_turnover) {
			this.total_turnover = total_turnover;
		}

		public String getTurnover_24h() {
			return turnover_24h;
		}

		public void setTurnover_24h(String turnover_24h) {
			this.turnover_24h = turnover_24h;
		}

		public String getTotal_volume() {
			return total_volume;
		}

		public void setTotal_volume(String total_volume) {
			this.total_volume = total_volume;
		}

		public String getVolume_24h() {
			return volume_24h;
		}

		public void setVolume_24h(String volume_24h) {
			this.volume_24h = volume_24h;
		}

		public String getFunding_rate() {
			return funding_rate;
		}

		public void setFunding_rate(String funding_rate) {
			this.funding_rate = funding_rate;
		}

		public String getPredicted_funding_rate() {
			return predicted_funding_rate;
		}

		public void setPredicted_funding_rate(String predicted_funding_rate) {
			this.predicted_funding_rate = predicted_funding_rate;
		}

		public String getNext_funding_time() {
			return next_funding_time;
		}

		public void setNext_funding_time(String next_funding_time) {
			this.next_funding_time = next_funding_time;
		}

		public String getCountdown_hour() {
			return countdown_hour;
		}

		public void setCountdown_hour(String countdown_hour) {
			this.countdown_hour = countdown_hour;
		}
		
	}

