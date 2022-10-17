package study;

class A{
	public void hello(){
	}
}

class B extends A{

}

class AbstractTest 
{
	public static void main(String[] args) 
	{
		B ob = new B();
		ob.hello();
	}
}
