package javaprac;

public class Bus {

	int busNo;
	int passengers;
	int profit;
	public Bus(int busNo) {
		this.busNo=busNo;
	}
	public Bus(int busNo, int passengers,int profit)
	{
		this.busNo=busNo;
		this.passengers=passengers;
		this.profit=profit;
	}
	public void take(int profit) { //���� �޼���
		this.profit+= profit;
		passengers++;
	}
	public void busInfo() {
		System.out.println(busNo+"�� ������ �°���"+ passengers+"�� �̰�, ������"+profit+"�Դϴ�.");
	}
}
