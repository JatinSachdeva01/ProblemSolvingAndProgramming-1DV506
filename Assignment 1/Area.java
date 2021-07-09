package js225cy_assign1;
import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		
Scanner sc=new  Scanner(System.in);
System.out.print("Provide Radius: ");
double r=sc.nextDouble();
double pie=22.0/7.0;//to store the value of pie
double area=pie*(Math.pow(r,2));// To calculate the area
area=Math.round(area*10)/10.0;//To get the area till one decimal place
System.out.println("Corresponding area is "+area);
sc.close();
	}

}
