package js225cy_assign2;
import java.util.Scanner;
public class DateFormat {
public static String date(String y,String m,String d,String f)
{int date=Integer.parseInt(d);
int month=Integer.parseInt(m);
if(date<=9)//To check if the month is less than 10
	d="0"+d;
if(month<=9)//To check if the date is less than 10 
	m="0"+m;
if(f.equals("b"))
	return (y+"/"+m+"/"+d);
if(f.equals("l"))
	return (d+"/"+m+"/"+y);
if(f.equals("m"))
	return (m+"/"+d+"/"+y);
return f;
}
public static void main(String[] args)
{Scanner sc=new Scanner(System.in);
System.out.print("Enter a year: ");
String y=sc.nextLine();
System.out.print("Enter a month (number): ");
String m=sc.nextLine();
System.out.print("Enter a day (number): ");
String d=sc.nextLine();
System.out.print("Enter a format (b/l/m): ");
String format=sc.nextLine();
System.out.println(date(y,m,d,format));//calling the method
sc.close();

}
}
