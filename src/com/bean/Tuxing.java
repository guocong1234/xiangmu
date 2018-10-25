package com.bean;

import java.util.Scanner;

public class Tuxing {
      public static void main(String[] args) {
//    	  正方形
//		for (int i = 0; i <6; i++) {
//			for (int j = 0; j <6; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//    	  菱形
//    	  for (int i = 0; i < 5; i++) {
//			for (int j = 0; j <5-i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j <5 ; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//    		for (int i = 1; i <= 5; i++) {
//    			for(int j=1;j<=5-i;j++){
//    				System.out.print(" ");
//    			}
//    			//内层循环，执行五次，每次输出一个*
//    			for (int j = 1;j<=2*i-1;j++){
//    				System.out.print("*");
//    			}
//    			
//    			System.out.println();
//    		}
//    	  乘法表
    	  
    	  for (int i = 1; i <=9; i++) {
			  for (int j=1;j<=i; j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"  ");
			}
			  System.out.println("");
		}
    	
//    	  int[] d=new int[5];
//    	  d[0]=89;
//    	  d[1]=79;
//    	  d[2]=69;
//    	  d[3]=49;
//    	  
//    	  Scanner input=new Scanner(System.in);
//    	  System.out.println("请输入学生成绩");
//    	  int num=input.nextInt();
//    	  int index=d.length-1;
//    	  for (int i = 0; i < d.length-1; i++) {
//			  if(num>d[i]) {
//				  index=i;
//				  break;
//			  }
//		}
//    	  for (int i =d.length-1 ; i >=index ; i--) {
//			 d[i]=d[i-1];
//		}
//    	  d[index]=num;
//    	  for (int i = 0; i < d.length; i++) {
//			System.out.println(d[i]);
//		}
    	  
    	  
	}
}
