public class Weekdays{
public static void main(String []args){

int days = 6;

switch(days)
{


default:                                   // as we write default statements upside we have to compilsory write break statement    
System.out.println("day is invalid");
break;


case 1:
case 2:
case 3:
case 4:
case 5:
System.out.println("weekdays");
break;

case 6:
case 7:
System.out.println("weekends");
break;


}
}
}