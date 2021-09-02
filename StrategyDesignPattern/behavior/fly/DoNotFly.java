package behavior.fly;

public class DoNotFly implements FlyBehavior{
	@Override
	public void fly() {
		System.out.println("Do not fly");
	}	
}
