package study;

abstract class Vehicle{
	protected int speed;
	public abstract double getKilosPerLiter();
	public void printSpeed(){
		System.out.println("현재속도:" + speed);
	}
}

interface Movable {
	public void speedUp(int amount);
	public void speedDown(int amount);
}

class Car extends Vehicle implements Movable{
	private String name;
	private String color;
	public Car(String name, String color){
		this.name = name;
		this.color = color;
	}
	public double getKilosPerLiter(){
		return 2;
	}
	public void speedUp(int amount){
		speed += amount;
		System.out.println(amount+"만큼 속도를 증가하였습니다.");
	}
	public void speedDown(int amount){
		speed -= amount;
		System.out.println(amount+"만큼 속도를 감소하였습니다.");
	}
	public void turnLeft(){
		System.out.println("좌회전합니다.");
	}
	public void turnRight(){
		System.out.println("우회전합니다.");
	}
}

class CarTest{
	public static void main(String[] args) 
	{
		Car myCar = new Car("람보르기니","검정");		
		myCar.speedUp(150);
		myCar.speedDown(10);
		myCar.printSpeed();
		myCar.turnLeft();
		myCar.turnRight();
		System.out.println("------------------------------");
		Car yourCar = new Car("티코", "빨강");
		yourCar.speedUp(80);
		yourCar.speedDown(30);
		yourCar.printSpeed();
		yourCar.turnLeft();
		yourCar.turnRight();
	}
}
