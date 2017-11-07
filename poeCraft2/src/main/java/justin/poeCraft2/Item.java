package justin.poeCraft2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
	private String itemType;
	//private String prefix;
	//private String suffix;
	
	@JsonCreator
	public Item(@JsonProperty("flaskType") String flaskType1){
		super();
		this.itemType = flaskType1;
	}
	/*
	public Item(String flaskType1, String prefix1, String suffix1){
		super();
		this.flaskType = flaskType1;
		this.prefix = prefix1;
		this.suffix = suffix1;
	}
	*/
	
	public String getItemType() {
		return itemType;
	}
	
	public void setItemType(String flaskType) {
		this.itemType = flaskType;
	}
	
	/*
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String[] prefix) {
		prefix = prefix;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String[] suffix) {
		suffix = suffix;
	}
	*/
}
