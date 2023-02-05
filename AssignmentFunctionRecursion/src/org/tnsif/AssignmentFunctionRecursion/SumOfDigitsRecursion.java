package org.tnsif.AssignmentFunctionRecursion;
import java.util.Scanner;

public class SumOfDigitsRecursion {
	
	// Function Definition
	static int sumOfDigits(int num1) {
        if(num1 == 0) {
            return 0;
        }
        return num1 % 10 + sumOfDigits(num1/10);
   }
	public static void main(String[] args) {
		System.out.print("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		// Function Call
		System.out.println("Sum of digits of "+num+" is "+sumOfDigits(num));
		

	}

}
