package javaprac;

public class OrderInfo {
	String ordernum;
	String id;
	String date;
	String name;
	String packagenum;
	String address;
	public void printOrderInfo() {
		System.out.println("�ֹ���ȣ"+":"+ordernum);
		System.out.println("�ֹ��� ���̵�"+":"+id);
		System.out.println("�ֹ���¥"+":"+date);
		System.out.println("�ֹ��� �̸�"+":"+name);
		System.out.println("�ֹ� ��ǰ ��ȣ"+":"+packagenum);
		System.out.println("����ּ�"+":"+address);
	}
	public static void main(String[] args) {
		OrderInfo orderinfo = new OrderInfo();
		orderinfo.ordernum= "201907210001";

	}

}
