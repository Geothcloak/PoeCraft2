package justin.poeCraft2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
	private String flaskType;
	//private String prefix;
	//private String suffix;
	
	@JsonCreator
	public Item(@JsonProperty("flaskType") String flaskType1){
		super();
		this.flaskType = flaskType1;
	}
	/*
	public Item(String flaskType1, String prefix1, String suffix1){
		super();
		this.flaskType = flaskType1;
		this.prefix = prefix1;
		this.suffix = suffix1;
	}
	*/
	
	public String getFlaskType() {
		return flaskType;
	}
	
	public void setFlaskType(String flaskType) {
		this.flaskType = flaskType;
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
