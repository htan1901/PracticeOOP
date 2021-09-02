import behavior.fly.DoNotFly;
import behavior.fly.FlyBehavior;
import behavior.quack.Squeak;

public class RubberDuck extends Duck{
	public RubberDuck() {
		flyBehavior = new DoNotFly();
		quackBehavior = new Squeak();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	@Override
	public void display() {
		System.out.println("Looks like a rubber duck");
	}
}
