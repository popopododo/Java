package javaprac;

public class OrderInfo {
	String ordernum;
	String id;
	String date;
	String name;
	String packagenum;
	String address;
	public void printOrderInfo() {
		System.out.println("주문번호"+":"+ordernum);
		System.out.println("주문자 아이디"+":"+id);
		System.out.println("주문날짜"+":"+date);
		System.out.println("주문자 이름"+":"+name);
		System.out.println("주문 상품 번호"+":"+packagenum);
		System.out.println("배송주소"+":"+address);
	}
	public static void main(String[] args) {
		OrderInfo orderinfo = new OrderInfo();
		orderinfo.ordernum= "201907210001";

	}

}
