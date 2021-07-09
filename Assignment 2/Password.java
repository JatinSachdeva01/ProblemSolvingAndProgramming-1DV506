package js225cy_assign2;

import java.util.Scanner;

public class Password {
	public static boolean pass(String str) {
		char ch;
		int ascii = 0;
		int sc = 0;
		int uc = 0;
		int num = 0;
		int l = str.length();// To store the length of the input
		if (l >= 10)// to check if there are at least 10 characters
		{
			for (int i = 0; i < l; i++) {
				ch = str.charAt(i);
				ascii = (int) ch;
				if (ascii >= 65 && ascii <= 90)// To check if the character is upper case
					uc++;
				if (ascii >= 30 && ascii <= 39)// To check if the character is number
					num++;
				if ((ascii >= 32 && ascii <= 47) || (ascii >= 58 && ascii <= 64) || (ascii >= 91 && ascii <= 96)
						|| (ascii >= 123 && ascii <= 126))// To check if the character is a special character
					sc++;
			}
			if (uc >= 2 && num >= 2 && sc >= 2)// T check if the password is valid or not
				return true;
			else
				return false;
		} else
			return false;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.print("Enter a password: ");
			String tocheck = sc.next();
			if (pass(tocheck) == true) {
				System.out.println("Password is valid!");
				break;
			} else
				continue;
		}
		sc.close();
	}
}