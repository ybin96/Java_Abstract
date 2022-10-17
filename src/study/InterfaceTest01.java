package study;

interface q{
	public void draw();
}
class r implements q{
	public void draw(){
		System.out.println("사각형을 그립니다.");
	}
}
class c implements q{
	public void draw(){
		System.out.println("원을 그립니다.");
	}
}
class t implements q{
	public void draw(){
		System.out.println("삼각형을 그립니다.");
	}
}



class InterfaceTest01 {
	public static void main(String[] args) {
		q ob1 = new t();	
		q ob2 = new r();
		q ob3 = new c();
		ob1.draw();
		ob2.draw();
		ob3.draw();

	}
}
