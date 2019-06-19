package com.biz.exec.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class payMentService {

	
	List<PayVO> pList ;
	Scanner scan ;
	FileWriter fileWriter ;
	PrintWriter printWriter;
	
	public payMentService() {
		pList = new ArrayList<PayVO>();
		scan = new Scanner(System.in);
		
	}

	public void makePay() {
		System.out.print("급여액을 입력하세요");
		String strPay = scan.nextLine();
		int intPay = Integer.valueOf(strPay);
		
		int intMoney = 50000;
		
		
		int paper = 0;
		int count = 0;
		
		
		while(intPay > 5 ) {
			
			PayVO  pVO = new PayVO();
			pVO.setMoney(intMoney);
			pVO.setPay(intPay);
			 paper = (int)(intPay /intMoney); 
			
			System.out.println(intMoney+ "\t\t"+ paper);
					
			
			// 액면가 * 매수만큼 제외
			intPay -= paper * intMoney;
			
			
			if(count++ % 2 ==0) 	intMoney = intMoney / 5;
			else intMoney = intMoney / 2;
			

			
			pVO.setPaper(paper);
			pList.add(pVO);
			
		}
		
	}
	
	public void fileWriterPay(String payName) throws IOException {
		fileWriter = new FileWriter(payName);
		printWriter = new PrintWriter(fileWriter);
		PayVO pVO = new PayVO();
		int index = 0;
		printWriter.println("======================");
		printWriter.println("총 급여액 : " + pList.get(index).getPay()+  "원" );
		printWriter.println("----------------------");
		printWriter.println("액면가\t\t매수");
		printWriter.println("----------------------");
		for(PayVO pvo : pList) {
			printWriter.printf("%d\t\t%d\n", pvo.getMoney(),pvo.getPaper());
		}
		
		
		printWriter.flush();
		printWriter.close();
		
		
	}
	
		
}
