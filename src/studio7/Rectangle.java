package studio7;

public class Rectangle {
	
	private int length;
	private int width;
	private double area;
	private double perimeter;
	
	
	public Rectangle(int width, int length)
	{
		this.length = length;
		this.width = width;
		this.area = width*length;
		this.perimeter = 2 * width + 2 * length;
		
	}
	
	public boolean isSquare()
	{
		
		if (this.length == this.width)
		{
			System.out.println("I'm a square!");
			return true;
		}
		else
		{
			System.out.println("I'm not a square");
			return false;
		}
	}
	
	public static void main(String[]args)
	{
		Rectangle r = new Rectangle(4,5);
		System.out.println(r.area);
		Rectangle r2 = new Rectangle(3,5);
		System.out.println(r.isSquare());
		System.out.println(r.isBigger(r2));
		
	}
	
	public boolean isBigger(Rectangle r2)
	{
		if (this.area > r2.area)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
