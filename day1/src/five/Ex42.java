package five;
class Test{
	String s;
	
}
public class Ex42 {
	public static void main(String args[]) {
		Test t=new Test();
		System.out.println("t 값: "+t.s);
		try {
			
//			String c = null;
//			System.out.println(" 문자열 값은 :  " + c.toString());//toString()-> 문자 객체로 반환
			
			
		} catch (NullPointerException e) {//null 값이라서 error 발생하는것이 아니다. 
			System.out.println("예외가 발생하여 Exception 객체가 잡음");
			System.out.println(e);
		}
		System.out.println("정상 종료");
	}
}

