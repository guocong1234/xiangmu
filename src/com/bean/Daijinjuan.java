package com.bean;

import java.util.Scanner;

public class Daijinjuan {
   public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("输入金额");
	double price=input.nextDouble();
//	String tishi=price*0.8>1000?"领代金券200元":"没有代金券";
//	System.out.println(tishi);
	if(price*0.8>1000) {
		System.out.println("领代金券200元");
	}else {
		System.out.println("没有代金券");
	}
}
}
