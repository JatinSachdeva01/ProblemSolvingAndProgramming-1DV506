package js225cy_assign3;

public class SwedishID {
	DateFormat birthday = new DateFormat();
	private int checksum = 0;
	private boolean valid;

	public SwedishID(String str) {
		birthday.setYear(Integer.parseInt(str.substring(0, 4)));//to store year
		birthday.setMonth(Integer.parseInt(str.substring(4, 6)));//to store month
		birthday.setDay(Integer.parseInt(str.substring(6, 8)));//to store day
		this.checksum = Integer.parseInt(str.substring(9));//to store last four digits
		setChecksum(checksum);
	}

	public DateFormat getBirthday() {
		return birthday;
	}

	public void setBirthday(DateFormat birthday) {
		this.birthday = birthday;
	}

	public int getChecksum() {
		return checksum;
	}

	public void setChecksum(int checksum) {

		this.checksum = checksum;

	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public String showID() {
		String m = Integer.toString(birthday.getMonth());
		String d = Integer.toString(birthday.getDay());
		if (birthday.getMonth() < 10)
			m = "0" + m;
		if (birthday.getDay() < 10)
			d = "0" + d;
		return Integer.toString(birthday.getYear()).substring(2, 4) + m + d + "-" + Integer.toString(this.checksum);
	}

	public boolean isFemale() {
		int n = this.checksum / 10;
		if (n % 2 == 0)
			return true;
		else
			return false;
	}

	public int comparedTo(SwedishID otherID) {
		if (this.birthday.getYear() == otherID.birthday.getYear()) {
			if (this.birthday.getMonth() == otherID.birthday.getMonth()) {
				if (this.birthday.getDay() == otherID.birthday.getDay()) {
					return 0;
				} else {
					if (this.birthday.getDay() > otherID.birthday.getDay())
						return 1;
					else
						return -1;

				}

			} else {
				if (this.birthday.getMonth() > otherID.birthday.getMonth())
					return 1;
				else
					return -1;
			}
		} else {
			if (this.birthday.getYear() > otherID.birthday.getYear())
				return 1;
			else
				return -1;
		}
	}

	public boolean validID() {
		int toCheck = checksum % 10;
		int x = checksum / 10;
		String m = Integer.toString(birthday.getMonth());
		String d = Integer.toString(birthday.getDay());
		String y = Integer.toString(birthday.getYear()).substring(2, 4);
		String XXX = Integer.toString(x);
		int count = 1;
		int p = 0;
		int r = 0;
		int r1 = 0;
		int sum = 0;
		if (birthday.getMonth() < 10)
			m = "0" + m;
		if (birthday.getDay() < 10)
			d = "0" + d;
		String pNumber = y + m + d + XXX;
		int number = Integer.parseInt(pNumber);
		int num = number;
		for (int i = number; i > 0; i = i / 10) {
			num = i % 10;
			if (count % 2 == 0)
				p = num * 1;
			else
				p = num * 2;
			while (p > 9) {//to break the 2 digits and add them to make it one
				r = p % 10;
				r1 = p / 10;
				p = r + r1;
			}
			count++;
			sum = sum + p;//to get the sum

		}
		sum = 10 - (sum % 10);
		if (sum == toCheck)
			return true;
		else
			return false;

	}

}
