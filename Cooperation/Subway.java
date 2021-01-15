package javaprac;

public class Subway {
	int subNo;
	int passengers;
	int profit;
	
	public Subway(int subNo) {
		this.subNo=subNo;
	}
	
	public Subway(int subNo,int passengers,int profit)
	{
		this.subNo=subNo;
		this.passengers=passengers;
		this.profit=profit;
	}
	public void take(int profit)
	{
		this.profit+=profit;
		passengers++;
	}
	public void showSubway()
	{
		System.out.println(subNo+"번 지하철의 승객 수는 "+passengers+"명이고, 수입은"+profit+"원 입니다.");
	}
	
}
