package justin.poeCraft2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
	private String itemType;
	
	@JsonCreator
	public Item(@JsonProperty("flaskType") String flaskType1){
		this.itemType = flaskType1;
	}
	
	public String getItemType() {
		return itemType;
	}
	
	public void setItemType(String flaskType) {
		this.itemType = flaskType;
	}
	
}
