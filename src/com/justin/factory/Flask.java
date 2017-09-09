package com.justin.factory;
import java.util.HashMap;
import com.justin.itemAffixes.PrefixListable;
import com.justin.itemAffixes.SuffixListable;

public class Flask extends Item{
	private HashMap<String, Integer> prefixList = new HashMap<String, Integer>();
	private HashMap<String, Integer> suffixList = new HashMap<String, Integer>();
	
	public Flask(String name, int itemLevel, PrefixListable prefixList, SuffixListable sufixList) {
		super(name, itemLevel);
		//this.prefixList = prefixList.generatePrefixList(itemLevel);
		//this.suffixList = sufixList.generateSufixList(itemLevel);
	}

	public HashMap<String, Integer> getPrefixList() {
		return prefixList;
	}

	public HashMap<String, Integer> getSuffixList() {
		return suffixList;
	}
}
