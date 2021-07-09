package js225cy_assign3;

public class DateFormat {
	private int year = 0;
	private int month = 0;
	private int day = 0;
	private char punctuation;
	private char format;

	public DateFormat() {
	}

	public DateFormat(int year, int month, int day, char punctuation, char format) {
		setYear(year);
		setMonth(month);
		setDay(day);
		setPunctuation(punctuation);
		setFormat(format);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year >= 1900 && year <= 2100)//To check if the year is in range
			this.year = year;
		else
			year = 0;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {

		if (month > 0 && month <= 12)//To check if the month is in range

			this.month = month;
		else
			month = 0;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {

		if (day > 0 && day <= 31)

			this.day = day;
		else
			day = 0;

	}

	public char getPunctuation() {
		return punctuation;
	}

	public void setPunctuation(char punctuation) {
		if (punctuation != '!')
			this.punctuation = punctuation;
		else
			punctuation = 0;
	}

	public char getFormat() {
		return format;
	}

	public void setFormat(char format) {
		this.format = format;
	}

	public String getDate(boolean fullYear) {

		String year = Integer.toString(this.year);
		String day = Integer.toString(this.day);
		String month = Integer.toString(this.month);
		int flag = 0;
		if ((this.year % 4 == 0 && this.year % 100 != 0) || this.year % 400 == 0)//to check the leap year
			flag++;
		if (this.year != 0 && this.day != 0 && this.month != 0) {
			if ((this.day <= 31 && (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7
					|| this.month == 8 || this.month == 10 || this.month == 12))
					|| (this.day <= 30 && (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11)
							|| (this.month == 2 && flag == 0 && this.day <= 28)
							|| (this.month == 2 && flag == 1 && this.day <= 29))) {
				if (this.month <= 9)
					month = "0" + month;
				if (this.day <= 9)
					day = "0" + day;
				if (fullYear == false)
					year = year.substring(2);
				if (this.format == 'b')
					return year + punctuation + month + punctuation + day;
				if (this.format == 'l')
					return day + punctuation + month + punctuation + year;
				if (this.format == 'm')
					return month + punctuation + day + punctuation + year;
				else
					return "Invalid Input";
			} else
				return "Invalid Input";

		} else
			return "Invalid Input";
	}
}