package com.biz.exec;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Self {

	public static void main(String[] args) throws IOException {
		List<Integer> yearList = new ArrayList<Integer>();
		String leapYear = "src/com/biz/exec/yearlist/leapYearList.txt";
		FileWriter fileWriter = new FileWriter(leapYear);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		
		for (int i = 1500; i < 3001; i++) {
			if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)) {
				yearList.add(i);
			}
		}
		
		
		System.out.println(yearList.toString());
		
		for(Integer i : yearList ) {
			printWriter.printf("%d\n", i);
		}
		
		printWriter.flush();
		printWriter.close();
		
		
	}
}
