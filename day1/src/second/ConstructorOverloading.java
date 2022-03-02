package second;

public class ConstructorOverloading {
	private int i;
	private String s;
	
	public ConstructorOverloading() {//디폴트 생성자
		System.out.println("ConstructorOverloading(): "+i+", s: "+s);
	}
	
	public ConstructorOverloading(int i) {
		System.out.println("ConstructorOverloading(int i): "+i+", s: "+s);
	}
	
	public ConstructorOverloading(String s) {
		System.out.println("ConstructorOverloading(String s): "+s+", i: "+i);
	}
	
	public ConstructorOverloading(int i, String s) {
		System.out.println("ConstructorOverloading(int i, String s): "+i+", s: "+s);
	}
	
	public ConstructorOverloading(String s, int i) {//생성자들의 매개변수 자료형 같을 경우 위치가 다르면 다른 생성자가 됨
		System.out.println("ConstructorOverloading(String s, int i): "+s+", i: "+i);
	}
}
