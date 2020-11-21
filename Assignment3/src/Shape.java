
public class Shape {
	private String colour ="red";
	private boolean filled=true;
	Shape()
	{
		colour="green";
		filled=true;
	}
	Shape(String c, boolean f)
	{
		colour=c;
		filled=f;
	}
	String getColour()
	{
		return colour;
	}
	void setColour(String c)
	{
		colour=c;
	}
	boolean isFilled()
	{
		return filled;
	}
	void setFilled(boolean f)
	{
		filled=f;
	}
	public String toString()
	{
		String temp="";
		if(isFilled())
			temp="A Shape with colour of ".concat(colour).concat(" and filled.");
		else
			temp="A Shape with colour of ".concat(colour).concat(" and not filled.");
		return(temp);
	}
}
