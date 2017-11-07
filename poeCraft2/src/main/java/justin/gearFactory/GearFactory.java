package justin.gearFactory;

public class GearFactory {
	public Gear getGear(String gearType){
		if (gearType == null){
			System.out.println("geartype null inside gearfactory");
			return null;
		}
		if (gearType.equals("Healing Potion")){
			return new Potion();
		}
		else if(gearType.equals("Leather")){
			return new Armor();
		}
		else if(gearType.equals("Dagger")){
			return new Weapon();
		}
		return null;
	}
	

}
