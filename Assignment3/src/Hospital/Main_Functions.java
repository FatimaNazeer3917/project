package Hospital;

import javax.swing.JOptionPane;

public class Main_Functions {
	void searchByName(Doctor[] obj_Doctor, int no)
	{
		String temp2="";
		int count=0,temp3=0;
		String name= JOptionPane.showInputDialog("Enter Name of doctor you want to search.");
		for(int i=0; i<no; i++)
		{
			if(name.equalsIgnoreCase(obj_Doctor[i].getName()))
			{
				temp3++;
				count++;
				temp2=temp2+"           **** Doctor "+temp3+" : ****"+"\n"+obj_Doctor[i].showInfo();  // More than one doctor can have same name
				                                                                                     //  so show all doctors info with same name.
			}
		}
		if(count==0)
		{
			JOptionPane.showMessageDialog(null, "Doctor Not Found", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			JOptionPane.showMessageDialog(null, temp2, "Doctor Info", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	void searchByDepartment(Doctor[] obj_Doctor, int no)
	{
		String  temp2="";
		int count=0,temp3=0;
		String department=JOptionPane.showInputDialog("Enter Department of doctor you want to search.");
		for(int i=0; i<no; i++)
		{
			if(department.equals(obj_Doctor[i].getDepartment()))
			{
				temp3++;
				count++;
				temp2=temp2+"           **** Doctor "+temp3+" : ****"+"\n"+obj_Doctor[i].showInfo();
			}
		}
		if(count==0)
		{
			JOptionPane.showMessageDialog(null, "Department Not Found", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			JOptionPane.showMessageDialog(null, temp2, "Doctor Info", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	String showDoctorInfo(Doctor[] obj_Doctor, int no)
	{
		int temp1=0;
		String temp2="           **** Doctor 1 : ****"+"\n"+obj_Doctor[0].showInfo();
		for(int i=1; i<no; i++)
		{
			temp1=i+1;
			temp2=temp2+"           **** Doctor "+temp1+" : ****"+"\n"+obj_Doctor[i].showInfo();
		}
		return temp2;
	}
}
