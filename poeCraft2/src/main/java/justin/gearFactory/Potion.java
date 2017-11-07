package justin.gearFactory;

public class Potion implements Gear{
	String name;
	String type;
	int amount; 
	
	public Potion(){
		name = "Big One";
		type = "Healing Potion";
		amount = 10;
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

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}


	
	
	
}
