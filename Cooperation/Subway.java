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
		System.out.println(subNo+"�� ����ö�� �°� ���� "+passengers+"���̰�, ������"+profit+"�� �Դϴ�.");
	}
	
}
