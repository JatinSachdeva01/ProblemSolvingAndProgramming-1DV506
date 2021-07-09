package js225cy_assign1;
import java.util.Scanner;

public class SumOfThree {

	public static void main(String[] args) {
	
Scanner sc= new Scanner (System.in);
System.out.print("Provide a three digit number: ");
int num=sc.nextInt();
int a=num%10;//To store the third digit of a three digit number
int num1=num/10;//Dividing the number by 10 so that two digits are left
int b=num1%10;// To store the second digit
int num2=num1/10;//Dividing the number by 10 so that one digit is left
int sum=a+b+num2;//To store the sum of three digits
System.out.println("Sum of digits: "+sum);
sc.close();
	}

}
