package third;

interface Drawable {
	int ab = 5;//final
	public abstract void draw();
}

abstract class Shape{
	public double res = 0;
	
	public Shape() {
		System.out.println("출력");
	}//생성자는 상속되지 않는다.

	public abstract double area();
	
	public void printArea() {
		System.out.println( "면적은 " + res );
	}
}

class Rectangle extends Shape implements Drawable {
	public int w = 10, h = 10;

	@Override
	public double area() {//추상클래스 이므로 오버라이드 권장
		res = w * h;//double
		return res;
	}

	public void draw() {
		System.out.println("사각형을 그리다.");
	}
}

public class Exam03 {
	public static void main(String[] args) {
		Rectangle ref = new Rectangle(); 
		double d=ref.area();
		System.out.println(d);
		ref.printArea();
		ref.draw();
		System.out.println("인터페이스 ab값: "+ref.ab);  
	}
}