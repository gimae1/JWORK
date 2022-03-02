package second;

public class StaticClass {
	public int it;
	public static int result;
	
	public static int getSt() {
		int etc = 3;
		result += etc;
//		result += it;
		
		return result;
	}
	
	public int getIt() {
		int etc = 3;
		it += etc;
		
		return it;
	}
}
