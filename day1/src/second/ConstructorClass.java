package second;

public class ConstructorClass {

	public static void main(String[] args) {
//		Constructor c = new Constructor();
		Constructor c = new Constructor(5, "멤버필드 초기화");//생성자 호출 
		
//		System.out.println(c.s+"값은: "+c.i);
		System.out.println(c.getS()+": "+c.getI());
		
		c.setI(7);
		c.setS("멤버필드 다시 초기화 ");
		System.out.println(c.getS()+": "+c.getI());
	}

}
