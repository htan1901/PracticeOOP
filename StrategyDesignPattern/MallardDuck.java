import behavior.fly.FlyByWings;
import behavior.quack.Quack;

public class MallardDuck extends Duck{

	public MallardDuck() {
		flyBehavior = new FlyByWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("Looks like mallard");
	}
}
