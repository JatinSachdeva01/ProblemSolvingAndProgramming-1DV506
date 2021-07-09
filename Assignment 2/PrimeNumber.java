package js225cy_assign2;
import java.util.Scanner;
public class PrimeNumber {
public static boolean prime(int num)
{int count=0;
	for(int i=1;i<=num;i++)
	{if(num%i==0)//to check number of factors 
		count++;
	}
	if(count==2)//if count is 2 then the number is divisible by 1 and itself which means its a prime number
		return true;
	else 
		return false;
	

}

public static void main(String [] args)
{Scanner sc=new Scanner(System.in);
for(;;)//infinite loop
{
System.out.print("Give me a number: ");
int tocheck=sc.nextInt();
if(tocheck<0)
{System.out.println("Good bye!");
	break;}
else
{if(prime(tocheck)==true)
	System.out.println("This is a prime number.");
else
	System.out.println("This is not a prime number.");
}
}sc.close();
}}
