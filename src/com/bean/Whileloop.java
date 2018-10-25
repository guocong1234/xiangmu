package com.bean;

import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
    	Scanner input=new Scanner(System.in);
//		int i=1;
//		do {
//			System.out.println("输出了第"+i+"遍");
//			i++;
//		}while(i<=100);
    	System.out.print("请输入姓名");
    	String name=input.next();
    	int score=0;
		
		for(int i=1;i<=5;i++) {
			System.out.print("输出了第"+i+"门成绩");
			int num=input.nextInt();
			score=score+num;
			
		}
		double avg=score/5.0;
		System.out.println(avg);
			
			
	
		
	}
}
