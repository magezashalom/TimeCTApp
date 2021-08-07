package magezashalom;

import java.awt.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

public class MyClock extends TimeControlApp{
	 MyClock(){
		  frame.setLayout(new FlowLayout());
		  frame.setSize(350,200);
		  frame.setResizable(false);
		  
		  timeFormat = new SimpleDateFormat("hh:mm:ss a");
		  dayFormat = new SimpleDateFormat("EEEE");
		  dateFormat = new SimpleDateFormat("MMMMM dd, yyyy"); 
		  
		  timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
		  timeLabel.setForeground(new Color(0xFFFFFF));
		  timeLabel.setBackground(new Color(0x4B4A4A));
		  timeLabel.setOpaque(true);
		 
		  dayLabel.setFont(new Font("Ink Free",Font.PLAIN,35));
		  dateLabel.setFont(new Font("Ink Free",Font.PLAIN,25));
		  
		  frame.add(timeLabel);
		  frame.add(dayLabel);
		  frame.add(dateLabel);
		  frame.setVisible(true);
		  frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		  
		  setTime();
	 }
	 
	 public void setTime() {
		  while(true) {
			  time = timeFormat.format(Calendar.getInstance().getTime());
			  timeLabel.setText(time);
			  
			  day = dayFormat.format(Calendar.getInstance().getTime());
			  dayLabel.setText(day);
			  
			  date = dateFormat.format(Calendar.getInstance().getTime());
			  dateLabel.setText(date);
			  
			  try {
				  Thread.sleep(1000);
			  } catch (InterruptedException e) {
				  // Here I did an auto generated catch block
				  e.printStackTrace(); }
		  }
	 }
}




