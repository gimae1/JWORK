package first;

public class SamePackage {

	protected String sameVar = "같은 패키지는 허용"; //접근제어자 생략됨
    
    private String privateStr() {//같은 클래스 내에서만 접근
    	return "기존private";
    }
    
    String defaultStr() {//같은 패키지
    	return "기존default";
    }
    
    protected String protectedStr(){//같은패키지+이 클래스를 상속받은 클래스에서 사용 가능
    	return "기존protected";
    }

    public String publicStr() {
    	System.out.println("기존private출력");
    	System.out.println("해당 클래스의 sameVar변수값: "+sameVar);
    	return "기존public";
    }
}