public class LogicalOperator{
public static void main(String []args){

boolean b = true;
boolean c = false;

boolean d = b&&c;
System.out.println("for && = "+d);

d = !(b&&c);
System.out.println("for !(&&) = "+d);

d = b||c;
System.out.println("for || = "+d);

d = !(b||c);
System.out.println("for !(||) = "+d);

//      bitwise operators

int x = 2;
int y = 3;

int z = (x&y);                 // here it checks each bits and performe accordinf to and truth table
System.out.println("for &z "+z);


z = (x|y);			// here it checks each bits and performe according to or truth table
System.out.println("for |z "+z);


z = (x^y);			// here it is exor if both inputs are different then it gives 1 otherwise it gives zero
System.out.println("for ^z "+z);



}
}
