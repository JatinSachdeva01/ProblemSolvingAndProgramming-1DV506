package js225cy_assign2;

public class BirthdayCandles {

	public static void main(String[] args) {
		int can = 0;
		int b = 0;
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (can < i) // to check if candles are less than age
			{
				if (i - can < 24)
					b = 1;// If age - candles is less than 24(total no. of candles in box) then box used
							// is 1
				else {
					if ((i - can) % 24 == 0)// To check if new box of candles is required or not
						b = (i - can) / 24;
					else
						b = (i - can) / 24 + 1;
				}
				can = can + b * 24 - i;// To use the remaining candles
			} else {
				b = 0;
				can = can - i;// To use the remaining candles
			}
			if (b != 0)// To check if the a new box is used
			{
				System.out.println("Before birthday " + i + " , buy " + b + " box(es)");
			}
			sum = sum + b;// To store total number of boxes
		}
		System.out.println();
		System.out.println("Total number of boxes: " + sum + " ,Remaining candles: " + can);
	}
}
