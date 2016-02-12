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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HumanDogGUI extends JFrame {

	private JPanel contentPane;
	private JTextField humanField;
	private JTextField dogField;
	private JTextField errorField;
	private JTextField infoField;
	
	static Human human;

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
		
		humanField = new JTextField();
		humanField.setBounds(12, 70, 116, 22);
		contentPane.add(humanField);
		humanField.setColumns(10);
		
		dogField = new JTextField();
		dogField.setBounds(12, 105, 116, 22);
		contentPane.add(dogField);
		
		
		errorField = new JTextField();
		errorField.setBounds(38, 329, 335, 44);
		errorField.setColumns(10);
		contentPane.add(errorField);
		
		infoField = new JTextField();
		infoField.setBounds(38, 234, 335, 53);
		infoField.setColumns(10);
		contentPane.add(infoField);
		
		
		
		JButton btnNewButton = new JButton("New Human");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(humanField.getText().length() >= 3){
					errorField.setText("");
					human = new Human(humanField.getText());
				}else{
					errorField.setText("give the human a longer name");
				}
			}
		});
		btnNewButton.setBounds(188, 70, 123, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewDog = new JButton("Buy Dog");
		btnNewDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(dogField.getText().length() > 0){
					errorField.setText("");
					if(human == null){
						errorField.setText("Dog needs owner");
					}else{
						errorField.setText("");
						human.buyDog(new Dog(dogField.getText()));
					}
				}else{
					errorField.setText("Write name for dog");
				}
			}
		});
		btnNewDog.setBounds(188, 108, 123, 25);
		contentPane.add(btnNewDog);
		
		JButton btnNewButton_1 = new JButton("Print Info");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(human != null){
					errorField.setText("");
					infoField.setText(human.getInfo());
				}else{
					errorField.setText("no info to print");
				}
			}
		});
		btnNewButton_1.setBounds(188, 146, 123, 25);
		contentPane.add(btnNewButton_1);
		

	}

}
