
public class Main {
	public static void main(String[] args) {
		AbstractCar myCar = new Sport(new StandardEngine(2000));
		myCar.setSpeed(20);
		myCar.setSpeed(40);
		
		System.out.println("Switching on sports mode gearbos...");
		myCar.setGearboxStrategy(new SportGearboxStrategy());
		myCar.setSpeed(20);
		myCar.setSpeed(40);
	}
}
