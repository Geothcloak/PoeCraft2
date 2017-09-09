package com.justin.itemAffixes;
import java.util.HashMap;

public class PrefixListSnapshot implements PrefixListable{

	@Override
	public HashMap<String, Integer> generatePrefixList(int itemLevel) {
		HashMap<String, Integer> prefixList = new HashMap<String, Integer>();
		if (itemLevel >= 2){
			prefixList.put("Ample", 2); //. +(10-20)to Maximum Charges.");
		}
		if (itemLevel >= 3){
			prefixList.put("Perpetual", 3); //. (20-40)% increased Charge Recovery.");
		}
		if (itemLevel >= 8){
			prefixList.put("Surgeon's", 8); //. 20% chance to gain a Flask Charge when you deal a Critical Strike.");
		}
		if (itemLevel >= 12){
			prefixList.put("Avenger's", 12); //. Recharges 3 Charges when you take a Critical Strike.");
		}
		if (itemLevel >= 14){
			prefixList.put("Chemist's", 14); //. (25-20)% reduced Charges used.");
		}
		if (itemLevel >= 20){
			prefixList.put("Experimenter's", 20); //. (30-40)% increased Duration.");
		}
		if (itemLevel >= 20){
			prefixList.put("Alchemist's", 20); //. 33% reduced Duration. 25% increased effect.");
		}
		return prefixList;
	}
	
}
