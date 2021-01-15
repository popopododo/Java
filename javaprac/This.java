package javaprac;

public class This {
	String name;
	int age;
	
	public This() {
		this("이름없음",0);
		this.age=100;
	}
	
	public This(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public This getSelf() {
		return this;
	}
	public void showInfo() {
		System.out.println(name+"은 "+age+"살");
	}
	public static void main(String[] args)
	{
		This a = new This("한동숙",29);
		This b = new This();
		
		a.showInfo();
		b.showInfo();
		//this가 참조하고 있는 멤버변수가 인스턴스마다  다르다
		System.out.println(a.getSelf());
		System.out.println(b.getSelf());
	}
}
