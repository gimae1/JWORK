package polymorphism;

public class SamsungTV implements TV {//상속 받고 모두다 재정의 (override)해 주어야 한다
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===>SamsungTV 객체 생성");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("===> setPrice() 호출");
		this.price = price;
	}
	
	
//	public SamsungTV(Speaker speaker) {
//		System.out.println("===>SamsungTV(2)객체 생성");
//		this.speaker =speaker;
//	}
	
	//Speaker speaker =new AppleSpeaker
//	public SamsungTV(Speaker speaker, int price) {
//		System.out.println("===>SamsungTV(3) 객체 생성");
//		this.speaker = speaker;
//		this.price = price;
//	}
//	public SamsungTV( int price ,Speaker speaker) {
//		System.out.println("===>SamsungTV(4) 객체 생성");
//		this.speaker = speaker;
//		this.price = price;
//	}
	@Override
	public void powerOn() {
		System.out.println("SamsungTV ---전원켠다. (가격 : "+price+")");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV ---전원끈다");
	}
	public void volumeUp() {
		speaker = new SonySpeaker();
		speaker.volumeUp();
//		System.out.println("SamsungTV ---소리 올린다");
	}
	public void volumeDown() {
		speaker = new SonySpeaker();
		speaker.volumeDown();
//		System.out.println("SamsungTV ---소리 내린다");
	}
	
//	public void initMethod() {
//		System.out.println("객체 초기화 작업 처리...");
//		
//	}
//	
//	public void destroyMethod() {
//		System.out.println("객체 해제 전에 처리할 로직 처리");
//	}
}
