package se.mahK3.nico;

public class Constants {
	
	public static final int MIN_SIZE = 8;
	public static final int MAX_SIZE = 28;
	public static final int MIN_PRICE = 0;
	public static final int MAX_PRICE = 30000;
	
	/** g�r en array av de till�tna f�rgerna f�r Bike*/
	public static final String[] colors = new String[]{"blue", "red", "yellow", "pink", "green", "white", "purple", "black"};
	
	/** h�mtar minsta till�tna storlek p� Bike*/
	public static int getMinSize(){
		return MIN_SIZE;
	}
	/** h�mtar st�rsta till�tna storlek p� Bike*/
	public static int getMaxSize(){
		return MAX_SIZE;
	}
	/** h�mtar minsta till�tna pris p� Bike*/
	public static int getMinPrice(){
		return MIN_PRICE;
	}
	/** h�mtar st�rsta till�tna pris p� Bike*/
	public static int getMaxPrice(){
		return MAX_PRICE;
	}
	/** h�mtar arrayen av de till�tna f�rgerna*/
	public static String[] getColors(){
		return colors;
	}

}
