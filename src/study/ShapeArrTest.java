package study;

class Shape{
	protected int x;
	protected int y;
	protected String type;
	public Shape(int x, int  y, String type){
		this.x = x;
		this.y = y;
		this.type = type;
	}
	public String toString(){
		return "도형의 종류:"+ type+ ",x:"+x+",y:"+y;
	}
}

abstract class TwoDimShape extends Shape{
		
	public TwoDimShape(int x, int y, String type){
		super(x,y,type);
	}
	protected double area;
	public abstract double getArea();
}

abstract class ThreeDimShape extends Shape
{
	public ThreeDimShape(int x, int  y, String type){
		super(x,y,type);
	}
	protected double volume;
	public abstract double getVolume();
}

class Rectangle extends TwoDimShape{
	private double width;
	private double height;
	public Rectangle(int x, int y, double width, double height){
		super(x,y,"Rectangle");
		this.width = width;
		this.height = height;
	}
	public double getArea(){
		area = width * height;
		return area;
	}

	public String toString(){
		return super.toString() +  "밑변:"+width + ",높이:"+height;
	}
}

class Triangle extends TwoDimShape{
	private double width;
	private double height;

	public String toString(){
		return super.toString() +  "밑변:"+width + ",높이:"+height;
	}


	public Triangle(int x, int y, double width, double height){
		super(x,y,"Triangle");
		this.width = width;
		this.height = height;
	}
	public double getArea(){
		area = width * height / 2;
		return area;
	}
}

class Cube extends ThreeDimShape{
	private double width;
	private double length; 
	private double height;

	public Cube(int x, int y, double width, double length, double height){
		super(x,y,"Cube");
		this.width = width;
		this.length = length;
		this.height = height;
	}

	public double getVolume(){
		volume = width * length * height;
		return volume;
	}

	public String toString(){
		return super.toString() + "가로:"+width +",세로:"+length+",높이:"+height;
	}
}


class Cylinder extends ThreeDimShape{
	private double radius;
	private double height;
	public Cylinder(int x, int y, double radius, double height){
		super(x,y,"Cylinder");
		this.radius = radius;
		this.height = height;
	}
	public double getVolume(){
		volume = 3.14 * radius * radius * height;
		return volume;
	}
}

class ShapeArrTest {
	public static void main(String[] args) {
		Shape [] arr = new Shape[3];
		//사각형,삼각형,직육면체,원기둥
		arr[0] = new Rectangle(10,10,100,200);
		arr[1] = new Triangle(100,10,100,200);
		arr[2] = new Cylinder(200,10,5,20);

		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
			if(arr[i] instanceof TwoDimShape){
				System.out.println("면적:" + ((TwoDimShape)arr[i]).getArea());
			}
			if(arr[i] instanceof ThreeDimShape){
				System.out.println("부피:" + ((ThreeDimShape)arr[i]).getVolume());
			}
			System.out.println("---------------------------------");
		}
	}	
}
