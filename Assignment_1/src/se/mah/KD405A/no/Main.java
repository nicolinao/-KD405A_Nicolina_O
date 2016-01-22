package se.mah.KD405A.no;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JScrollBar;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.GridBagLayout;
import javax.swing.JSpinner;
import java.awt.GridBagConstraints;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Scrollbar;
import java.awt.Panel;
import java.awt.ScrollPane;
import javax.swing.JTable;
import java.awt.Label;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtChristinaPersson;
	private JTextField textField_1;
	private JTextField txtKlvgen;
	private JTextField textField_3;
	private JTextField txtChristinaperssongmailcom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 523);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arkiv");
		mnNewMenu.setBackground(new Color(173, 216, 230));
		mnNewMenu.setFont(new Font("AR CENA", Font.PLAIN, 21));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Skriv ut");
		mntmNewMenuItem_3.setFont(new Font("AR CENA", Font.PLAIN, 21));
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Avsluta");
		mntmNewMenuItem_4.setFont(new Font("AR CENA", Font.PLAIN, 21));
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenu mnMedlem = new JMenu("Medlem");
		mnMedlem.setFont(new Font("AR CENA", Font.PLAIN, 21));
		menuBar.add(mnMedlem);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mntmNyMedlem.setFont(new Font("AR CENA", Font.PLAIN, 21));
		mnMedlem.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem");
		mntmHittaMedlem.setFont(new Font("AR CENA", Font.PLAIN, 21));
		mnMedlem.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		mnHjlp.setFont(new Font("AR CENA", Font.PLAIN, 21));
		menuBar.add(mnHjlp);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Hj\u00E4lp");
		mntmNewMenuItem.setFont(new Font("AR CENA", Font.PLAIN, 21));
		mnHjlp.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Om programmet");
		mntmNewMenuItem_1.setFont(new Font("AR CENA", Font.PLAIN, 21));
		mnHjlp.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\anilo_000\\Desktop\\Skolarbeten\\Programmering\\-KD405A_Nicolina_O\\Assignment_1\\src\\images\\MignonGreenHeadshot6.png"));
		lblNewLabel.setBounds(411, 79, 178, 108);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 142, 198, 246);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Eva Persson"},
				{"Sven Svensson"},
				{"Anna Andersson"},
				{"Bertil Bertilsson"},
				{"G\u00F6ran G\u00F6ransson"},
				{"Tony Thomasson"},
				{"Ylva Eriksson"},
				{"Fanny Fransson"},
				{"Harald Haraldsson"},
				{"Dan Danielsson"},
				{"Lars Larsson"},
				{"Ralf Olsson"},
				{"Nina Andersson"},
				{"Maria Nilsson"},
				{null},
			},
			new String[] {
				"Medlemmar"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		txtChristinaPersson = new JTextField();
		txtChristinaPersson.setText("Christina Persson");
		txtChristinaPersson.setBounds(411, 200, 116, 22);
		contentPane.add(txtChristinaPersson);
		txtChristinaPersson.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("650823-5698");
		textField_1.setBounds(411, 224, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		txtKlvgen = new JTextField();
		txtKlvgen.setText("K\u00E5lv\u00E4gen 25, 654 83, Ume\u00E5");
		txtKlvgen.setBounds(411, 250, 178, 22);
		contentPane.add(txtKlvgen);
		txtKlvgen.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText("0765892752");
		textField_3.setBounds(411, 275, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		txtChristinaperssongmailcom = new JTextField();
		txtChristinaperssongmailcom.setText("christina.persson@gmail.com");
		txtChristinaperssongmailcom.setBounds(411, 302, 178, 22);
		contentPane.add(txtChristinaperssongmailcom);
		txtChristinaperssongmailcom.setColumns(10);
		
		JTextPane txtpnNyMedlem = new JTextPane();
		txtpnNyMedlem.setBackground(new Color(173, 216, 230));
		txtpnNyMedlem.setFont(new Font("AR CENA", Font.BOLD, 18));
		txtpnNyMedlem.setText("Ny medlem");
		txtpnNyMedlem.setBounds(411, 44, 97, 22);
		contentPane.add(txtpnNyMedlem);
		
		JTextPane txtpnNamn = new JTextPane();
		txtpnNamn.setFont(new Font("AR CENA", Font.PLAIN, 18));
		txtpnNamn.setBackground(new Color(173, 216, 230));
		txtpnNamn.setText("Namn");
		txtpnNamn.setBounds(297, 200, 60, 22);
		contentPane.add(txtpnNamn);
		
		JTextPane txtpnPersonnummer = new JTextPane();
		txtpnPersonnummer.setFont(new Font("AR CENA", Font.PLAIN, 18));
		txtpnPersonnummer.setBackground(new Color(173, 216, 230));
		txtpnPersonnummer.setText("Personnummer");
		txtpnPersonnummer.setBounds(297, 224, 97, 22);
		contentPane.add(txtpnPersonnummer);
		
		JTextPane txtpnAdress = new JTextPane();
		txtpnAdress.setFont(new Font("AR CENA", Font.PLAIN, 18));
		txtpnAdress.setBackground(new Color(173, 216, 230));
		txtpnAdress.setText("Adress");
		txtpnAdress.setBounds(297, 250, 60, 22);
		contentPane.add(txtpnAdress);
		
		JTextPane txtpnTelefonnummer = new JTextPane();
		txtpnTelefonnummer.setFont(new Font("AR CENA", Font.PLAIN, 18));
		txtpnTelefonnummer.setBackground(new Color(173, 216, 230));
		txtpnTelefonnummer.setText("Telefonnummer");
		txtpnTelefonnummer.setBounds(297, 275, 102, 22);
		contentPane.add(txtpnTelefonnummer);
		
		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setFont(new Font("AR CENA", Font.PLAIN, 18));
		txtpnEmail.setBackground(new Color(173, 216, 230));
		txtpnEmail.setText("E-mail");
		txtpnEmail.setBounds(297, 302, 71, 22);
		contentPane.add(txtpnEmail);
		
		JTextPane txtpnSportsGym = new JTextPane();
		txtpnSportsGym.setBackground(new Color(173, 216, 230));
		txtpnSportsGym.setFont(new Font("Stencil Std", Font.PLAIN, 29));
		txtpnSportsGym.setText("Sports Gym");
		txtpnSportsGym.setBounds(36, 62, 223, 67);
		contentPane.add(txtpnSportsGym);
		
		JButton btnLggTill = new JButton("L\u00E4gg till");
		btnLggTill.setBounds(430, 360, 97, 25);
		contentPane.add(btnLggTill);
		
		
	}
}
