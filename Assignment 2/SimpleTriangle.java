package js225cy_assign2;
import java.util.Scanner;
public class SimpleTriangle {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a positive number: ");
int h=sc.nextInt();
if(h>0)
{
	for(int i=0;i<h;i++)//For Rows
	{
	System.out.println();
	for(int k=0;k<i;k++)//For spaces
	{System.out.print(" ");
	}
for(int j=h;j>i;j--)//For stars
{
	System.out.print("*");
}
	
}
}else
	System.out.println("Wrong input");
sc.close();
}
}