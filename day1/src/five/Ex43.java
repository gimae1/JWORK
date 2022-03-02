package five;

public class Ex43 {
	public static void main(String args[]) {
		try {
			System.out.println("매개변수로 받은 두 개의 값");
			int a = Integer.parseInt(args[0]); // 문자열 값을 정수로 변환//"5"=>5
			int b = Integer.parseInt(args[1]);//"2"=>2
			System.out.println(" a = " + a + " b = " + b);
			System.out.println(" a를 b로 나눈 몫 = " + (a / b));
			System.out.println("나눗셈 수행");
		} catch (ArithmeticException e) {//산술연산 에러
			System.out.println("==================================");
			System.out.println("ArithmeticException 처리 루틴 : ");
			System.out.println(e + " 예외 발생");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("==================================");
			System.out.println("ArrayIndexOutOfBoundsException 처리 루틴");
			System.out.println(e + " 예외 발생");
		} catch (NumberFormatException e) {//숫자 자료형 error
			System.out.println("==================================");
			System.out.println("NumberFormatException 처리 루틴");
			System.out.println(e + " 예외 발생");
		}
		finally {
			System.out.println("==================================");
			System.out.println("finally 블럭 수행");
		}
	}
}
