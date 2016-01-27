import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CalculatiorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	Calculator myCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatiorGUI frame = new CalculatiorGUI();
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
	public CalculatiorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 375);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(154, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		myCalculator = new Calculator();
		
		textField = new JTextField();
		textField.setBounds(12, 13, 228, 89);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("+");
				myCalculator.plus();
			}
		});
		btnNewButton.setBounds(12, 281, 58, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("-");
				myCalculator.minus();
			}
		});
		btnNewButton_1.setBounds(84, 281, 59, 39);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("x");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("x");
				myCalculator.mult();
				
			}
		});
		btnNewButton_2.setBounds(153, 281, 58, 39);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("=");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
				int i = myCalculator.getResult();
				textField.setText(String.valueOf(i));
			}
		});
		btnNewButton_3.setBounds(225, 281, 52, 39);
		contentPane.add(btnNewButton_3);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("1");
				myCalculator.numberButtonPressed(1);
			}
		});
		button.setBounds(12, 115, 68, 30);
		contentPane.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("2");
				myCalculator.numberButtonPressed(2);
			}
		});
		button_1.setBounds(92, 115, 68, 30);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("3");
				myCalculator.numberButtonPressed(3);
			}
		});
		button_2.setBounds(172, 115, 68, 30);
		contentPane.add(button_2);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("4");
				myCalculator.numberButtonPressed(4);
			}
		});
		btnNewButton_4.setBounds(12, 158, 68, 30);
		contentPane.add(btnNewButton_4);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("5");
				myCalculator.numberButtonPressed(5);
			}
		});
		button_3.setBounds(92, 160, 68, 28);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("6");
				myCalculator.numberButtonPressed(6);
			}
		});
		button_4.setBounds(172, 158, 68, 30);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("7");
				myCalculator.numberButtonPressed(7);
			}
		});
		button_5.setBounds(12, 201, 68, 30);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("8");
				myCalculator.numberButtonPressed(8);
			}
		});
		button_6.setBounds(92, 204, 68, 27);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("9");
				myCalculator.numberButtonPressed(9);
			}
		});
		button_7.setBounds(172, 204, 68, 27);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				myCalculator.numberButtonPressed(0);
			}
		});
		button_8.setBounds(92, 241, 68, 25);
		contentPane.add(button_8);

	}
}
