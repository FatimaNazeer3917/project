package General;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Time {
	private int hours;
	private int mins;
	private String timeLine;
	public Time()
	{
		hours=0;
		mins=0;
		timeLine="pm";
	}
	public Time(int h, int m, String t)
	{
		hours=h;
		mins=m;
		timeLine=t;
	}
	public void setHours(int h)                        ///      Setters          ////
	{
		hours=h;
	}
	public void setMins(int m)
	{
		mins=m;
	}
	public void settimeLine(String t)
	{
		timeLine=t;
	}                                               ///      *********          ////
	public int getHours()                        ///      Getters          ////
	{
		return hours;
	}
	public int getMins()
	{
		return mins;
	}
	public String gettimeLine()
	{
		return timeLine;
	}                                              ///      *********          ////
	public void addTime()
	{
		JTextField Min=new JTextField();  // Input date 
		JTextField Hour=new JTextField();
		JTextField Time_line=new JTextField();
		Object[] input= {
				"Enter minutes : ",Min,
				"Enter hours : ",Hour,
				"Enter Time (pm/am) : ",Time_line
		};
		JOptionPane.showMessageDialog(null, input, "Enter time of appoinment", JOptionPane.OK_OPTION); // End
		mins=Integer.parseInt(Min.getText());  // Convert String to integer
		hours=Integer.parseInt(Hour.getText()); // Convert String to integer
		timeLine=Time_line.getText();
	}
	public String showTime()   // Return time in ( hh : mm : pm/am) format
	{
		String temp;
		temp=hours+" : "+mins+" "+timeLine+"\n";
		return temp;
	}
}
