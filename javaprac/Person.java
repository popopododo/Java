package javaprac;

public class Person {
	int age;
	String name;
	boolean married;
	int child;
	public void printPerson()
	{
		System.out.println("����"+" :"+age);
		System.out.println("�̸�"+" :"+name);
		System.out.println("��ȥ����"+" :"+married);
		System.out.println("�ڳ� ��"+" :"+child);
	}
	public static void main(String[] args) {
		Person james = new Person();
		james.age=40;
		james.name="James";
		james.married=true;
		james.child=3;
		james.printPerson();
	}

}
