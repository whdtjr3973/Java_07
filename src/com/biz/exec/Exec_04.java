package com.biz.exec;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.exec.service.LeapYearservice;

public class Exec_04 {

	public static void main(String[] args) {
		LeapYearservice lys = new LeapYearservice();
		String leapFile = "src/com/biz/exec/yearlist/leapYearList2.txt";
		
		lys.makeLeapYearList(1900, 3000);
		lys.wirteLeapYearListFile(leapFile);
		
	}
}
