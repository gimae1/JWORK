package second;

public class MethodOverloadingTest {

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.setMD(7);
		System.out.println(m.getMD());
		System.out.println("====================\n");
		
		m.setMD("s값만 초기화");
		System.out.println(m.getMD());
		System.out.println("====================\n");
		
		m.setMD(2, "둘다 초기화1");
		System.out.println(m.getMD());
		System.out.println("====================\n");
		
		m.setMD("둘다 초기화2", 3);
		System.out.println(m.getMD());
		System.out.println("====================\n");
	}

}
