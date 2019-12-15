package learnInheritance;

public class ClassA {
	
	int ax = 55;
	static int ay = 66;

	public static void main(String[] args) {
		
		A1();
		ClassA objA = new ClassA();
		objA.A2();
		
		System.out.println(objA.ax);
		System.out.println(ay);
		
		ClassB.B1();
		
		ClassB objB = new ClassB();
		objB.B2();
		

	}
	public static void A1() {
		System.out.println("A1");
	}
	public void A2() {
		System.out.println("A2");
	}

}
