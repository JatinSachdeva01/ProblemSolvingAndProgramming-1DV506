package js225cy_assign2;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Provide 10 integers: ");
		int num = sc.nextInt();// take input from user
		int large = num;
		int slarge = num;
		for (int i = 0; i < 9; i++) {
			num = sc.nextInt();
			if (num > large)// to check if the number is larger
			{
				slarge = large;// replacing the value slarge by large
				large = num;
			} // replacing the value of large by number
			else {
				if (num > slarge)
					slarge = num;// replacing the value of slarge of number
			}

		}
		System.out.println("The second largest is: " + slarge);
		sc.close();
	}
}
