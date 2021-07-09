package js225cy_assign1;
import java.util.Scanner;
public class Fahrenheit {
	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.print("Provide a temperature in Fahrenheit: ");
double f=sc.nextInt();//Take input from the user
double c=((f-32)*5)/9;//implying the formula 
System.out.println("Corresponding temperature in Celsius is "+c);
sc.close();
}
}
