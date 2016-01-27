import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextArea;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Scrollbar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class HouseGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(106, 75, 203, 199);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
		
		House house1;
		House house2;
		House house3;
		house1 = new House(1998, 800);
		house2 = new House(2004, 500);
		house3 = new House(1900, 400);
		
		
		int houseSize = house1.getSize();
		int houseYear = house1.getYearBuilt();
		int houseSize2 = house2.getSize();
		int houseYear2 = house2.getYearBuilt();
		int houseSize3 = house3.getSize();
		int houseYear3 = house3.getYearBuilt();
		
		System.out.println("Storleken p� hus 1 �r " + houseSize);
		System.out.println("Hus 1 �r byggt �r " + houseYear);

		System.out.println("Storleken p� hus 2 �r " + houseSize2);
		System.out.println("Hus 2 �r byggt �r " + houseYear2);

		System.out.println("Storleken p� hus 2 �r " + houseSize3);
		System.out.println("Hus 3 �r byggt �r " + houseYear3);
		
		textArea.append("Hus 1 �r byggt � " + houseYear + "och �r " + houseSize + "kvm stort");
		textArea.append("Hus 2 �r byggt � " + houseYear2 + "och �r " + houseSize2 + "kvm stort");
		textArea.append("Hus 3 �r byggt � " + houseYear3 + "och �r " + houseSize3 + "kvm stort");
		
		
		House[] myHouses = new House[10];
		
		myHouses[0] = new House(1999, 200);
		myHouses[1] = new House(1980, 300);
		myHouses[2] = new House(2011, 500);
		myHouses[3] = new House(2014, 800);
		myHouses[4] = new House(2002, 850);
		myHouses[5] = new House(1977, 244);
		myHouses[6] = new House(1890, 380);
		myHouses[7] = new House(2000, 120);
		myHouses[8] = new House(1995, 350);
		myHouses[9] = new House(1950, 290);
		
		for(int i = 0; i < myHouses.length; i++){
			textArea.append("Huset �r byggt �r " + myHouses[i].getYearBuilt() + "och �r" + myHouses[i].getSize() + "kvm stort");
		}
		
		ArrayList<House> myTown;
		myTown = new ArrayList<House>();
		int year;
		int size;
		Random rand = new Random(100);
		year = rand.nextInt((2015 - 1800)+ 1) + 1800;
		size = rand.nextInt((1000 - 10)+ 1) + 10;
		
		myTown.add(new House(year, size));
		
		for(House house : myTown){
			house.getSize();
			house.getYearBuilt();
			textArea.append(String.valueOf(house.getYearBuilt()) + String.valueOf(house.getSize()) + "\n");
		}
	}
}
