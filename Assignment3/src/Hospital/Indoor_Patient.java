package Hospital;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import General.Date;
public class Indoor_Patient extends Patient {
	private int wardno;
	private int roomno;
	private int bedno;
	private double fee;
	private Date date_of_admission;
	public Indoor_Patient()
	{
		super();
		wardno=0;
		roomno=0;
		bedno=0;
		fee=0;
		date_of_admission= new Date();
	}
	public Indoor_Patient(int w, int r, int b, double f)
	{
		wardno=w;
		roomno=r;
		bedno=b;
		fee=f;
		date_of_admission= new Date();
	}
	public void setWardno(int w)
	{
		wardno=w;
	}
	public void setRoomno(int r)
	{
		roomno=r;
	}
	public void setBedno(int b)
	{
		bedno=b;
	}
	public void setFee(double f)
	{
		fee=f;
	}
	public void setDate()
	{
		date_of_admission.addDate();
	}
	public int getWardno()
	{
		return wardno;
	}
	public int getRoomno()
	{
		return roomno;
	}
	public int getBedno()
	{
		return bedno;
	}
	double getFee()
	{
		return fee;
	}
	public Date getDate()
	{
		return date_of_admission;
	}
	public void addInfo(Doctor[] obj,int no)
	{
		super.addInfo(obj, no);
		JTextField Wardno=new JTextField();
		JTextField Roomno=new JTextField();
		JTextField Bedno=new JTextField();
		JTextField Fee=new JTextField();
		Object[] input={
			"Enter wardno of Patient.",Wardno,
			"Enter roomno of Patient.",Roomno,
			"Enter bedno of Patient.",Bedno,
			"Enter fee no of Patient.",Fee,
		};
		JOptionPane.showMessageDialog(null, input, "Indoor Patient Information", JOptionPane.OK_OPTION);
		wardno=Integer.parseInt(Wardno.getText());
		roomno=Integer.parseInt(Roomno.getText());
		bedno=Integer.parseInt(Bedno.getText());
		fee=Double.valueOf(Fee.getText());
		date_of_admission.addDate();
		/*String temp1;
		temp1=JOptionPane.showInputDialog("Enter ward no of patient.");
		wardno=Integer.parseInt(temp1);
		temp1=JOptionPane.showInputDialog("Enter room no of patient.");
		roomno=Integer.parseInt(temp1);
		temp1=JOptionPane.showInputDialog("Enter bed no of patient.");
		bedno=Integer.parseInt(temp1);
		temp1=JOptionPane.showInputDialog("Enter fee of patient.");
		fee=Double.valueOf(temp1);*/
		
	}
	public String showInfo()
	{
		String temp;
		temp=super.showInfo();
		temp=temp+"Ward No : "+wardno+"\n"+
				  "Room No : "+roomno+"\n"+
				  "Bed no : "+bedno+"\n"+
				  "Fee : "+fee+"\n"+
				  "Date Of admission : "+date_of_admission.showDate()+
		 "           **  Doctor assigned ** "+"\n"+super.get_Doctor().showInfo()+"\n"+"        ***************************         "+"\n";
		return temp;
	}
}
