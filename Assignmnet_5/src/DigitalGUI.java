import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DigitalGUI extends JFrame {

	private JPanel contentPane;
	JLabel timeLabel;
	private ClockLogic clockLogic;
	private JTextField hourField;
	private JTextField minuteField;
	private JLabel infoLabel;
	private JLabel lblHour;
	private JLabel lblMinute;
	private JLabel lblAlarmClock;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalGUI frame = new DigitalGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DigitalGUI() {
		
		clockLogic = new ClockLogic(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		timeLabel = new JLabel("New label");
		timeLabel.setFont(new Font("Stencil Std", Font.PLAIN, 30));
		timeLabel.setBounds(32, 153, 280, 70);
		contentPane.add(timeLabel);
		
		hourField = new JTextField();
		hourField.setBounds(67, 56, 76, 22);
		contentPane.add(hourField);
		hourField.setColumns(10);
		
		minuteField = new JTextField();
		minuteField.setBounds(236, 56, 76, 22);
		contentPane.add(minuteField);
		minuteField.setColumns(10);
		
		infoLabel = new JLabel("");
		infoLabel.setBounds(32, 91, 136, 24);
		contentPane.add(infoLabel);
		
		JButton setAlarm = new JButton("Set Alarm");
		setAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hour = hourField.getText();
				String minute = minuteField.getText();
				clockLogic.setAlarm(Integer.parseInt(hour), Integer.parseInt(minute));
				infoLabel.setText("alarm set at " + hour + ":" + minute);
				
			}
		});
		setAlarm.setBounds(324, 55, 97, 25);
		contentPane.add(setAlarm);
		
		JButton btnNewButton = new JButton("Clear Alarm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clockLogic.clearAlarm();
				infoLabel.setText("Alarm Cleared");
			}
		});
		btnNewButton.setBounds(314, 91, 107, 25);
		contentPane.add(btnNewButton);
		
		lblHour = new JLabel("Hour");
		lblHour.setBounds(22, 59, 47, 16);
		contentPane.add(lblHour);
		
		lblMinute = new JLabel("Minute");
		lblMinute.setBounds(167, 59, 47, 16);
		contentPane.add(lblMinute);
		
		lblAlarmClock = new JLabel("Alarm Clock");
		lblAlarmClock.setFont(new Font("Stencil", Font.PLAIN, 22));
		lblAlarmClock.setBounds(87, 13, 152, 22);
		contentPane.add(lblAlarmClock);
		

	}
	
	public void setTimeOnLabel(String time){
		timeLabel.setText(time);
		
	}
	public void activateAlarm(boolean activate){
		contentPane.setBackground(Color.RED);
		infoLabel.setText("Wake up!");
	}

}
