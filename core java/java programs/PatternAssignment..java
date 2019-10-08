public class PatternAssignment {
	public static void main(String[] args) {


		 char a = 65;
		 char b = 97;
		for(int i = 3 ;i>=1;i--)
		{
			for(int j=3;j>=i;j--){
				System.out.print(a);
				System.out.print(b);
				a++;
				b++;
				System.out.print(" ");
			}
			System.out.println( );
		}




		System.out.println( );



		 char c = 65;
		for(int i=1;i<=3;i++)
		{
			for(int j=i;j<3;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=(i*2)-1;k++)
			{
				
				System.out.print(c);
				System.out.print(" ");
				c++;	
			}
			System.out.println( );
		}
		int m=1;
		for(int i=2;i>=1;i--)
		{
		
			for(int j=i;j<=2;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=(i*2)-1;k++)
			{
				
				System.out.print(m);
				System.out.print(" ");
				m++;
			
			}
			System.out.println( );
		}



		System.out.println( );




			for(int i=1;i<=3;i++)
		  {
			for(int j=i;j<3;j++)
			{
				System.out.print("   ");
			}
			for(int k=1;k<=(i*2)-1;k++)
			{
				System.out.print(" * ");
					
			}
			System.out.println( );
		}
		for(int i=2;i>=1;i--)
		{
		
			for(int j=i;j<=2;j++)
			{
				System.out.print("   ");
			}
			for(int k=1;k<=(i*2)-1;k++)
			{
				
				
				System.out.print(" * ");
				
		}
		System.out.println( );

	}



	System.out.println( );





	int p;
	for(int i = 1 ;i<=4;i++)
		{
		
		p=i;
			for(int j=1;j<=i;j++)
			{
				// System.out.print(" ");
			 System.out.print(p);
			 System.out.print(" ");
				p += 4-j;
			}
			System.out.println( );
			
		}
}