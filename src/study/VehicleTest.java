package study;

abstract class Vehicler{
	public abstract double getKilosPerLiter();
	int speed;
	public void printSpeed(){
		System.out.println("현재속도:" + speed);
	}
}
class Carr extends Vehicler{
	public double getKilosPerLiter(){
		return 10;
	}
}
class VehicleTest {
	public static void main(String[] args) {
		//Vehicle ob = new Vehicle();  // 추상클래스의 객체는 생성할 수 없어요!
		Carr myCar = new Carr();
		System.out.println(myCar.getKilosPerLiter());
		myCar.printSpeed();
	}
}

/*
C:\javaStudy\day0819>javac VehicleTest.java
VehicleTest.java:12: error: Vehicle is abstract; cannot be instantiated
                Vehicle ob = new Vehicle();
                             ^
1 error
*/

