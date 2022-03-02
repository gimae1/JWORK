package second;

final class FinalClass {
    final int VAR = 50; //상수는 꼭 선언과 동시에 초기화가 되어야 한다.
    
    public void getVar() {
    	System.out.println("VAR값은: "+VAR);
    }
   
}

//class Sub extends FinalClass{} //상속불가//클래스에 파이널이 붙으면 상속불가 가 된다. 

class Pa{
	int i = 7;
	int t = 5;
	
	final void plus() { 
        System.out.println("i+t = "+(i+t));
    }
	
	public void minus() {
		System.out.println("i-t = "+(i-t));
	}
}

class Ch extends Pa{
//	public void plus() {
//		System.out.println("재정의 불가");//파이널 키워드는 부모 속성도 재정의 불가  
//	}
	
	public void minus() {
		System.out.println("재정의가능");
		System.out.println("i: "+i);
		System.out.println("t: "+t);
	}
}
//파이날= 변경 상속 재정의 불가