package javaprac;
import java.util.Scanner;
public class FunctionTest {

	public static int add(int num1, int num2)
	{
		int res;
		res= num1+num2;
		return res;
	}
	public static void Hello(String greeting){
		System.out.println(greeting);
	}
	public static int calcSum() {
		int sum=0;
		int i;
		for(i=0;i<10;i++)
			sum+=i;
		return sum;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FunctionTest test = new FunctionTest();
		System.out.print("���� ù��° ������ �Է����ּ���: ");
		int num1=scanner.nextInt();
		System.out.print("���� �ι�° ������ �Է����ּ���: ");
		int num2=scanner.nextInt();
		int res=test.add(num1, num2);
		test.Hello("Java is Fun");
		System.out.println(res);
		System.out.println(test.calcSum());
		scanner.close();
	}
}
