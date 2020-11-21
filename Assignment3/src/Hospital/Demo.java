package Hospital;
import javax.swing.JOptionPane;
import General.Date.*;
public class Demo {

	public static void main(String[] args) {
		String temp="";
		
		int choice=0,no=-1, temp1=0,count=-1;
		Patient[] obj_Patient=new Patient[100];
		temp=JOptionPane.showInputDialog("How many doctors you want to add.");
		no=Integer.parseInt(temp);
		Doctor[] obj_Doctor=new Doctor[no];
		if(no!=0)
		{
			for(int i=0; i<no; i++)
			{
				temp1=i+1;
				JOptionPane.showMessageDialog(null,"Enter Doctor "+temp1+" Info :");
				obj_Doctor[i]=new Doctor();
				obj_Doctor[i].addInfo();
			}
		}
		else
			no=-1;
		do
		{
			
			temp=JOptionPane.showInputDialog("Choose an option."+
											"\n"+" 1- Add an indoor patient."+
											"\n"+" 2- Add an outdoor patient."+
											"\n"+" 3- See the list of all doctors."+
											"\n"+" 4- Search a doctor by name or department."+
											"\n"+" 5- See the list of all indoor patients. "+
											"\n"+" 6- See the list of all the appointment on the single day."+
											"\n"+" 7- See the list of appointments of a certain doctor"+"\n"+
											" 8- Change the date or time of appointment of a certain patient."+
											"\n"+"9- Exit");
			
			choice=Integer.parseInt(temp);
			if(choice == 1)
			{
				count++;
				Patient obj_IndoorPatient=new Indoor_Patient();
				obj_Patient[count]=obj_IndoorPatient;
				obj_Patient[count].addInfo(obj_Doctor,no);
			}
			else if(choice==2)
			{
				count++;
				Patient obj_OutdoorPatient=new Outdoor_Patient();
				obj_Patient[count]=obj_OutdoorPatient;
				obj_Patient[count].addInfo(obj_Doctor,no);
			}
			else if(choice==3)
			{
				if(no!=-1)
				{
					Main_Functions obj=new Main_Functions();
					JOptionPane.showMessageDialog(null,obj.showDoctorInfo(obj_Doctor, no), "Doctors Information ", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"No Doctor entered.", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
			else if(choice==4)
			{
				if(no!=-1)
				{
					temp=JOptionPane.showInputDialog("Choose an option."+
							"\n"+" 1- Search by name."+
							"\n"+" 2- Search by department.");
					choice=Integer.parseInt(temp);
					if(choice==1)
					{
						Main_Functions obj=new Main_Functions();
					    obj.searchByName(obj_Doctor, no);
						
					}
					else if(choice==2)
					{
						Main_Functions obj=new Main_Functions();
					    obj.searchByDepartment(obj_Doctor, no);
					}
					else 
					{
						JOptionPane.showMessageDialog(null, "Wrong Input", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null,"No Doctor entered.", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
			else if(choice==5)
			{
				if(count!=-1)
				{
					String temp2="";
					temp1=0;
					for(int i=0;i<=count;i++)
					{
						if(obj_Patient[i] instanceof Indoor_Patient)
						{
	
								temp1=temp1+1;
								temp2=temp2+"           **** Patient "+temp1+" : ****"+"\n"+obj_Patient[i].showInfo();
						}
							
					}
					if(temp1!=0)
					{
						JOptionPane.showMessageDialog(null,temp2, "Patients Information ", JOptionPane.INFORMATION_MESSAGE);
					}
					else
						JOptionPane.showMessageDialog(null,"No Indoor Patient entered.", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				else
				{
					JOptionPane.showMessageDialog(null,"No Patient entered.", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
			else if(choice==6)
			{
				if(no !=-1 && count!=-1)
				{
					General.Date objdate=new General.Date();
					temp1=0;
					String tempdate="";
					objdate.addDate();
					for(int i=0;i<=count;i++)
					{
						if(obj_Patient[i] instanceof Outdoor_Patient)
						{
							if(obj_Patient[i].getDate().compareDate(objdate))
							{
									temp1=temp1+1;
									tempdate=tempdate+"           **** Appointment "+temp1+" : ****"+"\n"+obj_Patient[i].showInfo();
							}
						}
					}
					if(temp1!=0)
					{
						JOptionPane.showMessageDialog(null, tempdate, "Appoinment details", JOptionPane.OK_OPTION);
					}
					else
						JOptionPane.showMessageDialog(null,"No Appointment on given date.", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"No patient entered.", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
			else if(choice==7)
			{
				if(no !=-1 && count!=-1)
				{
					temp1=0;
					String doctor=JOptionPane.showInputDialog("Enter name of Doctor.");
					String temp2="           **** Doctor Name : "+doctor+" : ****"+"\n";
					for(int i=0;i<=count;i++)
					{
						if(obj_Patient[i] instanceof Outdoor_Patient)
						{
							if(doctor.equalsIgnoreCase(obj_Patient[i].get_Doctor_name()))
							{
								temp1=temp1+1;
								temp2=temp2+"           **** Appointment "+temp1+" : ****"+"\n"+
										"Name : "+obj_Patient[i].getName()+"\n"+
										"Age : "+obj_Patient[i].getAge()+"\n"+
										"Date Of appointment : "+obj_Patient[i].getDate().showDate()+"\n"+
										 "Time Of appointment : "+obj_Patient[i].getTime().showTime()+"\n";
							}
						}
					}
					if(temp1!=0)
					{
						JOptionPane.showMessageDialog(null, temp2, "Appoinment details", JOptionPane.OK_OPTION);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"No Appointment of the doctor on given date.", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null,"No Doctor or Patient entered .", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
					
			}
			else if(choice==8)
			{
				if(count!=-1)
				{
					temp1=0;
					String temp2="";
					temp2=JOptionPane.showInputDialog("Enter name of patient");
					for(int i=0;i<=count;i++)
					{
						if(obj_Patient[i].getName().equalsIgnoreCase(temp2))
						{
							temp1++;
								temp=JOptionPane.showInputDialog("Choose an option."+
										"\n"+" 1- Change date."+
										"\n"+" 2- Change time.");
								choice=Integer.parseInt(temp);
								
								if(choice==1)
								{
									if(obj_Patient[i] instanceof Outdoor_Patient)
									{
									obj_Patient[i].setDate();
									obj_Patient[i].setTime(); // as time also have to be change with date
									JOptionPane.showMessageDialog(null, obj_Patient[i].showInfo(), "Patient details", JOptionPane.OK_OPTION);
									}
									else
									{
										obj_Patient[i].setDate();
										JOptionPane.showMessageDialog(null, obj_Patient[i].showInfo(), "Patient details", JOptionPane.OK_OPTION);
									}
								}
								else if(choice==2)
								{
									if(obj_Patient[i] instanceof Outdoor_Patient)
									{
									obj_Patient[i].setTime();
									JOptionPane.showMessageDialog(null, obj_Patient[i].showInfo(), "Patient details", JOptionPane.OK_OPTION);
									}
									else
									{
										JOptionPane.showMessageDialog(null, "This option is not available for indoor", "ERROR", JOptionPane.ERROR_MESSAGE);
									}
								}
								else 
								{
									JOptionPane.showMessageDialog(null, "Wrong Input", "ERROR", JOptionPane.ERROR_MESSAGE);
								}
								
						}
					}
					if(temp1==0)
					{
						JOptionPane.showMessageDialog(null,"No such patient present.", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null,"No patient entered.", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
			}
			
		}
		while(choice!=9 && choice<9 && choice>0);

	}
}
