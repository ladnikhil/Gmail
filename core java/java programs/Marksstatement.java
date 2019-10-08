public class Marksstatement{
public static void main(String []args){

int marks = 90;

if(marks<=100 && marks>=91)
{
System.out.println("grade is a");
}

else if(marks<=90 && marks>=81)
{
System.out.println("grade is b");
}



else if(marks<=80 && marks>=71)
{
System.out.println("grade is c");
}



else if(marks<=70 && marks>=61)
{
System.out.println("grade is d");
}


else if(marks<=60 && marks>=51)
{
System.out.println("grade is e");
}



else if(marks<=50 && marks>=41)
{
System.out.println("you have to givve retest");
}


else if (marks<=40 && marks>=0)
{
System.out.println("you are failed");
}

else
{
System.out.println("please enter valid marks");
}

}
}
