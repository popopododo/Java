package javaprac;

public class Student {
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money)
	{
		this.studentName= studentName;
		this.money=money;
	}
	public void takeBus(Bus bus) {
		bus.take(1350);
		this.money-=1350;
	}
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money-=1200;
	}
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money-=10000;
	}
	public void moneyInfo()
	{
		System.out.println(studentName+"의 남은 돈은 "+money+"원입니다.");
	}
}
