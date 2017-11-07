package justin.gearStrategy;

import justin.gearFactory.Gear;
import justin.gearFactory.Weapon;

public class WeaponPrinter implements Strategy{

	public String printGear(Gear gear) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Hey you used a weapon! " + ((Weapon) gear).getType());
		stringBuilder.append(" its name is" + ((Weapon) gear).getName());
		System.out.println(stringBuilder);
		
		return stringBuilder.toString();
	}

}
