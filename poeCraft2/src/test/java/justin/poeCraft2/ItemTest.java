package justin.poeCraft2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ItemTest {
	Item item;
	@Before
	public void init(){
		item = new Item("{\"flaskType\": \"Test Potion\"}");
	}
	@Test
	public void canGetItemType(){
		Assert.assertEquals("{\"flaskType\": \"Test Potion\"}", item.getItemType());
	}
	@Test
	public void canSetItemType(){
		item.setItemType("hi");
		Assert.assertEquals("hi", item.getItemType());
	}
}
