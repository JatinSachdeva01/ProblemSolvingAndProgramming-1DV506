package js225cy_assign2;

public class Histogram {

	public static void main(String[] args) {
		int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
		for (int a = 0; a < 500; a++) {
			double td = Math.floor(Math.random() * 6) + 1;// to get a random roll of die
			int d = (int) td;
			if (d == 1)
				one++;
			if (d == 2)
				two++;
			if (d == 3)
				three++;
			if (d == 4)
				four++;
			if (d == 5)
				five++;
			if (d == 6)
				six++;
		}
		System.out.print("One   " + "(" + one + "): ");
		for (int i1 = 0; i1 < one; i1++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("Two   " + "(" + two + "): ");
		for (int i2 = 0; i2 < two; i2++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("Three   " + "(" + three + "): ");
		for (int i3 = 0; i3 < three; i3++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("Four   " + "(" + four + "): ");
		for (int i4 = 0; i4 < four; i4++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("Five   " + "(" + five + "): ");
		for (int i5 = 0; i5 < five; i5++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("Six   " + "(" + six + "): ");
		for (int i6 = 0; i6 < six; i6++) {
			System.out.print("*");
		}

	}
}
