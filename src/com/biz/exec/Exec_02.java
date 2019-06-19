package com.biz.exec;

import java.util.Random;

public class Exec_02 {

	public static void main(String[] args) {

		/*
		 * 비교판단문 어떤결과가 true, false를 판단해서 코드의 흐름을 변경하는것
		 */

		Random rnd = new Random();

//		while (true) {

			int intR = rnd.nextInt(100);
			int intNum = intR % 5;
			/*
			 * intNum에 담겨있는 값이
			 * 어떤 경우 (case)에 해당하느냐를 판단해서
			 * case문 아래의 코드를 실행한다.
			 * 
			 * 어떤 경우에 해당하는 경우를 모두 실행하면
			 * 다음번 case문을 만나기전에 반드시 break문을 실행시켜야한다.
			 */
			switch (intNum) {
			// switch문 내에서 case의 값은 중복된 값이 들어갈수 없다.
			case 0:
				System.out.println("나머지가 0");
//				break;

			case 1:
				System.out.println("나머지가 1");
//				break;
				
			case 2:
				System.out.println("나머지가 2");
//				break;
				
			case 3:
				System.out.println("나머지가 3");
//				break;
				
			case 4:
				System.out.println("나머지가 4");
//				break;
				
			default:
				System.out.println("이외의 값");
				break;
			}
		}

	}

//}
