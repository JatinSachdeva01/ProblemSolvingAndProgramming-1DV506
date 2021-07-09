package js225cy_assign2;
import java.util.Scanner;
public class Diamonds {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(;;)
		{System.out.print("Give a positive number: ");
		int a=sc.nextInt();
		if(a>0)
		{
			for(int i=0;i<a;i++)//For upper part of diamond
			{     System.out.println();
				for(int j=0;j<(a-i);j++)
				{	System.out.print(" ");
				}
				for(int k=0;k<=i*2;k++)
				{	System.out.print("*");
				
		
				}
			}

			for(int i1=0;i1<(a-1);i1++)//For lower part of diamond
			{System.out.println();
			for(int j1=0;j1<=(i1+1);j1++)
			{System.out.print(" ");
			}
			for(int k1=0;k1<((a-i1)*2)-3;k1++)
			{System.out.print("*");
			
			}
	}
			}else
				break;
		System.out.println();
		System.out.println();
		}sc.close();
}}