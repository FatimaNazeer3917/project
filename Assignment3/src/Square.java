
public class Square extends Rectangle {
	Square()
	{
		super();
	}
	Square(double side)
	{
		super(side,side);
	}
	Square(double side,String c, boolean f)
	{
		super(side,side,c, f);
	}
	public String toString()
	{
		String temp="A Square with side= ".concat(String.valueOf(getSide())).concat(", which is a subclass of ").concat(super.toString());
		return(temp);
	}
	void setSide(double side)
	{
		super.setLength(side);
		super.setWidth(side);
	}
	double getSide()
	{
		return super.getWidth();
	}
	void setLength(double l)
	{
		super.setLength(l);
		super.setWidth(l);
	}
	void setWidth(double w)
	{
		super.setLength(w);
		super.setWidth(w);
	}
	
}
