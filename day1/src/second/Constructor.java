package second;

public class Constructor {
	private int i;//5
	private String s;//맴버필드 초기화
	
	public Constructor(int i, String s) {//생성자 ,맴버필드 초기화
		this.i = i;//5
		this.s = s;//맴버필드 초기화
	}
	
	public void setI(int i) {//매서드 (멤버변수 초기화 하기때문에 매개변수 필요함)
		this.i = i;//7		
	}
	public int getI() {
		return i;	
	}
	
	public void setS(String s) {
		this.s = s;
	}
	
	public String getS() {
		return s;
	}
}
