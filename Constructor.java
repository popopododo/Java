package javaprac;

public class Constructor {
	public int age;
	public String name;
	
	public Constructor(int age1, String name1) //»ý¼ºÀÚ
	{
		age=age1;
		name=name1;
	}
	public Constructor(int age2)
	{
		age= age2;
		
	}
	public static void main(String[] args) {
		Constructor constructor = new Constructor(24,"Tommy");
		System.out.println(constructor.name+ constructor.age);

	}

}
