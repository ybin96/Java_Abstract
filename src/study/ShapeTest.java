package study;

abstract class Shapes	{
	protected int x;
	protected int y;
	protected double area;
	public double getArea(){
		return area;
	}
	public int getY(){
		return y;
	}
	public int getX(){
		return x;
	}
	public void setY(int y){
		this.y = y;
	}
	public void setX(int x){
		this.x = x;
	}

	abstract public void calcArea();
	public Shapes(int x, int y){
		this.x = x;
		this.y = y;
	}
	public Shapes(){
	}
}

class Rect extends Shapes{
	private double width;
	private double height;
	
	public void calcArea(){
		area = width * height;
	}

	public double getHeight(){
		return height;
	}
	public double getWidth(){
		return width;
	}
	public void setHeight(double height){
		this.height = height;
	}
	public void setWidth(double width){
		this.width =width;
	}
	public Rect(int x, int y, double width, double height){
		super(x,y);
		this.width = width;
		this.height = height;
	}
	public Rect(){
	}
}

class Circle extends Shapes{
	private double radius;
	public void calcArea(){
		area = 3.14 * radius * radius;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	public Circle(int x, int y, double radius){
		super(x,y);
		this.radius = radius;
	}
	public Circle(){
	}
}

class ShapeTest 
{
	public static void main(String[] args) 
	{
		Rect r = new Rect(10,10,100,200);
		Circle c = new Circle(100,100,50);
		r.calcArea();
		c.calcArea();
		
		System.out.println("x:" + r.getX());
		System.out.println("y:" + r.getY());
		System.out.println("가로:" + r.getWidth());
		System.out.println("세로:" + r.getHeight());
		System.out.println("면적:" + r.getArea());
		System.out.println();
		System.out.println("x:" + c.getX());
		System.out.println("y:" + c.getY());
		System.out.println("반지름:" +c.getRadius());
		System.out.println("면적:" + c.getArea());

	}
}
