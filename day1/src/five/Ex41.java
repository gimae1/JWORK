package five;
//try catch
public class Ex41 {
	public static void main(String args[]) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0 / 0);//실행을 멈춘다
			//System.out.println(4); // 실행되지 않는다.
		} catch (ArithmeticException ae) {
//			System.out.println(4);
			System.out.println(ae);
			System.out.println(5);
		}
	}
}
