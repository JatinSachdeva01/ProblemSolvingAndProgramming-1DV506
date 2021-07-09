package js225cy_assign1;
import java.util.Scanner;

public class Quote {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
System.out.print("Please give me something to quote: ");
String q=sc.nextLine();
System.out.println("You said: "+'"'+q+'"');
sc.close();
	}

}
