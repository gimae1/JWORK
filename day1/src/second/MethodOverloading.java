package second;

public class MethodOverloading {
	private int i;
	private String s;
	private int od;
	
	public void setMD(int i) {
		System.out.print("setMD(int i): ");
		this.i = i;
	}
	
	public void setMD(String s) {
		System.out.print("setMD(String s): ");
		this.s = s;
		od = 1;
	}

	public void setMD(int i, String s) {
		System.out.print("setMD(int i, String s): ");
		this.i = i;
		this.s = s;
		od = 2;
	}
	
	public void setMD(String s, int i) {
		System.out.print("setMD(String s, int i): ");
		this.i = i;
		this.s = s;
		od = 3;
	}
	
	public String getMD() {
		String str ="";
		switch(od) {
			case 0: str = i+", "+s; break;
			case 1: str = i+", "+s; break;
			case 2: str = i+", "+s; break;
			default : str = s+", "+i; 
		}
		return str;
	}
}
