package javaprac;

public class This {
	String name;
	int age;
	
	public This() {
		this("�̸�����",0);
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
		System.out.println(name+"�� "+age+"��");
	}
	public static void main(String[] args)
	{
		This a = new This("�ѵ���",29);
		This b = new This();
		
		a.showInfo();
		b.showInfo();
		//this�� �����ϰ� �ִ� ��������� �ν��Ͻ�����  �ٸ���
		System.out.println(a.getSelf());
		System.out.println(b.getSelf());
	}
}
