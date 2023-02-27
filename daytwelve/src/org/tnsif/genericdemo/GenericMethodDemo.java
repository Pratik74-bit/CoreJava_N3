package org.tnsif.genericdemo;

public class GenericMethodDemo {
	
	public static <E>void print(E[] elements) {
		for(E itr:elements) {
			System.out.println(itr+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		Integer[] array1 = {10,20,30,40,50};
		Character[] array2 = {'A','Q','T','U'};
		Double[] array3 = {12.5,55.3,2.33,45.5};
		
		System.out.println("Printing Integer array:");
		print(array1);
		System.out.println("Printing Character array:");
		print(array2);
		System.out.println("Printing Float array:");
		print(array3);
		
	}

}
