package js225cy_assign1;
import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		
		
Scanner sc= new Scanner(System.in);
System.out.print("First number: ");
int a=sc.nextInt();
System.out.print("Second number: ");
int b=sc.nextInt();
System.out.print("Third numeber: ");
int c=sc.nextInt();
if(a<b&&a<c&&b<c)//To check if a is smallest and then b is smaller than c
System.out.println("Correct order: "+a+" "+b+" "+c);
else
{if(a<b&&a<c&&c<b)//To check if a is smallest and then c is smaller than b
	System.out.println("Correct order: "+a+" "+c+" "+b);
else 
{if(b<a&&b<c&&a<c)//To check if b is smallest and then a is smaller than c
	System.out.println("Correct order: "+b+" "+a+" "+c);
else
{if(b<a&&b<c&&c<a)//To check if b is smallest and then c is smaller than a
	System.out.println("Correct order: "+b+" "+c+" "+a);
else
{if(c<a&&c<b&&a<b)//To check if c is smallest and then a is smaller than b
	System.out.println("Correct order: "+c+" "+a+" "+b);
else
	System.out.println("Correct order: "+c+" "+b+" "+a);
sc.close();
}
}
}
}

	
		

}}