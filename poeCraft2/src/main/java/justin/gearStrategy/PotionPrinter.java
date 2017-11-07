package justin.gearStrategy;

import justin.gearFactory.Gear;
import justin.gearFactory.Potion;

public class PotionPrinter implements Strategy{

	public String printGear(Gear gear) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Hey you used a potion! " + ((Potion) gear).getAmount() + " hp healed!");
		System.out.println(stringBuilder);
		
		return stringBuilder.toString();
	}

}
