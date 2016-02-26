import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class SkaneTrafGUI extends JFrame {

	private JPanel contentPane;
	public JTextField searchField;
	JTextArea textArea;
	
	Parser p = new Parser();
	SkaneTrafGUI g = this;
	public JTextField fromField;
	public JTextField toField;
	public JTextArea textArea_2;
	public JButton btnSkResa;
	
	ArrayList<Station> stations = new ArrayList<Station>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkaneTrafGUI frame = new SkaneTrafGUI();
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
	public SkaneTrafGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSk = new JButton("S\u00F6k");
		btnSk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Thread t = new StationThread(p, g);
				t.start();
			}
		});
		btnSk.setBounds(151, 97, 97, 25);
		contentPane.add(btnSk);
		
		searchField = new JTextField();
		searchField.setBounds(14, 98, 116, 22);
		contentPane.add(searchField);
		searchField.setColumns(10);
		
		fromField = new JTextField();
		fromField.setBounds(316, 63, 116, 22);
		contentPane.add(fromField);
		fromField.setColumns(10);
		
		toField = new JTextField();
		toField.setBounds(316, 98, 116, 22);
		contentPane.add(toField);
		toField.setColumns(10);
		
		btnSkResa = new JButton("S\u00F6k Resa");
		btnSkResa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread n = new JourneyThread(p, g);
				n.start();
			}
		});
		btnSkResa.setBounds(463, 97, 97, 25);
		contentPane.add(btnSkResa);
		
		textArea = new JTextArea();
		textArea.setBounds(14, 146, 234, 171);
		contentPane.add(textArea);
		
		textArea_2 = new JTextArea();
		textArea_2.setBounds(316, 146, 178, 171);
		contentPane.add(textArea_2);
		
		JLabel lblSkStation = new JLabel("S\u00F6k Station");
		lblSkStation.setBounds(80, 28, 76, 25);
		contentPane.add(lblSkStation);
		
		JLabel lblSkResa = new JLabel("S\u00F6k Resa");
		lblSkResa.setBounds(359, 30, 73, 20);
		contentPane.add(lblSkResa);
		
	}
}
