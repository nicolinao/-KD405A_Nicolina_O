import java.util.ArrayList;

import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class StationThread extends Thread{
	
	private SkaneTrafGUI gui;
	private Parser parser;
	
	public StationThread(Parser p, SkaneTrafGUI g){
		this.parser = p;
		this.gui = g;
	}
	
	public void run(){
		
		gui.textArea.setText("Searching...");
		gui.stations = new ArrayList<Station>();
		gui.stations.addAll(Parser.getStationsFromURL(gui.searchField.getText()));
		
		for(Station s : gui.stations){
			gui.textArea.append(s.getStationName() + " number:" + s.getStationNbr() + "\n");
		}
	}
	
	

}
