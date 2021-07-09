package js225cy_assign2;
import java.util.Scanner;
public class EveryOther {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("First number: ");
		int a=sc.nextInt();
		System.out.print("Second number: ");
		int b=sc.nextInt();
		for(int i=a;i<=b;i=i+2)//To get every other number
		{System.out.print(i+" ");
			
		}
		sc.close();

	}

}
