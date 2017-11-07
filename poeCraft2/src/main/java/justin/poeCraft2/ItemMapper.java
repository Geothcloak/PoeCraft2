package justin.poeCraft2;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import justin.gearFactory.Gear;
import justin.gearFactory.GearFactory;

public class ItemMapper {
	 public Gear createObjectFromJson(String jsonString){
		ObjectMapper mapper = new ObjectMapper();
		GearFactory gearFactory = new GearFactory();
		Gear newGearCreated;
		
		Item item = null;
		try {
			item = mapper.readValue(jsonString, Item.class);
			
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return gearFactory.getGear(item.getItemType());
	}


	
}
