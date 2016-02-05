package se.mahK3.nico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class BikesGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textColor;
	private JTextField textSize;
	private JTextField textPrice;
	
	BikeStore MyBikes = new BikeStore();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikesGUI frame = new BikesGUI();
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
	public BikesGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 446);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 205, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textColor = new JTextField();
		textColor.setBounds(456, 80, 116, 22);
		contentPane.add(textColor);
		textColor.setColumns(10);
		
		textSize = new JTextField();
		textSize.setBounds(456, 159, 116, 22);
		contentPane.add(textSize);
		textSize.setColumns(10);
		
		textPrice = new JTextField();
		textPrice.setBounds(456, 247, 116, 22);
		contentPane.add(textPrice);
		textPrice.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(27, 105, 351, 248);
		contentPane.add(textArea);
		
		JButton btnLggTill = new JButton("Add bike");
		btnLggTill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MyBikes.addBike(textColor.getText(), Integer.parseInt(textSize.getText()), Integer.parseInt(textPrice.getText()));
				textArea.setText(MyBikes.getAllBikes());
			}
		});
		btnLggTill.setFont(new Font("Stencil", Font.PLAIN, 13));
		btnLggTill.setBounds(456, 308, 97, 25);
		contentPane.add(btnLggTill);
		
		JLabel lblBike = new JLabel("BIKE STORE");
		lblBike.setFont(new Font("Stencil Std", Font.PLAIN, 27));
		lblBike.setBounds(27, 37, 178, 53);
		contentPane.add(lblBike);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setFont(new Font("Stencil", Font.PLAIN, 13));
		lblColor.setBounds(456, 62, 56, 16);
		contentPane.add(lblColor);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setFont(new Font("Stencil", Font.PLAIN, 13));
		lblSize.setBounds(456, 138, 56, 16);
		contentPane.add(lblSize);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Stencil", Font.PLAIN, 13));
		lblPrice.setBounds(456, 231, 56, 16);
		contentPane.add(lblPrice);
		
	}
}
