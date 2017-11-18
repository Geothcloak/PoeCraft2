package justin.poeCraft2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ItemDriverTest {
	ItemDriver itemDriver;
	@Before
	public void init(){
		itemDriver = new ItemDriver();
	}
	@Test
	public void canCreateItem(){
		itemDriver.CreateItem();
	}
}
