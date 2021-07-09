package js225cy_assign2;
import java.util.Scanner;
public class CalcNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0;int sum=0;
		for( ; ; )//Infinite loop 
		{System.out.print("Give me a number:");
		a=sc.nextInt();
		sum=sum+a;
		if(a==0)
			break;//stop asking for input when user enters 0
		}
			System.out.println("The sum is: "+sum);
			sc.close();
	}

}
