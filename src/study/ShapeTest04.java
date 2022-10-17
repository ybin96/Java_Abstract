package study;

abstract class Shapeaa{
	public abstract void draw();
}
class Rectaa extends Shapeaa{
	public void draw(){
		System.out.println("사각형을 그립니다.");
	}
}
class Circleaa extends Shapeaa{
	public void draw(){
		System.out.println("원을 그립니다.");
	}
}
class ShapeTest04 {
	public static void main(String[] args) {
		Rectaa r1 = new Rectaa();
		Circleaa c1 = new Circleaa();
		r1.draw();
		c1.draw();
	}
}
