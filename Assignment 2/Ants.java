package js225cy_assign2;

public class Ants {

	public static void main(String[] args) {
		System.out.println("Ants");
		System.out.println("=====");
		System.out.println();
		System.out.println();
		int tot = 0;// To store the sum of simulations
		for (int count = 1; count <= 10; count++) {
			int arr[][] = new int[8][8];
			int steps = 0;
			int count1 = 0;
			int i = (int) Math.floor(Math.random() * 7);// To get the random index for ant to start
			int j = (int) Math.floor(Math.random() * 7);// To get the random index for ant to start
			arr[i][j] = 1;// assigning 1 to the position to check later if the ant has been to all the
							// spaces
			for (;;) {

				int randomDirection = (int) Math.floor(Math.random() * 4) + 1;// To get the random directions
				if (randomDirection == 1)// For going down
					if (j > 0) {
						j--;
						steps++;
						arr[i][j] = 1;// Assigning 1 to each index
					}
				if (randomDirection == 2)// For going up
					if (j < 7) {
						j++;
						steps++;
						arr[i][j] = 1;// Assigning 1 to each index
					}
				if (randomDirection == 3)// For going right
					if (i < 7) {
						i++;
						steps++;
						arr[i][j] = 1;// Assigning 1 to each index
					}
				if (randomDirection == 4)// For going left
					if (i > 0) {
						i--;
						steps++;
						arr[i][j] = 1;// Assigning 1 to each index
					}

				for (int h = 0; h < 8; h++) {
					for (int w = 0; w < 8; w++) {
						if (arr[h][w] == 1)// To check if 1 is assigned on he index or not to check whether the ant has
											// been on the box
						{
							count1++;
						} else {
							count1 = 0;
							break;
						}
					}
					if (count1 == 0)
						break;
				}
				if (count1 == 64)// To check if all the boxes are covered by ant
				{
					break;
				}
			}
			System.out.println("Number of steps in simulation " + count + " : " + steps);
			tot = steps + tot;
		}
		System.out.println("Average amount of steps: " + tot / 10.0);// Printing average

	}
}