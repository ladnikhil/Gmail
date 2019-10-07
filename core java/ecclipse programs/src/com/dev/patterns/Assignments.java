package com.dev.patterns;

public class Assignments {

	public static void main(String[] args) {
		
		System.out.println("=========wap to reverse array elements======");

		// reverse of an array element
		int[] arr = {1,2,3,4};

		System.out.println("given array is");

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");

		}

		System.out.println();// for coming on new line
		System.out.println("reverse of an array is");


		for(int j=arr.length-1;j>=0;j--) {      // last element is length - 1

			System.out.print(arr[j]+" ");
		}

		System.out.println();
		System.out.println("===========to add first middle and second last elemets in an array=================");

		// to add first middle and second last elemets in an array

		int[] arr1 = {10,20,30,40,50,60,70};

		int first = arr1[0];
		System.out.println("first alement is : "+first);

		int middle = arr1[arr1.length/2];
		System.out.println("middle  element is : "+middle);

		int secondlast = arr1[arr1.length-2];
		System.out.println("secondlast element is : "+secondlast);


		int addition = first + middle + secondlast;
		System.out.println("addition of first,middle and secondlast element of an array = "+addition);

		System.out.println("===========wap to reverse a string=================");

		// reverse a string

		String str = "nikhil";

		String rev = "";


		System.out.println("given string is : "+str);

		for(int a =str.length()-1;a>=0;a--) {
			rev = rev + str.charAt(a);

		}
		System.out.println("reverse of a given string is: "+rev);


		


	}	


}
