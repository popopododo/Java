package javaprac;

public class buyCoffeeTest {

	public static void main(String[] args) {
		Employee kimSleep = new Employee("±Ë¡π∑¡",10000);
		Employee leeTired = new Employee("¿Ã««∞Ô",20000);
		Coffee Americano = new Coffee("Americano",4000);
		Coffee Latte = new Coffee("Latte",4500);
		starCoffee star = new starCoffee();
		beanCoffee bean = new beanCoffee();
		
		kimSleep.takeStarCoffee(star, Americano,4000);
		leeTired.takeBeanCoffee(bean, Latte,4500);
		

	}

}
