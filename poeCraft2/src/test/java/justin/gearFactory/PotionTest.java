package justin.gearFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PotionTest {
	Potion potion;
	@Before
	public void init(){
		potion = new Potion();
	}
	@Test
	public void canGetName(){
		Assert.assertEquals("Big One", potion.getName());
	}
	@Test
	public void canSetName(){
		potion.setName("hi");
		Assert.assertEquals("hi", potion.getName());
	}
	@Test
	public void canGetType(){
		Assert.assertEquals("Healing Potion", potion.getType());
	}
	@Test
	public void canSetType(){
		potion.setType("hi");
		Assert.assertEquals("hi", potion.getType());
	}
	@Test
	public void canGetAmount(){
		Assert.assertEquals(10, potion.getAmount());
	}
	@Test
	public void canSetAmount(){
		potion.setAmount(11);
		Assert.assertEquals(11, potion.getAmount());
	}
}
