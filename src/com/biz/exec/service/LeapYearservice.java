package com.biz.exec.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class LeapYearservice {
	
	List<Integer> leapYearList;
	
	public LeapYearservice() {
		leapYearList = new ArrayList<Integer>();
	}

	public void makeLeapYearList(int startYear, int endYear) {
		for(int year = startYear ; year <=endYear; year++) {
			if(year %4 ==0 && year % 100 != 0 || year %400 == 0){
				leapYearList.add(year);
			}
		}
		System.out.println("윤년 개수 :" + leapYearList.size());
		System.out.println("윤년 리스트를 만들었습니다.");
	}
	public void wirteLeapYearListFile(String leapFileName) {
		FileWriter fileWriter = null ;
		PrintWriter printWriter = null ;
		
		try {
			fileWriter = new FileWriter(leapFileName);
			printWriter = new PrintWriter(fileWriter);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int year : leapYearList) {
			printWriter.println(year +"년");
		}
		printWriter.flush();
		printWriter.close();
		
		System.out.println("파일 저장완료!");
	}

}
