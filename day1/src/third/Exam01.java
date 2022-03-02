package third;

interface Inter{
	//멤버필드로는 상수만 가질수 있다.
	//디폴트 접근제어자 public abstract
	//상수와 추상 메서드만 가질 수 있다. 
	void str();
}

interface Inter2{
	void str2();
}

class Parent1 {
	public int a = 10;
	public int b = 20;
	
	void display() {
		System.out.println(a);
		System.out.println(b);
	}
}

class Child1 extends Parent1 implements Inter , Inter2 {
	private String a = "a변수 오버라이딩";
	
	void display() {
//		System.out.println(super.a);
		System.out.println(a);
		System.out.println(b);
	}
	
	@Override
	public void str() {
		System.out.println("Inter의 str() 재정의");
	}
	
	@Override
	public void str2() {
		System.out.println("Inter2의 str2() 재정의");
	}
}

public class Exam01 {
	public static void main(String[] args) {
		Child1 ch = new Child1();
		System.out.println("Child1객체 생성");
		ch.display();
		System.out.println("======================\n\n");
		
		Parent1 p1 = new Parent1();
		System.out.println("p1객체 생성");
		p1.display();
		System.out.println("======================\n\n");
		
		Parent1 p2 = new Child1();//부모에게 없는 변수나 메서드는 가려진다. 
		System.out.println("p2객체 생성");
		p2.display();
		System.out.println("======================\n\n");
		
		Inter p3 = new Child1();//자료형을 부모로 만들엇을때만.
		System.out.println("p2객체 생성");
		p3.str();
		System.out.println("======================");
		
	}
}