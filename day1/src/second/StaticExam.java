package second;

public class StaticExam {

	public static void main(String[] args) {
		StaticClass sc1 = new StaticClass();
		System.out.println("sc1.getSt(): "+sc1.getSt());
		System.out.println("sc1.getIt(): "+sc1.getIt());
		System.out.println("================================\n");
		
		StaticClass sc2 = new StaticClass();
		System.out.println("sc2.getSt(): "+sc2.getSt());
		System.out.println("sc2.getIt(): "+sc2.getIt());
		System.out.println("================================\n");
		
		StaticClass sc3 = new StaticClass();
		System.out.println("sc3.getSt(): "+sc3.getSt());
		System.out.println("sc3.getIt(): "+sc3.getIt());
		System.out.println("================================\n");
		
	}

}
