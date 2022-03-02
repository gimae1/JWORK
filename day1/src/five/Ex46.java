package five;

public class Ex46 {
	public static void main(String[] args) {
		try  {
				method1();		
		} catch (Exception e)	{
				System.out.println("main 에서 예외 처리");
				e.printStackTrace();
		}
	}

	static void method1() throws Exception {//throws 처리하는 구문에서의 exception 보다 동급이거나 하위의 exception 사용해야한다. 
		throw new Exception(); // 예외를 고의로 발생시킴
	}
}
