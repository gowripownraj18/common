package day2;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		 
	           
	 
	            int sqrt = (int) Math.sqrt(number);
	            if (sqrt * sqrt == number) {
	                System.out.println("this is the perfect square "+number+ " = "+sqrt+"*"+sqrt);
	            } 
	            else {
	            	 System.out.println("this is not perfect square ");
	            }
	        }

	}


