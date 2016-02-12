package se.mah.nico;

public abstract class Animal {
	private String latinName;
	private String friendlyName;
	
	public Animal(String latinName){
		this.latinName = latinName;
	}
	
	public abstract String getInfo(){
		
	}
	
	public setFriendlyName(String Name){
		return this.friendlyName;
	}
	
	public String getFriendlyName(){
		
	}
}
