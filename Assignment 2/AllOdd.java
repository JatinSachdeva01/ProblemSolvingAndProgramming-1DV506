package js225cy_assign2;

public class AllOdd {
	public static void main(String[] args) {
		int[] arr = new int[10];
		System.out.print("Complete array: ");
		for (int i = 0; i < 10; i++) {
			arr[i] = (int) Math.floor(Math.random() * 100) + 1;// To get the random numbers
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print("All odd numbers: ");
		for (int j = 0; j < 10; j++) {
			if (arr[j] % 2 != 0)// To check if the number is odd
				System.out.print(arr[j] + " ");
		}
	}
}
