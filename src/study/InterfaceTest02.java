package study;

interface Aq{
	public void pro();
}
interface Bq{
	public void hello();
}
class Cq implements Aq,Bq{
	public void pro(){
		System.out.println("pro입니다.");
	}
	public void hello(){
		System.out.println("hello입니다.");
	}
}
class InterfaceTest02 {
	public static void main(String[] args) {
		Cq ob = new Cq();
		ob.pro();
		ob.hello();
	}
}
