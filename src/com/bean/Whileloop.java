package com.bean;

import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
    	Scanner input=new Scanner(System.in);
//		int i=1;
//		do {
//			System.out.println("����˵�"+i+"��");
//			i++;
//		}while(i<=100);
    	System.out.print("����������");
    	String name=input.next();
    	int score=0;
		
		for(int i=1;i<=5;i++) {
			System.out.print("����˵�"+i+"�ųɼ�");
			int num=input.nextInt();
			score=score+num;
			
		}
		double avg=score/5.0;
		System.out.println(avg);
			
			
	
		
	}
}
