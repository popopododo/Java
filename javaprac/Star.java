package javaprac;

public class Star {
	public void printStar() {
	for(int countforward=0;countforward<6;countforward++)
	{
		for(int space=5;space>countforward;space--)
			System.out.printf(" ");

		for(int star=0;star<countforward*2+1;star++)  //1일때 1 2일때 3 3일때 5
			System.out.printf("*");
	System.out.printf("\n");
	}
	for(int countback=0;countback<5;countback++)
	{
		for(int space=1;space<=countback+1;space++)
			System.out.printf(" ");
		
		for(int star=8;star>countback*2-1;star--)
			System.out.printf("*");

	System.out.printf("\n");
	}
	}
	public static void main(String[] args) //main
	{
		Star star = new Star();
		star.printStar();
}
}




