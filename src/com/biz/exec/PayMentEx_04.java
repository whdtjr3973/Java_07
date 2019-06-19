package com.biz.exec;

import java.io.IOException;

import com.biz.exec.service.payMentService;

public class PayMentEx_04 {
	public static void main(String[] args) throws IOException {
		
		payMentService pm = new payMentService();
		String payFile = "src/com/biz/exec/yearlist/Pay.txt/";
		
		pm.makePay();
		pm.fileWriterPay(payFile);
		
	}
}
