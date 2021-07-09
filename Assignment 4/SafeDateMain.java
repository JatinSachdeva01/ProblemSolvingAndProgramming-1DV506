package js225cy_assign4;

import java.util.Scanner;

public class SafeDateMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateFormat date = new DateFormat();
		for (;;) {
			System.out.print("Give me a year:");
			int y = sc.nextInt();
			if (y > 0) {
				System.out.print("Give me a month:");
				int m = sc.nextInt();
				System.out.print("Give me a day:");
				int d = sc.nextInt();
				try {
					date.setDay(d);
					date.setYear(y);
					date.setMonth(m);
					date.setPunctuation('/');
					date.setFormat('l');
					System.out.println(date.getDate(true));
				} catch (IllegalArgumentException e) {
					System.out.println("No, that is not possible, error is: " + e.getMessage());
				}
			} else {
				System.out.print("Good bye!");
				break;
			}
		}
		sc.close();
	}
}
