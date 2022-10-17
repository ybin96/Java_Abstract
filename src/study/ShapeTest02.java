package study;

abstract class Shaper	{
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
	public Shaper(int x, int y){
		this.x = x;
		this.y = y;
	}
	public Shaper(){
	}
}

class Rectr extends Shaper{
	private double width;
	private double height;

	public String toString(){
		return "x:"+x +",y:"+y+",width:"+width+",height:"+height+",area:"+area;
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
	public Rectr(int x, int y, double width, double height){
		super(x,y);
		this.width = width;
		this.height = height;
	}
	public Rectr(){
	}
}

class Circler extends Shaper{
	private double radius;

	public String toString(){
		return "x:"+x+",y:"+y+",radius:"+radius+",area:"+area;
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
	public Circler(int x, int y, double radius){
		super(x,y);
		this.radius = radius;
	}
	public Circler(){
	}
}

class ShapeTest02 
{
	public static void main(String[] args) 
	{
		Rectr r = new Rectr(10,10,100,200);
		Circler c = new Circler(100,100,50);
		r.calcArea();
		c.calcArea();
		
		System.out.println(r);
		System.out.println(c);
		

	}
}
