
public class Circle extends Shape {
	private double radius=1.0;
	Circle()
	{
		super();
		radius=1.0;
	}
	Circle(String c, boolean f,double r)
	{
		super(c, f);
		radius=r;
	}
	double getRadius()
	{
		return radius;
	}
	void setRadius(double r)
	{
		radius=r;
	}
	double getArea()
	{
		return(3.14*radius*radius);
	}
	double getParimeter()
	{
		return(2*radius*3.14);
	}
	public String toString()
	{
		String temp="A Circle with radius= ".concat(String.valueOf(getRadius())).concat(",which is a subclass of ").concat(super.toString());
		return(temp);
	}
}
