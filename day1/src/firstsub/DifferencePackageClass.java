package firstsub;

import first.SamePackage;

public class DifferencePackageClass {

	public static void main(String[] args) {
		SamePackage sp = new SamePackage();
		
//		System.out.println(sp.sameVar);//main클래스가 아니라면 상속받아서 접근 가능함
//		System.out.println(sp.privateStr());
//		System.out.println(sp.defaultStr());
//		System.out.println(sp.protectedStr());
		System.out.println(sp.publicStr());
		
		SamePackageSub ss = new SamePackageSub();
		
		System.out.println(ss.sameVar);
//		System.out.println(ss.privateStr());
//		System.out.println(ss.defaultStr());
		System.out.println(ss.protectedStr());
		System.out.println(ss.publicStr());
		
	}

}
