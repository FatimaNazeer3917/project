package Hospital;
import javax.swing.JTextField;

import General.Date;
import General.Time;
import javax.swing.JOptionPane;

public class Patient {
	private String name;
	private long cnic;
	private long mobile_no;
	private char gender;
	private int age;
	private Doctor doctor;
	Patient()
	{
		name="a";
		cnic=0;
		mobile_no=0;
		gender='f';
		age=0;
		doctor=new Doctor();
	}
	Patient(String n,long c,long m,char g,int a)
	{
		name=n;
		cnic=c;
		mobile_no=m;
		gender=g;
		age=a;
	}
	void setName(String n)
	{
		name=n;
	}
	void setCnic(long c)
	{
		cnic=c;
	}
	void setMobile_no(long m)
	{
		mobile_no=m;
	}
	void setGender(char g)
	{
		gender=g;
	}
	void setAge(int a)
	{
		age=a;
	}
	String getName()
	{
		return name;
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
	int getAge()
	{
		return age;
	}
	Doctor get_Doctor()
	{
		return doctor;
	}
	String get_Doctor_name()
	{
		return doctor.getName();
	}
	void addInfo(Doctor[] obj,int no)
	{
		int count=0;
		JTextField Name=new JTextField();
		JTextField Age=new JTextField();
		JTextField Cnic=new JTextField();
		JTextField Mobile_no=new JTextField();
		JTextField Gender=new JTextField();
		Object[] input={
			"Enter name of Patient.",Name,
			"Enter age of Patient.",Age,
			"Enter cnic of Patient.",Cnic,
			"Enter mobile no of Patient.",Mobile_no,
				"Enter gender of Patient.",Gender,
		};
		JOptionPane.showMessageDialog(null, input, "Patient Information", JOptionPane.OK_OPTION);
		name=Name.getText();
		age=Integer.parseInt(Age.getText());
		cnic =Long.parseLong(Cnic.getText());
		mobile_no= Long.parseLong(Mobile_no.getText());
		gender=Gender.getText().charAt(0);
		do
		{
			String doctor_name=JOptionPane.showInputDialog("Enter name of Doctor.");
			if(searchByName(obj,doctor_name,no))
			{
				 count=1;
			}
			else
			{
				 count=0;
				 JOptionPane.showMessageDialog(null, "No such doctor exsist.");
			}
		}
		while(count==0);
		/*String temp1;
		name=JOptionPane.showInputDialog("Enter name of Patient.");
		temp1=JOptionPane.showInputDialog("Enter cnic of Patient.");
		cnic=Integer.parseInt(temp1);
		temp1=JOptionPane.showInputDialog("Enter mobile no of patient.");
		mobile_no=Integer.parseInt(temp1);
		temp1=JOptionPane.showInputDialog("Enter gender of patient.");
		gender=temp1.charAt(0);
		temp1=JOptionPane.showInputDialog("Enter age of patient.");
		age=Integer.parseInt(temp1);*/
	}
	String showInfo()
	{
		String temp;
		temp="Name : "+name+"\n"+
			 "Age : "+age+"\n"+
			 "CNIC : "+String.valueOf(cnic)+"\n"+
			 "Mobile no : "+String.valueOf(mobile_no)+"\n"+
			 "Gender : "+String.valueOf(gender)+"\n";
		
			
		return temp;
	}
	boolean searchByName(Doctor[] obj_Doctor, String name,int no)  // It is use When patient info is enter to set doctor name 
	{
		int count=0;
		for(int i=0; i<no; i++)
		{
			if(name.equalsIgnoreCase(obj_Doctor[i].getName()))
			{
				count++;
				doctor=obj_Doctor[i];
			}
		}
		if(count==0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	Date getdate_of_admission()
	{
		Date date_of_admission=new Date();
		return date_of_admission;
	}
	Date getDate()
	{
		Date date_of_appointment=new Date();
		return date_of_appointment;
	}
	Time getTime()
	{
		Time time_of_appointment=new Time();
		return time_of_appointment;
	}
	void setDate()
	{
		Date date_of_admission=new Date();
		date_of_admission.addDate();
	}
	void setTime()
	{
		Time time_of_admission=new Time();
		time_of_admission.addTime();
	}
}
