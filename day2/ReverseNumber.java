package day2;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		 int reversed = 0;
		    
		    System.out.println("Original Number: " + number);

		  
		    while(number != 0) {
		    
		     
		      int digit = number % 10;
		      reversed = reversed * 10 + digit;

		     
		      number /= 10;
		    }

		    System.out.println("Reversed Number: " + reversed);

	}

}
