package study;

abstract class Shapez	{
	protected int x;
	protected int y;
	protected double area;
	
	public String toString(){
		return "x:"+x+",y:"+y+",area:"+area;
	}

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
	public Shapez(int x, int y){
		this.x = x;
		this.y = y;
	}
	public Shapez(){
	}
}

class Rectq extends Shapez{
	private double width;
	private double height;

	public String toString(){
		return    super.toString()+ ",width:"+width+",height:"+height;
	}
	
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
	public Rectq(int x, int y, double width, double height){
		super(x,y);
		this.width = width;
		this.height = height;
	}
	public Rectq(){
	}
}

class Circles extends Shapez{
	private double radius;

	public String toString(){
		return  super.toString()+  ",radius:"+radius;
	}

	public void calcArea(){
		
		area = 3.14 * radius * radius;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	public Circles(int x, int y, double radius){
		super(x,y);
		this.radius = radius;
	}
	public Circles(){
	}
}

class ShapeTest03 
{
	public static void main(String[] args) 
	{
		Rectq r = new Rectq(10,10,100,200);
		Circles c = new Circles(100,100,50);
		r.calcArea();
		c.calcArea();
		
		System.out.println(r);
		System.out.println(c);
		

	}
}
