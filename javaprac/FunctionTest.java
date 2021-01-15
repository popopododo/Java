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
		System.out.print("더할 첫번째 정수를 입력해주세요: ");
		int num1=scanner.nextInt();
		System.out.print("더할 두번째 정수를 입력해주세요: ");
		int num2=scanner.nextInt();
		int res=test.add(num1, num2);
		test.Hello("Java is Fun");
		System.out.println(res);
		System.out.println(test.calcSum());
		scanner.close();
	}
}
