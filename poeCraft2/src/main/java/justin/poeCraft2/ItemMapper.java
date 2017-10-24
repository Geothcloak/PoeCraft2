package justin.poeCraft2;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ItemMapper {
	 public Item createObjectFromJson(){
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = "{\"flaskType\": \"Hello World\"}";
		//"{\"flaskType\": \"Healing\"}";
		//"{\"flaskType\": \"Healing\",\"prefix\": [\"Seething\", \"Bubbling\"],\"suffix\":[\"Of Movement\", \"Of Damage\"]}"
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
		return item;
	}
	
}
