package Hospital;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import General.*;
public class Outdoor_Patient extends Patient {
	private double fee;
	private Date date_of_appointment;
	private Time time_of_appointment;
	public Outdoor_Patient()
	{
		super();
		fee=0;
		date_of_appointment=new Date();
		time_of_appointment=new Time();
	}
	public Outdoor_Patient(double f)
	{
		fee=f;
	}
	public void setFee(double f)
	{
		fee=f;
	}
	public double getFee()
	{
		return fee;
	}
	
	public void setDate()
	{
		date_of_appointment.addDate();
	}
	public Date getDate()
	{
		return date_of_appointment;
	}
	public void setTime()
	{
		time_of_appointment.addTime();
	}
	public Time getTime()
	{
		return time_of_appointment;
	}
	public void addInfo(Doctor[] obj,int no)
	{
		super.addInfo(obj, no);
		JTextField Fee=new JTextField();
		Object[] input={
				"Enter fee no of Patient.",Fee,
			};
		JOptionPane.showMessageDialog(null, input, "outdoor Patient Information", JOptionPane.OK_OPTION);
		fee=Double.valueOf(Fee.getText());
		date_of_appointment.addDate();
		time_of_appointment.addTime();
		/*String temp1;
		temp1=JOptionPane.showInputDialog("Enter fee of patient.");
		fee=Double.valueOf(temp1);*/
	}
	public String showInfo()
	{
		String temp;
		temp=super.showInfo();
		temp=temp+"Fee : "+fee+"\n"+
				  "Date Of appointment : "+date_of_appointment.showDate()+"\n"+
				  "Time Of appointment : "+time_of_appointment.showTime()+
				  "           ******  Doctor assigned ****** "+"\n"+super.get_Doctor().showInfo()+"\n"+"        **************         "+"\n";
		return temp;
	}
}
