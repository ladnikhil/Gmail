package gmailapplication.com.ustglobal.gmail;

import java.util.Scanner;

import com.dev.ustglobal.mapping.VoterCard;

public class App 
{
	static Scanner sc = new Scanner(System.in);
	
    public static void main( String[] args )
    {
    	
    	AllMethodInterfaceImplementation ami = new AllMethodInterfaceImplementation();
    	
    	System.out.println("=======================");
    	System.out.println("press 1 for login");
    	System.out.println("press 2 for register");
    	System.out.println("=======================");
    	
    	int i = sc.nextInt();
    	
    	if(i==1) {
   
    		ami.login();
    		
    		System.out.println("=======================");
    		System.out.println("press 1 to compose");
    		System.out.println("press 2 to show all inbox");
    		System.out.println("========================");
    		
    		System.out.println("enter ur choise");
    		int j= sc.nextInt();

			switch(j) {
			case 1:
				ami.compose();
				break;
			case 2:
				ami.showinbox();
				break;
			}
    		
    		
    	}else {
    		ami.register();
    	}
    }
}
