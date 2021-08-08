package magezashalom;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;

import javax.swing.*;
import javax.swing.Timer;

public class MyClock extends TimeControlApp {
	MyClock() {
		frame.setLayout(new FlowLayout());
		frame.setSize(350, 200);
		frame.setResizable(false);

		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		dayFormat = new SimpleDateFormat("EEEE");
		dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");

		timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
		timeLabel.setForeground(new Color(0xFFFFFF));
		timeLabel.setBackground(new Color(0x4B4A4A));
		timeLabel.setOpaque(true);

		dayLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));
		dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 25));

		frame.add(timeLabel);
		frame.add(dayLabel);
		frame.add(dateLabel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		Timer timer = new Timer(100, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTime();
			}
		});
		timer.setRepeats(true);
		timer.start();
	}

	public void setTime() {
		time = timeFormat.format(Calendar.getInstance().getTime());
		timeLabel.setText(time);

		day = dayFormat.format(Calendar.getInstance().getTime());
		dayLabel.setText(day);

		date = dateFormat.format(Calendar.getInstance().getTime());
		dateLabel.setText(date);
	}
}
