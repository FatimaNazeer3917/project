
public class Rectangle extends Shape {
	private double width;
	private double length;
	Rectangle()
	{
		super();
		width=length=1.0;
	}
	Rectangle(double w,double l)
	{
		width=w;
		length=l;
	}
	Rectangle(double w,double l,String c, boolean f)
	{
		super(c,f);
		width=w;
		length=l;
	}
	double getWidth()
	{
		return width;
	}
	void setWidth(double w)
	{
		width=w;
	}
	double getLength()
	{
		return length;
	}
	void setLength(double l)
	{
		length=l;
	}
	double getArea()
	{
		return(length*width);
	}
	double getParimeter()
	{
		return(2*(length+width));
	}
	public String toString()
	{
		String temp="A Rectangle with width= ".concat(String.valueOf(getWidth())).concat(" and length= ").concat(String.valueOf(getLength())).concat(", which is a subclass of ").concat(super.toString());
		return(temp);
	}
}
