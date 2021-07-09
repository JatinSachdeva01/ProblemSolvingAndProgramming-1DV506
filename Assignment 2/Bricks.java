package js225cy_assign2;

import java.util.Scanner;

public class Bricks {
	public static String[][] formation(int w, int h) {
		String arr[][] = new String[h + 2][w + 2];// I added two extra rows and columns for the box formation
		arr[0][0] = "┏";// I am defining these values because they'll remain same for every input
		arr[0][w + 1] = "┓";
		arr[h + 1][0] = "┗";
		arr[h + 1][w + 1] = "┛";
		for (int i = 0; i <= h + 1; i++) {
			for (int j = 0; j <= w + 1; j++) {
				if ((i == 0 && j > 0 && j < (w + 1)) || (i == (h + 1) && j > 0 && j < (w + 1)))// Checking for the
																								// formation of borders
																								// of the box
					arr[i][j] = "━━━";
				else {
					if (j == 0 && i > 0 && i < (h + 1) || (j == (w + 1) && i > 0 && i < (h + 1)))// Checking for the
																									// formation of
																									// borders of the
																									// box
						arr[i][j] = "┃";
					else if (i > 0 && j > 0 && i < h + 1 && j < w + 1)// Checking for the formation of dots
						arr[i][j] = " ● ";
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lego Builder");
		System.out.println();
		System.out.print("Width: ");
		int width = sc.nextInt();
		if (width > 0)// To check if the width is a non negative number
		{
			System.out.print("Height: ");
			int height = sc.nextInt();
			String arr1[][] = new String[height + 2][width + 2];
			arr1 = formation(width, height);// To call the method
			for (int i = 0; i <= height + 1; i++)// To print the array
			{
				for (int j = 0; j <= width + 1; j++) {
					System.out.print(arr1[i][j]);

				}
				System.out.println();
			}

		} else
			System.out.println("Bye!");
		sc.close();
	}
}