package justin.gearFactory;

public class Armor implements Gear{
	String name;
	String type;
	
	public Armor(){
		name = "Lizard Leather";
		type = "Leather";
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
