package firstsub;

import first.SamePackage;

public class SamePackageSub extends SamePackage {
	
	public int sameVar = 5; //접근제어자 생략됨
    
//	public String privateStr() {
//    	return "상속자식: "+super.privateStr;
//  }
    
//  public String defaultStr() {
//  	return "상속자식: "+super.defaultStr();//
//  }
//    
    public String protectedStr(){
    	return "상속자식: "+super.protectedStr();
    }
    
    public String publicStr(){
    	System.out.println(super.sameVar);
    	return "상속자식: "+super.publicStr();
    }
}
