package justin.gearStrategy;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import justin.gearFactory.Weapon;

public class WeaponPrinterTest {	
	WeaponPrinter weaponPrinter;
	Weapon mockWeapon;
	
	//TODO research apptest / config file for mocking needed?
	@Before
	public void init(){
		mockWeapon = EasyMock.createMock(Weapon.class);
		weaponPrinter = new WeaponPrinter();
	}
	@Test
	public void canPrintGear(){
		EasyMock.expect(mockWeapon.getType()).andReturn("dagger");
		EasyMock.expect(mockWeapon.getName()).andReturn("BeeStinger");
		
		EasyMock.replay(mockWeapon);
		
		String result = weaponPrinter.printGear(mockWeapon);
		
		Assert.assertEquals("Hey you used a weapon! dagger its name is BeeStinger", result);
		
		
	}
}
