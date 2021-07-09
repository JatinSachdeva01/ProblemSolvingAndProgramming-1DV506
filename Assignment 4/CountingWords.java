package js225cy_assign4;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CountingWords {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		int count = 0;
		int emptyLines = 0;
		int pageLines = 0;
		File file = new File("/Users/jatinsachdeva/Desktop/lovecraft.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNext()) {
			String str = sc.nextLine();
				str = str.trim() + " ";
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) == ' ')
						count++;
				}
			
			if (str.trim().isEmpty())
				emptyLines++;
			else {
				if (str.trim().matches("[0-9]+"))
					pageLines++;

			}
			
		}
		System.out.println("Number of words: "+(count-emptyLines-pageLines));
		sc.close();
	}
}
