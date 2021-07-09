package js225cy_assign4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class lovecraft {

	public static void main(String[] args) {
		int totLines = 0;
		int emptyLines = 0;
		int textLines = 0;
		int pageLines = 0;
		try {
			File file = new File("/Users/jatinsachdeva/Desktop/lovecraft.txt");
			Scanner sc = new Scanner(file);
			System.out.println("Lovecraft statistics:");
			while (sc.hasNext()) {
				totLines++;
				String str = sc.nextLine();
				if (str.trim().isEmpty())
					emptyLines++;
				else {
					if (str.trim().matches("[0-9]+"))
						pageLines++;
					else
						textLines++;
				}
				
			}
			System.out.println("Total lines:            " + totLines);
			System.out.println("Empty lines:            " + emptyLines);
			System.out.println("Lines with text:        " + textLines);
			System.out.println("Lines with page number:	" + pageLines);

			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
