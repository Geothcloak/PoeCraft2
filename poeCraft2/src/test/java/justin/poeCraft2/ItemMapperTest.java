package justin.poeCraft2;

import org.junit.Before;
import org.junit.Test;

public class ItemMapperTest {
	ItemMapper itemMapper;
	@Before
	public void init(){
		itemMapper = new ItemMapper();
	}
	@Test
	public void canCreateObjectFromJson(){
		itemMapper.createObjectFromJson("{\"flaskType\": \"Test Potion\"}");
	}
}
