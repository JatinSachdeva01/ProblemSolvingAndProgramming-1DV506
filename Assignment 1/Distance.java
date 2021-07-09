package js225cy_assign1;
import java.util.Scanner;
public class Distance {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Point x1: ");
double x1=sc.nextDouble();
System.out.print("Point y1: ");
double y1=sc.nextDouble();
System.out.print("Point x2: ");
double x2=sc.nextDouble();
System.out.print("Point y2: ");
double y2=sc.nextDouble();
double x=Math.pow((x1-x2), 2);//To solve for (x1-x2) squared
double y=Math.pow((y1-y2), 2);//To solve for (y1-y2) squared
double d=Math.sqrt(x+y);
System.out.printf("The distance is: %.3f %n",d);
sc.close();
		
	}

}
