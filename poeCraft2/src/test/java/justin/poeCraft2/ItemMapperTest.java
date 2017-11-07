package justin.poeCraft2;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ItemMapperTest {
	ItemMapper itemMapper;
	Item item;
	Item itemFromJson;
	@Before
	public void init(){
		itemMapper = new ItemMapper();
		//item = new Item("Healing", "Seething", "Of Movement");
		itemFromJson = (Item) itemMapper.createObjectFromJson("{\"flaskType\": \"health\"}");
	}
	@Test
	public void canMapJsonToObject(){
		System.out.println(itemFromJson.getItemType());
		
		//Assert.assertEquals(item, itemMapper.createObjectFromJson());
		//Assert.assertTrue(EqualsBuilder.reflectionEquals(item, itemMapper.createObjectFromJson()));
		//Assert.assertThat(item.isEqualToComparingFieldByFieldRecursively‌(itemMapper.createObjectFromJson()));
		//assertEquals(item, itemMapper.createObjectFromJson());
		
		//Assert.assertEquals(item.getFlaskType(), itemFromJson.getFlaskType());
		
		Assert.assertEquals("health", itemFromJson.getItemType());
	}
}
