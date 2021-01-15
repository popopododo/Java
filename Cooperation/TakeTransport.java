package javaprac;

public class TakeTransport {

	public static void main(String[] args) {
		Student student1 = new Student("James",5000);
		Student student2 = new Student("Thomas",10000);
		Student Edward = new Student("Edward",20000);
		Bus bus472= new Bus(472);
		Bus bus500= new Bus(500);
		Bus bus200= new Bus(200);
		
		Subway subwayGreen = new Subway(2);
		Subway subwayPink = new Subway(8);
		Subway subwayBrown = new Subway(9);
		
		Taxi taxi = new Taxi();
		
		student1.takeBus(bus472);
		student2.takeSubway(subwayGreen);
		Edward.takeTaxi(taxi);
		
		student1.moneyInfo();
		student2.moneyInfo();
		Edward.moneyInfo();
		
		bus472.busInfo();
		subwayGreen.showSubway();
		taxi.taxiInfo();

	}

}
