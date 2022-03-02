package second;

public class StaticExam2 {
	public static void main(String[] args) {
		StaticClass sc4 = new StaticClass();
//		System.out.println("sc4.getSt(): "+sc4.getSt());
//		System.out.println("sc4.getIt(): "+sc4.getIt());
//		System.out.println("================================\n");
		
		StaticClass sc5 = new StaticClass();
//		System.out.println("sc5.getSt(): "+sc5.getSt());
//		System.out.println("sc5.getIt(): "+sc5.getIt());
//		System.out.println("================================\n");
		
		System.out.println("StaticClass.getSt(): "+StaticClass.getSt());
//		System.out.println("StaticClass.getIt(): "+StaticClass.getIt());
		System.out.println("StaticClass.result+1: "+(StaticClass.result+1));
//		System.out.println("StaticClass.it+1: "+(StaticClass.it+1));
		System.out.println("sc5.getSt(): "+sc5.getSt());
	}
}
