package se.mah.nico;

public class Dog {
	private String name;
	boolean stupid;
	
	public Dog(String name){
		this.name = name;
	}
	
	public Dog(String latinName, int gestationTime, boolean stupid){
		this.latinName = latinName;
		this.gestationTime = gestationTime;
		this.stupid = stupid;
	
	}
	
	public Dog(String latinName, int gestationTime, boolean stupid, String friendlyName){
		this.latinName = latinName;
		this.gestationTime = gestationTime;
		this.stupid = stupid;
		this.friendlyName = friendlyName;
	}
	
	public boolean isStupid(){
		
	}

}
