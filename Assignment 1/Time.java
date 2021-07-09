package js225cy_assign1;
import java.util.Scanner;
public class Time {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.print("Give a number of seconds: ");
		int s=sc.nextInt();
		int m=s/60;//To get total minutes
		int mleft=m%60;//To get remaining minutes
		int h=m/60;//To get hours
		int rs=s%60;//To get remaining seconds
System.out.println("This corresponds to: "+h+" hours, "+mleft+" minutes and "+rs+" seconds");
	sc.close();
	}

}
