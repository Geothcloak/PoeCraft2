package justin.poeCraft2;

import justin.gearFactory.Armor;
import justin.gearFactory.Gear;
import justin.gearFactory.Potion;
import justin.gearFactory.Weapon;
import justin.gearStrategy.ArmorPrinter;
import justin.gearStrategy.Context;
import justin.gearStrategy.PotionPrinter;
import justin.gearStrategy.WeaponPrinter;

public class ItemDriver {
	String jsonStringHealth;
	String jsonStringMana;
	String jsonStringSpeed;
	ItemMapper itemMapper;
	Context context;
	
	public ItemDriver(){
		jsonStringHealth = "{\"flaskType\": \"Healing Potion\"}";
		jsonStringMana = "{\"flaskType\": \"Leather\"}";
		jsonStringSpeed = "{\"flaskType\": \"Dagger\"}";
		itemMapper = new ItemMapper();
	}
	
	public void CreateItem(){
		Gear gear1 = null;
		Gear gear2 = null;
		Gear gear3 = null;
		gear1 = itemMapper.createObjectFromJson(jsonStringHealth);
		gear2 = itemMapper.createObjectFromJson(jsonStringMana);
		gear3 = itemMapper.createObjectFromJson(jsonStringSpeed);
		
		System.out.println(gear1.getType());
		System.out.println(gear1 instanceof Potion);
		
		System.out.println(gear2.getType());
		System.out.println(gear2 instanceof Armor);
		
		System.out.println(gear3.getType());
		System.out.println(gear3 instanceof Weapon);
		
		System.out.println(" now inside strategy ");
		context = new Context(new PotionPrinter());
		context.executeStrategy(gear1);
		context = new Context(new ArmorPrinter());
		context.executeStrategy(gear2);
		context = new Context(new WeaponPrinter());
		context.executeStrategy(gear3);
			
		
		
	}
	
	
}
