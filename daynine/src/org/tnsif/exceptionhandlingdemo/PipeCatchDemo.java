package org.tnsif.exceptionhandlingdemo;

public class PipeCatchDemo {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 0;
		
		int arr[] = new int[] {1,2,3};
		
		
		try { 
			//System.out.println(x/y);
			System.out.println(arr[3]);
		}
		
		catch (ArithmeticException |  ArrayIndexOutOfBoundsException a)  {
			System.out.println("Exception handled :"+ a);
		}
		
		
		
		
		finally {
			System.out.println("Finally block");
		}

	}

}
