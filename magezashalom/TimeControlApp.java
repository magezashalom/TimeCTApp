package magezashalom;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class TimeControlApp {
	
	 Calendar calendar;
	 String time;
	 String day;
	 String date;
	 SimpleDateFormat timeFormat;
	 SimpleDateFormat dayFormat;
	 SimpleDateFormat dateFormat;
	 
	 JFrame frame = new JFrame();
	 JLabel timeLabel = new JLabel();
	 JLabel dayLabel = new JLabel();
	 JLabel dateLabel = new JLabel();
	 
	 JButton startButton = new JButton("START");
	 JButton resetButton = new JButton("RESET");
	 
	 int elapsedTime = 0;
	 int seconds =0;
	 int minutes =0;
	 int hours =0;
	 boolean started = false;

	 String seconds_string = String.format("%02d", seconds);
	 String minutes_string = String.format("%02d", minutes);
	 String hours_string = String.format("%02d", hours);
 
}

