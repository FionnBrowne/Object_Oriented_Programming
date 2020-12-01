package ie.gmit.dip;

public class RaceHorse extends JumpingAnimal {
	private int speed;

	public RaceHorse(int maxHeight, String name) {
		super(maxHeight, name);

	}

	public RaceHorse(int maxHeight, int lifeForce, String name) {
		super(maxHeight, lifeForce, name);

	}

	public RaceHorse(int maxHeight, String name, int speed) {
		super(maxHeight, name);
		this.speed = speed;
	}

	public void gallop() throws Exception {
		System.out.println(super.getName() + " Is galloping at " + speed + "km/hr.");
		move();
	}

	@Override
	public void sleep() {
		System.out.println(this.getClass().getName() + "-> is sleeping standing up. . zzzzzz");

	}

	@Override
	public void eat() {
		System.out.println(this.getClass().getName() + "-> is eating. . .");
		// the horse stops to eat
		int temp = speed;
		speed = 0;// stop
		super.eat();// eat
		speed = temp;
	}

}
