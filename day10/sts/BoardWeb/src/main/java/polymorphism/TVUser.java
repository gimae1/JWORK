package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class TVUser {
	public static void main(String[] args) {
		//1.Spring 컨테이너를 구동한다.
		AbstractApplicationContext factory =
			new GenericXmlApplicationContext("annotationContext.xml");
//bean 명령어 때문에 	SamsungTv tv=new SamsungTv(); 을 컨테이너에 가지고 있는 샘이다
		//factory 객체가 컨테이너 구동시켜 xml 읽어오는  
		
		//2.Spring 컨테이너로부터 필요한 객체를 요청(LookUp) 한다.
		
		
//		TV tv = (TV)factory.getBean("tv");
//		TV tv1 = (TV)factory.getBean("tv");
//		TV tv2 = (TV)factory.getBean("tv");
		
//		LgTV tv = new LgTV();
//		TV tv = (TV)factory.getBean("lgTV");
		TV tv = (TV)factory.getBean("tv");
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		//3.Spring 컨테이너를 종료한다.
		factory.close();
		//factory 닫지 않으면 계속 열려있게 된다. 
		
//---------------------------------------------------------		
//		BeanFactory factory = new BeanFactory();
//		
//		TV tv = (TV)factory.getBean(args[0]);
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
	

		
	}
}
