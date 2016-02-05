package se.mahK3.nico;

public class Constants {
	
	public static final int MIN_SIZE = 8;
	public static final int MAX_SIZE = 28;
	public static final int MIN_PRICE = 0;
	public static final int MAX_PRICE = 30000;
	
	/** gör en array av de tillåtna färgerna för Bike*/
	public static final String[] colors = new String[]{"blue", "red", "yellow", "pink", "green", "white", "purple", "black"};
	
	/** hämtar minsta tillåtna storlek på Bike*/
	public static int getMinSize(){
		return MIN_SIZE;
	}
	/** hämtar största tillåtna storlek på Bike*/
	public static int getMaxSize(){
		return MAX_SIZE;
	}
	/** hämtar minsta tillåtna pris på Bike*/
	public static int getMinPrice(){
		return MIN_PRICE;
	}
	/** hämtar största tillåtna pris på Bike*/
	public static int getMaxPrice(){
		return MAX_PRICE;
	}
	/** hämtar arrayen av de tillåtna färgerna*/
	public static String[] getColors(){
		return colors;
	}

}
