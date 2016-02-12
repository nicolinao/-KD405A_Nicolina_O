package se.mah.nico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class HumanDogGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumanDogGUI frame = new HumanDogGUI();
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
	public HumanDogGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHumansAndDogs = new JLabel("Humans and Dogs");
		lblHumansAndDogs.setFont(new Font("Tekton Pro", Font.PLAIN, 29));
		lblHumansAndDogs.setBounds(107, 13, 241, 44);
		contentPane.add(lblHumansAndDogs);
		
		textField = new JTextField();
		textField.setBounds(12, 70, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 105, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("New Human");
		btnNewButton.setBounds(188, 70, 123, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewDog = new JButton("Buy Dog");
		btnNewDog.setBounds(188, 108, 123, 25);
		contentPane.add(btnNewDog);
		
		JButton btnNewButton_1 = new JButton("Print Info");
		btnNewButton_1.setBounds(188, 146, 123, 25);
		contentPane.add(btnNewButton_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(38, 234, 335, 53);
		contentPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(38, 329, 335, 44);
		contentPane.add(textPane_1);
	}

}
