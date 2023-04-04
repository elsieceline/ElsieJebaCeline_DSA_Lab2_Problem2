package com.elsie.lab.problem2;
import java.util.Arrays;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of your country");
		String countryName=sc.nextLine();
		System.out.println("Enter the no. of denomination in your country");
		int denominationCount=sc.nextInt();
		int currency[]=new int[denominationCount];
		System.out.println("Enter the denominations");		
		for(int i=0;i<denominationCount;i++)
			currency[i]=sc.nextInt();
		System.out.println("Before Sorting "+ Arrays.toString(currency));
		MergeSort ms=new MergeSort();
		ms.sort(currency, 0, denominationCount-1);
		System.out.println("After Sorting "+ Arrays.toString(currency));
		
		System.out.println("Enter Total Amount");
		int amount=sc.nextInt();
		
		NoteCount nc=new NoteCount();
		nc.counting(currency,amount);
		
	}
}