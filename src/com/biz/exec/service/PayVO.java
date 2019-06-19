package com.biz.exec.service;

public class PayVO {

	int Money; // 액면가
	int Pay;
	int Paper; // 액면/ 지폐
	
	
	
	public PayVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PayVO(int money, int pay, int paper) {
		super();
		Money = money;
		Pay = pay;
		Paper = paper;
	}
	public int getMoney() {
		return Money;
	}
	public void setMoney(int money) {
		Money = money;
	}
	public int getPay() {
		return Pay;
	}
	public void setPay(int pay) {
		Pay = pay;
	}
	public int getPaper() {
		return Paper;
	}
	public void setPaper(int paper) {
		Paper = paper;
	}
	
}
