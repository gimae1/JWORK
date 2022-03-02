package third;
//싱글톤의 목적 객체의 남발을 막기 위함//메모리의 남발을 막기 위함 
class SingleTon{
	private static SingleTon st ;
	
	private SingleTon(){}
	
	public static SingleTon getSt() {//객체 생성이 안되므로 클래스로라도 접근을 해서 사용을 해야 한다.
		if(st==null) st= new SingleTon();//객체가 하나만 생성되도록 하기 위해서 
		return st;
	}
	public void getMess() {
		System.out.println("메소드 호출");
	}
	
}




public class Single {

	public static void main(String[] args) {
		SingleTon s = SingleTon.getSt();
		System.out.println(s);
		s.getMess();
	}

}
