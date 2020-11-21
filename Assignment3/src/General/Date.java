package General;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Date {
	private int day;
	private int month;
	private int year;
	public Date()
	{
		day=0;
		month=0;
		year=0;
	}
	public Date(int d, int m, int y)
	{
		day=d;
		month=m;
		year=y;
	}
	public void setDay(int d)    ///         Setters      ///
	{
		day=d;
	}
	public void setMonth(int m)
	{
		month=m;
	}
	public void setYear(int y)
	{
		year=y;
	}                         //  ********           ////
	public int getDay()     ///         Getters      ///
	{
		return day;
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}                   //  ********           ////
	public void addDate()    
	{
		JTextField Day =new JTextField (); // To input date 
		JTextField Month =new JTextField ();
		JTextField Year =new JTextField ();
		Object[] member= { 
				"Enter Day : ", Day,
				"Enter Month : ", Month,
				"Enter Year : ", Year
				
		};
		JOptionPane.showConfirmDialog(null,member,"Enter the date.",JOptionPane.OK_OPTION);  // End
		day=Integer.parseInt(Day.getText());     // Convert String type to integer
		month=Integer.parseInt(Month.getText());
		year=Integer.parseInt(Year.getText());   //End
	}
	public String showDate()    //return date in ( dd / mm / yy) format 
	{
		String temp;
		temp=day+" / "+month+" / "+year+"\n";
		return temp;
	}  //End
	public boolean compareDate(Date d)    // Check if two dates are same or not  
	{
		if(day==d.day && month==d.month && year==d.year)
		{
			return true;
		}
		else
			return false;
	}      // END
}
