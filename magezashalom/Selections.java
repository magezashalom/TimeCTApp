package magezashalom;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Selections implements ActionListener {
	JFrame frame = new JFrame();
	JButton clockButton = new JButton("CLOCK");
	JButton stopwatchButton = new JButton("STOPWATCH");
	JLabel selectionLabel = new JLabel();
	boolean started = false;

	Timer timer = new Timer(10, new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			selectionLabel.setText("Pick Selection");
		}
	});

	Selections() {
		selectionLabel.setOpaque(true);
		selectionLabel.setSize(400, 100);
		selectionLabel.setText("<html>Pick Your Selection<br/>______________</html> ");
		selectionLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
		selectionLabel.setHorizontalAlignment(JTextField.CENTER);
		selectionLabel.setBorder(BorderFactory.createBevelBorder(1));

		clockButton.setBounds(125, 110, 150, 40);
		clockButton.setFont(new Font("Verdana", Font.PLAIN, 20));
		clockButton.setFocusable(false);
		clockButton.addActionListener(this);

		stopwatchButton.setBounds(125, 155, 150, 40);
		stopwatchButton.setFont(new Font("Verdana", Font.PLAIN, 20));
		stopwatchButton.setFocusable(false);
		stopwatchButton.addActionListener(this);

		frame.add(clockButton);
		frame.add(stopwatchButton);
		frame.add(selectionLabel);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 250);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == clockButton) {
			new MyClock();
		} else if (e.getSource() == stopwatchButton) {
			new MyStopWatch();
		}
	}

}
