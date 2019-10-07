package com.dev.patterns;

public class Stars {

	public static void main(String[] args) {


		for(int i = 1; i<=4 ; i++) {
			for(int j = 1; j<=i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}


		System.out.println("==================================================================");
		// next pattern



		for(int a=4;a>=1;a--)                        // for rows
		{
			for(int b = 1;b<=a;b++)                     // for columns
			{
				System.out.print("* ");

			} 
			System.out.println(" "); 				//  for next line
		}

		System.out.println("==================================================================");



		for(int i = 1; i<=4 ; i++) {
			for(int j = 1; j<=i ; j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}

		System.out.println("==================================================================");

		for(int a=4;a>=1;a--)                        // for rows
		{
			for(int b = 1;b<=a;b++)                     // for columns
			{
				System.out.print(b +" ");

			} 
			System.out.println(" "); 				//  for next line
		}

		System.out.println("==================================================================");

		int n = 1;

		for(int x = 1; x<=4 ; x++) {
			for(int y = 1; y<=x ; y++) {
				System.out.print(n + " ");
				n++;
			}
			System.out.println();
		}

		System.out.println("==================================================================");


		char a = 65;
		char b = 97;
		for(int i = 1 ;i<=3;i++)
		{
			for(int j=1;j<=i;j++){
				System.out.print(a);
				System.out.print(b);
				a++;
				b++;
				System.out.print(" ");
			}
			System.out.println( ); // next line
		}


		System.out.println("==================================================================");

		int p;
		for(int i = 1 ;i<=4;i++)
		{

			p=i;
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(p);
				System.out.print(" ");
				p += 4-j;
			}
			System.out.println( );

		}

		System.out.println("==================================================================");


		
		




	}

}
