public class MethodExample{

public static int calcArea(int side){                             //func declaration

int area = side * side;
return area;                                    		// we have return becasuse return type is other then void 
}

// for area of circle

public static double areaCircle(float r){

double cir = 3.14*r*r;
return cir;
}

// for area of rectangle



public static float areaRectangle(float l,float b){

float rect = l * b;
return rect;
}


// average of 3 numbers


public static float avgNumbers(float a,float b,float c){

float avg = (a+b+c)/3;
return avg;

}






public static void main(String []args){

int a = calcArea(5);                                        // func calling
System.out.println("area = "+a);

double circle = areaCircle(5);
System.out.println("area of circle = "+circle);

float rectangle = areaRectangle(5,10);
System.out.println("area of rectangle = "+rectangle);

float average = avgNumbers(1,2,3);
System.out.println(" average = "+average);


}
}