package polymorphism;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.annotation.Resource;
//@Component
@Component("tv")
public class LgTV implements TV {
	//by Type p105-106
	//@Autowired 
	//p107
	//@Qualifier("apple")
	//p109
	@Resource(name="apple")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("===>LgTV 객체 생성");
	}
	public void powerOn() {
		System.out.println("LgTV ---전원켠다");
	}
	public void powerOff() {
		System.out.println("LgTV ---전원끈다");
	}
	public void volumeUp() {
		
		//p105-106
		speaker.volumeUp();
		
//		System.out.println("LgTV ---소리 올린다");
	}
	public void volumeDown() {
		//p105-106
		speaker.volumeDown();
		
//		System.out.println("LgTV ---소리 내린다");
	}
}
