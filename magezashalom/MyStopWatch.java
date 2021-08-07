package magezashalom;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class MyStopWatch extends TimeControlApp implements ActionListener{

	 Timer timer = new Timer(1000, new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
		   elapsedTime=elapsedTime+1000;
		   hours = (elapsedTime/3600000);
		   minutes = (elapsedTime/60000) % 60;
		   seconds = (elapsedTime/1000) % 60;
		   seconds_string = String.format("%02d", seconds);
		   minutes_string = String.format("%02d", minutes);
		   hours_string = String.format("%02d", hours);
		   timeLabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
		   
		  }
		   
	 });
	 
	 MyStopWatch(){
		 
	 	  timeLabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
		  timeLabel.setBounds(50,50,200,100);
		  timeLabel.setFont(new Font("Verdana",Font.PLAIN,35));
		  timeLabel.setBorder(BorderFactory.createBevelBorder(1));
		  timeLabel.setOpaque(true);
		  timeLabel.setHorizontalAlignment(JTextField.CENTER);
		  
		  startButton.setBounds(50,200,100,50);
		  startButton.setFont(new Font("Ink Free",Font.PLAIN,20));
		  startButton.setFocusable(false);
		  startButton.addActionListener(this);
		  
		  resetButton.setBounds(150,200,100,50);
		  resetButton.setFont(new Font("Ink Free",Font.PLAIN,20));
		  resetButton.setFocusable(false);
		  resetButton.addActionListener(this);
		  
		  frame.add(startButton);
		  frame.add(resetButton);
		  frame.add(timeLabel);
		  
		  frame.setSize(305,340);
		  frame.setLayout(null);
		  frame.setVisible(true);
		  frame.setResizable(false);
		  frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	 }
	 
	 @Override
	 public void actionPerformed(ActionEvent e) {
	  if(e.getSource()==startButton) {  
	   if(started==false) {
		    started=true;
		    startButton.setText("STOP");
		    start();
		   }
	   else {
		    started=false;
		    startButton.setText("START");
		    stop();
	   }
	  }
	  
	  if(e.getSource()==resetButton) {
		   started=false;
		   startButton.setText("START");
		   reset();
	  	}
	 }
	 //Here when start is clicked the timer will start
	 void start() {
		 timer.start();
	 	}
	 //Here when stop is clicked the timer will stop
	 void stop() {
		 timer.stop();
	 	}
	 
	 //here when the person clicks reset, the timer will stop and everything will clear up
	 void reset() {
		  timer.stop();
		  elapsedTime=0;
		  seconds =0;
		  minutes=0;
		  hours=0;
		  seconds_string = String.format("%02d", seconds);
		  minutes_string = String.format("%02d", minutes);
		  hours_string = String.format("%02d", hours);       
		  timeLabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
	 	}
	}
