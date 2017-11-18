package justin.gearFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArmorTest {
	Armor armor;
	@Before
	public void init(){
		armor = new Armor();
	}
	@Test
	public void canGetName(){
		Assert.assertEquals("Lizard Leather", armor.getName());
	}
	@Test
	public void canSetName(){
		armor.setName("hi");
		Assert.assertEquals("hi", armor.getName());
	}
	@Test
	public void canGetType(){
		Assert.assertEquals("Leather", armor.getType());
	}
	@Test
	public void canSetType(){
		armor.setType("hi");
		Assert.assertEquals("hi", armor.getType());
	}
}
