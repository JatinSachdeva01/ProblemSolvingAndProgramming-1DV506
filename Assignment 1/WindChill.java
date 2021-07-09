package js225cy_assign1;
import java.util.Scanner;
public class WindChill {

	public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
System.out.print("Temperature (C): ");
double t=sc.nextDouble();
System.out.print("Wind Speed (m/s): ");
double s=sc.nextDouble();
s=s*(18.0/5.0);//To convert speed
double ans=13.12+(0.6215*t)-(11.37*(Math.pow(s,0.16)))+(0.3965*t*(Math.pow(s, 0.16)));
ans=(Math.round(ans*10))/10.0;//To round it off to one decimal place
System.out.println("Wind Chill Temperature (C): "+ans);
sc.close();
	}

}
