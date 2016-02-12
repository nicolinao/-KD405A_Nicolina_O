package se.mahK3.nico;

public class Bike {
	private String color;
	private int price;
	private int size;
	
	/**skapar Bike med variablerna color och size*/
	public Bike(String color, int size){
		
		this.color = color;
		this.size = size;
		
	}
	/** skapar en till Bike med variablerna color, size och price*/
	public Bike(String color, int size, int price){
		
		this.color = color;
		this.size = size;
		this.price = price;
		
	}
	/** hämtar färgen på Bike*/
	public String getColor(){
		return this.color;
	}
	/** hämtar storleken på Bike*/
	public int getSize(){
		return this.size;
	}
	/** hämtar priset på Bike*/
	public int getPrice(){
		return this.price;
	}
	/** sätter priset på Bike*/
	public void setPrice(int price){
		this.price = price;
	}

}
