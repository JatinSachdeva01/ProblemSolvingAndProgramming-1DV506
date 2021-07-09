package js225cy_assign1;
import java.util.Scanner;
public class Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Price: ");
		double p=sc.nextDouble();
		System.out.print("Payment: ");
		
		int b=sc.nextInt();
		int b1=(int)p;//To round off the value of p
		
		int bal=b-b1;//To store the balance amount to be paid back
		System.out.println("Change: "+bal);
		int thousand=bal/1000;
		System.out.println("1000 kr bills: "+thousand);
		bal=bal-(thousand*1000);// To update the value of balance
		int fivehundred=bal/500;
		System.out.println("500 kr bills: "+fivehundred);
		bal=bal-(fivehundred*500);
		int twohundred=bal/200;
		System.out.println("200 kr bills: "+twohundred);
		bal=bal-(twohundred*200);
		int hundred=bal/100;
		System.out.println("100 kr bills: "+hundred);
		bal=bal-(hundred*100);
		int fifty=bal/50;
		System.out.println("50 kr bills: "+fifty);
		bal=bal-(fifty*50);
		int twenty=bal/20;
		System.out.println("20 kr bills: "+twenty);
		bal=bal-(twenty*20);
		int ten=bal/10;
		System.out.println("10 kr bills: "+ten);
		bal=bal-(ten*10);
		int five=bal/5;
		System.out.println("5 kr coins: "+five);
		bal=bal-(five*5);
		int two=bal/2;
		System.out.println("2 kr coins: "+two);
		bal=bal-(two*2);
		int one=bal/1;
		System.out.println("1 kr coins: "+one);
		sc.close();
	}

		

	}


