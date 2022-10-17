package study;

class Aqe{
	int k = 100;
	public void test(){
		System.out.println("test");
	}
}
interface Bqe{
	int YEAR = 2022;   // 인터페이스안의 변수는 자동 final입니다.
	public void hello();
}
interface Cqe{
	String title = "JAVA";
	public void pro();
}

class D extends Aqe implements Bqe,Cqe{
	String name = "홍길동";
	public void sayHello(){
		System.out.println("안녕"+name);
	}
	public void hello(){
		System.out.println("hello입니다.");
	}
	public void pro(){
		System.out.println("pro입니다.");
	}
}


class InterfaceTest03 {
	public static void main(String[] args) {
		D ob = new D();
		ob.test();
		ob.hello();
		ob.pro();
		ob.sayHello();
		ob.k= 200;
		//ob.YEAR = 2023;   // 인터페이스 안의 변수는 자동 상수이므로 변경할 수 없어요!
	}
}

/*
C:\javaStudy\day0822>javac InterfaceTest05.java
InterfaceTest05.java:38: error: cannot assign a value to final variable YEAR
                ob.YEAR = 2023;
                  ^
1 error
*/