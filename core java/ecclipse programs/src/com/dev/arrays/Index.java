package com.dev.arrays;

public class Index {

	public static void main(String[] args) {

		int[] array = {10,20,30,40,50};

		int index = 2;





		if(array.length>index) {
			System.out.println("index is found");
			System.out.println(array[index]);
			for(int i=0;i<=index;i++) {
				System.out.println("elements before given index ="+array[i]);
			}
		}else {
			System.out.println("index is not found");
		}



	}

}
