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
	public void take(int profit) { //승차 메서드
		this.profit+= profit;
		passengers++;
	}
	public void busInfo() {
		System.out.println(busNo+"번 버스의 승객은"+ passengers+"명 이고, 수입은"+profit+"입니다.");
	}
}
