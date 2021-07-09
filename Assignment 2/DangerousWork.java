package js225cy_assign2;
import java.util.Scanner;
public class DangerousWork {

	public static void main(String[] args) {
	int days=0;
		Scanner sc=new Scanner (System.in);
		System.out.print("How much would you like to earn? ");
	    double money=sc.nextDouble();
	    for(double i=money;i>=0.01;i=i/2)
	    {days++;//to count the number of days
	}
	    if(days>30)
	    	System.out.println("You cannot get this money because you have to work for more than 30 days and you will not survive");
	    else
	    System.out.println("You will have your money in "+days+" days.");
sc.close();
}
}