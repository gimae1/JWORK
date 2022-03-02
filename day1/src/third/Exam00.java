package third;

class Parent {
	private int a = 10;	
	public int b = 20;
}

class Child extends Parent {
	public int c = 30;
	
	void display() {
//		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

public class Exam00 {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();
		Parent ch1=new Child();
		((Child)ch1).display();
	}
}