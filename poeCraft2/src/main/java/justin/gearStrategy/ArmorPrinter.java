package justin.gearStrategy;

import justin.gearFactory.Armor;
import justin.gearFactory.Gear;

public class ArmorPrinter implements Strategy{

	public String printGear(Gear gear) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Hey you blocked with your armor! " + ((Armor) gear).getType());
		stringBuilder.append(" its name is" + ((Armor) gear).getName());
		System.out.println(stringBuilder);
		
		return stringBuilder.toString();
	}

}
