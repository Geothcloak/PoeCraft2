package justin.gearStrategy;
import justin.gearFactory.Gear;

public class Context {
	Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public String executeStrategy(Gear gear){
		return strategy.printGear(gear);
	}
}
