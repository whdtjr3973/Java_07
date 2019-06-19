package com.biz.exec;

import java.util.Scanner;

public class Exec_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("년도입력 >>");

		String strYear = scan.nextLine();
		int intYear = Integer.valueOf(strYear);

		if ((intYear % 4 == 0) && (intYear % 100 != 0) || (intYear % 400 == 0)) {
			System.out.println(intYear + "년은 윤년입니다.");
		} else {
			System.out.println(intYear + "년은 평년입니다.");
		}

//		if (intYear % 4 == 0) {
//			System.out.println(intYear + "1차 후보");
//			if (intYear % 100 != 0 || intYear % 400 == 0) {
//				System.out.println(intYear + "2차 후보");
//			}
//		}
//		if (intYear % 4 == 0) {
//			if (intYear % 4 == 0 && intYear % 100 != 0) {
//
//			} else if (intYear % 4 == 0 && intYear % 400 == 0) {
//
//			}
//		}
	}

}