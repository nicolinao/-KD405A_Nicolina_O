package se.mah.nico;

public class Human {
	private Dog dog;
	private String name;
	
	public Human(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	

	public void buyDog(Dog dog){
		this.dog = dog;
	}
	/**checks if human owns a dog or not*/
	public String getInfo(){
		if(dog != null){
			return this.getName() + " Owns a dog called " + this.dog.getName().toString();
		}else{
			return this.getName() + " doesen't own a dog";
		}
	}
}
