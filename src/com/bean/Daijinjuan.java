package com.bean;

import java.util.Scanner;

public class Daijinjuan {
   public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("������");
	double price=input.nextDouble();
//	String tishi=price*0.8>1000?"�����ȯ200Ԫ":"û�д���ȯ";
//	System.out.println(tishi);
	if(price*0.8>1000) {
		System.out.println("�����ȯ200Ԫ");
	}else {
		System.out.println("û�д���ȯ");
	}
}
}
