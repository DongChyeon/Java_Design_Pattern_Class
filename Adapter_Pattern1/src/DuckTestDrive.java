
public class DuckTestDrive {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdpater = new TurkeyAdapter(turkey);
		
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says...");
		testDuck(duck);
		
		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdpater);
	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}	// 자바는 복합 상속이 불가능해 이와 같은 Object Adpater는 되지만 Class Adpater는 불가능
