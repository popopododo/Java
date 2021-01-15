package javaprac;

public class AccessModifier {
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month<1 || month>12)
			isValid=false;
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setDay(int day) {
		this.day=day;
	}
	public int getDay()
	{
		return day;
	}
public void showDate()
{
	System.out.println(year+"³â"+month+"¿ù"+day+"ÀÏ");
}
}
 