package js225cy_assign1;
import java.util.Scanner;
public class DoctorWho {

	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
System.out.print("What year? ");
int y=sc.nextInt();//To take the input from the user
if(y>=1963&&y<1989)//To check whether the number lies in range
	System.out.println("That was the original series");
else
	{if(y>=1989&&y<=2005)//To check whether the number lies in range
		System.out.println("That year it was a pause");
	else
	{if(y>2005&&y<=2020)//To check whether the number lies in range
		System.out.println("This is the mordern doctor");
	else
		System.out.println("No news on a doctor yet, but one can hope!");
	sc.close();
	}
	}
	}

}
