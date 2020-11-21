
public class TestShape {
	public static void main(String args[])
	{
		Shape objShape=new Shape();
		System.out.println("COLOUR : "+objShape.getColour());
		System.out.println("Filled : "+objShape.isFilled());
		objShape.setColour("Black");
		objShape.setFilled(false);
		System.out.println(objShape.toString());
	}
}
