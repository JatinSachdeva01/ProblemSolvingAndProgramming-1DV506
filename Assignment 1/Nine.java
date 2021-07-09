package js225cy_assign1;
import java.util.Scanner;
public class Nine {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Playing a game");
		System.out.println("===============");
		System.out.print("Ready to play? (Y/N) ");
		int iop=0;int total=0;int total1=0;int iop1=0;
		String ch1=sc.nextLine();
	    char ch=ch1.charAt(0);//convert the string into character
		
		if(ch=='y'||ch=='Y')//To check if the user wants to play
		{
			double op=Math.floor(Math.random()*6)+1;//To get the random number between 1 and 6
			 iop=(int)op;
			System.out.println("You rolled "+iop);
		}
			
		
		System.out.print("Would you like to roll again? (Y/N) ");
		String ch2=sc.nextLine();
		char ch3=ch2.charAt(0);
		if(ch3=='y'||ch3=='Y')//To check if user wants to play again
		{
		double op1=Math.floor(Math.random()*6)+1;
		  iop1=(int)op1;
		total=iop1+iop;//Total of user
		if(total>9)//To check if the total value is greater than 9 as if it is then the player looses automatically
			System.out.println("You rolled "+iop1+" and the total is "+total+" hence you are Fat and you loose");
		else
		System.out.println("You rolled "+iop1+" and in total you have "+total);
		}
		else
			{System.out.println("In total you have "+iop);
			total=iop;//Total of user
			}
		if(total<=9)//To check if the user is fat or not
		{double cop=Math.floor(Math.random()*6)+1;
		int ciop=(int)cop;
		System.out.println("The computer rolled "+ciop);
		if(ciop<=4)
			{double cop1=Math.floor(Math.random()*6)+1;
			int ciop1=(int)cop1;
			total1=ciop+ciop1;//Total of computer
			if(total1>9)
				System.out.println("Computer is fat hence it looses");
			else
			System.out.println("The computer rolls again and gets "+ciop1+" in total "+total1);
			}
		else
		{total1=ciop;//Total of computer
			System.out.println("in total "+total1);
		}}
		else
			System.out.println("Computer won!");
			
		if (total1<=9&&total<=9)//To check that no one is fat
		{if(total1>total)
			System.out.println("Computer won!");
		else 
			if(total1==total)
				System.out.println("There is a tie");
			else
			System.out.println("You won!");
		}
		sc.close();
	}}


