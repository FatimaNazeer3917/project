import java.util.Scanner;
public class TestProgram {
	public static void main(String args[])
	{
		int option=0;
		Shape objShape;
		do
		{
			System.out.println("    ***MENU***   ");
			System.out.println("1- Do you want to enter Circle info.");
			System.out.println("2- Do you want to enter Rectangle info.");
			System.out.println("3- Do you want to enter Square info.");
			System.out.println("4- Exit.");
			Scanner input=new Scanner(System.in);
			option=input.nextInt();
			if(option==1)
			{
				Scanner input1=new Scanner(System.in);
				System.out.println("Enter radius.");
				double radius=input1.nextDouble();
				Scanner input2=new Scanner(System.in);
				System.out.println("Enter colour.");
				String colour=input2.nextLine();
				Scanner input3=new Scanner(System.in);
				System.out.println("The shape is filled. [true/ false].");
				boolean fill=input3.nextBoolean();
				Circle objCircle=new Circle(colour,fill,radius);
				objShape=objCircle;
				System.out.println(objShape.toString());
				System.out.println("Area : "+objCircle.getArea());
				System.out.println("Perimeter : "+objCircle.getParimeter());
			}
			else if(option==2)
			{
					System.out.println("Enter length.");
					Scanner input1=new Scanner(System.in);
					double length=input1.nextDouble();
					System.out.println("Enter width.");
					double width=input1.nextDouble();
					Scanner input2=new Scanner(System.in);
					System.out.println("Enter colour.");
					String colour=input2.nextLine();
					Scanner input3=new Scanner(System.in);
					System.out.println("The shape is filled. [true/ false].");
					boolean fill=input3.nextBoolean();
					Rectangle objRectangle=new Rectangle(length,width,colour,fill);
					objShape=objRectangle;
					System.out.println(objShape.toString());
					System.out.println("Area : "+objRectangle.getArea());
					System.out.println("Perimeter : "+objRectangle.getParimeter());
		}
			else if(option==3)
			{
					System.out.println("Enter side length.");
					Scanner input1=new Scanner(System.in);
					double length=input1.nextDouble();
					Scanner input2=new Scanner(System.in);
					System.out.println("Enter colour.");
					String colour=input2.nextLine();
					Scanner input3=new Scanner(System.in);
					System.out.println("The shape is filled. [true/ false].");
					boolean fill=input3.nextBoolean();
					Square objSquare=new Square(length,colour,fill);
					objShape=objSquare;
					System.out.println(objShape.toString());
					System.out.println("Area : "+objSquare.getArea());
					System.out.println("Perimeter : "+objSquare.getParimeter());
			}
			else if(option==4)
				System.out.println("   *** THANK YOU ***");
			else
				System.out.println("   *** Wrong Input ***");
		}
		while(option!=4);
		}
	}

