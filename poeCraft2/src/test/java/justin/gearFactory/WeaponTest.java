package justin.gearFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WeaponTest {
	Weapon weapon;
	@Before
	public void init(){
		weapon = new Weapon();
	}
	@Test
	public void canGetName(){
		Assert.assertEquals("BeeSting", weapon.getName());
	}
	@Test
	public void canSetName(){
		weapon.setName("hi");
		Assert.assertEquals("hi", weapon.getName());
	}
	@Test
	public void canGetType(){
		Assert.assertEquals("Dagger", weapon.getType());
	}
	@Test
	public void canSetType(){
		weapon.setType("hi");
		Assert.assertEquals("hi", weapon.getType());
	}
}
