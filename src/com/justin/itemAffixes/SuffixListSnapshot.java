package com.justin.itemAffixes;
import java.util.HashMap;

public class SuffixListSnapshot implements SuffixListable{

	@Override
	public HashMap<String, Integer> generateSufixList(int itemLevel) {
		HashMap<String, Integer> suffixList = new HashMap<String, Integer>();
		if (itemLevel >= 1){
			suffixList.put("of Resistance", 1);// (20-30)% additional Elemental Resistances during Flask effect.
		}
		if (itemLevel >= 6){
			suffixList.put("of Iron Skin", 6);// (60-100)% increased Armour during Flask effect.");
		}
		if (itemLevel >= 1){
			suffixList.put("of Steadiness", 1); //. (40-60)% increased Block and Stun Recovery during Flask effect.");
		}
		if (itemLevel >= 8){
			suffixList.put("of Reflexes", 8); //. (60-100)% increased Evasion Rating during Flask effect.");
		}
		if (itemLevel >= 5){
			suffixList.put("of Adrenaline", 5); //. (20-30)% increased Movement Speed during Flask effect.");
		}
		if (itemLevel >= 10){
			suffixList.put("of Gluttony", 10); //. 0.4% of Physical Attack Damage Leeched as Life during Flask effect.");
		}
		if (itemLevel >= 12){
			suffixList.put("of Craving", 12); //. 0.4% of Physical Attack Damage Leeched as Mana during Flask effect.");
		}
		if (itemLevel >= 9){
			suffixList.put("of Fending", 9); //. Adds Knockback to Melee Attacks during Flask effect.");
		}
		if (itemLevel >= 18){
			suffixList.put("of Warding", 18); //. Immune to Curses during Flask effect. Removes Curses on use.");
		}
		if (itemLevel >= 16){
			suffixList.put("of Curing", 16); //. Immune to Poison during Flask Effect. Removes Poison on use.");
		}
		if (itemLevel >= 8){
			suffixList.put("of Staunching", 8); //. Immunity to Bleeding during Flask effect. Removes Bleeding on use.");
		}
		if (itemLevel >= 4){
			suffixList.put("of Heat", 4); //. Immunity to Freeze and Chill during Flask effect. Removes Freeze and Chill on use.");
		}
		if (itemLevel >= 6){
			suffixList.put("of Dousing", 6); //. Immunity to Ignite during Flask effect. Removes Burning on use.");
		}
		if (itemLevel >= 10){
			suffixList.put("of Grounding", 10); //. Immunity to Shock during Flask effect. Removes Shock on use.");
		}
		
		return suffixList;
	}
	
	


}
