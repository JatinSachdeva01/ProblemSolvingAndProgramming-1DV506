package js225cy_assign2;

import java.util.Scanner;

public class Palindrome {

	public static boolean pal(String str) {
		char ch;
		char ch1;
		String ne = "";
		String rev = "";
		String str1 = str.toLowerCase();
		int l = str1.length();
		for (int j = 0; j < l; j++) {
			ch = str1.charAt(j);
			if (ch != ' ')
				ne = ne + ch;// to get a new string without spaces

		}
		int l1 = ne.length();
		for (int i = 0; i < l1; i++) {
			ch1 = ne.charAt(i);
			rev = ch1 + rev;// to get reversed string
		}
		if (rev.equals(ne))// to check if reverse is equal to main string
			return true;
		else
			return false;

	}

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.print("Enter a word or sentence: ");
			String tocheck = sc.nextLine();
			if (tocheck.equals("stop"))
				break;
			else {
				if (pal(tocheck) == true)// to pass the value in the method and get the result and check it if its true
											// or false
					System.out.println("That was a palindrome.");
				else
					System.out.println("That wasn't a palindrome.");
			}
		}
		sc.close();
	}
}
