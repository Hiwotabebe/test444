package learnStatic;

public class LearnStaticKey {
	
	int a = 15;
	//static int x = 20;
	static int x = 50;
	
	public static void main(String[] args) {
		LearnStaticKey objName = new LearnStaticKey();
		int a = 10;
		//int x = 55;
		objName.a = 25;
		x = 50;
	
		//System.out.println(objName.a);
		System.out.println(x);
		m1();
		System.out.println(x);
	}
	public static void m1(){
		LearnStaticKey m1objName = new LearnStaticKey();
		int a = 11;
		//int x = 66;
		//System.out.println(m1objName.a);
		System.out.println(x);
		//System.out.println(this.x);// cant use this in static method (in contracor)
		x = 1;

}
}
