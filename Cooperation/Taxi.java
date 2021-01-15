package javaprac;

public class Taxi {

	int profit;
	int passengers;
	boolean reserved;
	
	public Taxi()
	{}
	
	public Taxi(int profit, boolean reserved,int passengers)
	{
		this.profit=profit;
		this.reserved=reserved;
		this.passengers=passengers;
	}
	public void take(int profit)
	{
		this.profit+=profit;
		passengers++;
		reserved=true;
	}
	public void taxiInfo()
	{

		System.out.println("택시의 수입은"+profit+"원 입니다.");
	}
}
