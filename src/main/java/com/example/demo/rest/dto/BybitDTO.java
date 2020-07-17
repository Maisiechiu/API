package com.example.demo.rest.dto;

public class BybitDTO {
         private String ret_code;
         private String ret_msg;
         private String ext_code;
         private String ext_info;
         private Result[] result;
         private String time_now;
		public String getRet_code() {
			return ret_code;
		}
		public void setRet_code(String ret_code) {
			this.ret_code = ret_code;
		}
		public String getRet_msg() {
			return ret_msg;
		}
		public void setRet_msg(String ret_msg) {
			this.ret_msg = ret_msg;
		}
		public String getExt_code() {
			return ext_code;
		}
		public void setExt_code(String ext_code) {
			this.ext_code = ext_code;
		}
		public String getExt_info() {
			return ext_info;
		}
		public void setExt_info(String ext_info) {
			this.ext_info = ext_info;
		}
		public Result[] getResult() {
			return result;
		}
		public void setResult(Result[] result) {
			this.result = result;
		}
		public String getTime_now() {
			return time_now;
		}
		public void setTime_now(String time_now) {
			this.time_now = time_now;
		}

}
