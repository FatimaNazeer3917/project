package Hospital;
import javax.swing.JTextField;

import javax.swing.JOptionPane;
public class Doctor {
	private String name;
	private long cnic;
	private long mobile_no;
	private char gender;
	private String department;
	private String specialization;
	Doctor()
	{
		name="a";
		cnic=0;
		mobile_no=0;
		gender='f';
		department="a";
		specialization="a";
	}
	Doctor(String a,int c,long m, char g, String d, String s)
	{
		name=a;
		cnic=c;
		mobile_no=m;
		gender=g;
		department=d;
		specialization=s;
	}
	void setName(String n)
	{
		name=n;
	}
	void setDepartment(String d)
	{
		department=d;
	}
	void setSpecialization(String s)
	{
		specialization=s;
	}
	void setCnic(long c)
	{
		cnic=c;
	}
	void setMobile(long m)
	{
		mobile_no=m;
	}
	void setGender(char g)
	{
		gender=g;
	}
	String getName()
	{
		return name;
	}
	String getDepartment()
	{
		return department;
	}
	String getSpecialization()
	{
		return specialization;
	}
	long getCnic()
	{
		return cnic;
	}
	long getMobile_no()
	{
		return mobile_no;
	}
	char getGender()
	{
		return gender;
	}
	void addInfo()
	{
		JTextField Name=new JTextField();    // Take doctor Input
		JTextField Department=new JTextField();
		JTextField Cnic=new JTextField();
		JTextField Mobile_no=new JTextField();
		JTextField Gender=new JTextField();
		JTextField Specialization=new JTextField();
		Object[] input={
			"Enter name of Doctor.",Name,
			"Enter department of Doctor.",Department,
			"Enter cnic of Doctor.",Cnic,
			"Enter mobile no of Doctor.",Mobile_no,
			"Enter gender of Doctor.",Gender,
			"Enter Specialization of Doctor.",Specialization
		};
		JOptionPane.showMessageDialog(null, input, "Doctor Information", JOptionPane.OK_OPTION); // End
		name=Name.getText();      // Set values in instances of Doctor class 
		department=Department.getText();
		cnic=Long.parseLong(Cnic.getText());
		mobile_no=Long.parseLong(Mobile_no.getText());
		gender=Gender.getText().charAt(0);
		specialization=Specialization.getText(); // End
		/*String temp1;
		name=JOptionPane.showInputDialog("Enter name of Doctor.");
		department=JOptionPane.showInputDialog("Enter department of Doctor.");
		temp1=JOptionPane.showInputDialog("Enter cnic of Doctor.");
		cnic=Integer.parseInt(temp1);
		temp1=JOptionPane.showInputDialog("Enter mobile no of Doctor.");
		mobile_no=Integer.parseInt(temp1);
		temp1=JOptionPane.showInputDialog("Enter gender of Doctor.");
		gender=temp1.charAt(0);
		specialization=JOptionPane.showInputDialog("Enter Specialization of Doctor.");*/
		
	}
	String showInfo()
	{
		String temp;
		temp="Name : "+name+"\n"+
		     "Department : "+department+"\n"+
			 "CNIC : "+String.valueOf(cnic)+"\n"+
		     "Mobile no : "+String.valueOf(mobile_no)+"\n"+
			 "Gender : "+String.valueOf(gender)+"\n"+
		     "Specialization : "+specialization+"\n";
		return temp;
	}
	
}
