package ie.gmit.dip;

public class Kangaroo extends JumpingAnimal {// happens at compile time rather than runtime
	private Pouch pouch = new Pouch();
	private int size = 7;// kangaroos start life with a size of 7 units

	public Kangaroo(int maxHeight, int lifeForce, String name) {
		super(maxHeight, lifeForce, name);

	}

	public Kangaroo(int maxHeight, String name) {
		super(maxHeight, name);

	}

	@Override // kangaroo jumps different so we need to overide for it
	public void jump() throws Exception {
		System.out.println(this.getName() + " is jumping as a Kangaroo ");
		super.move();
		this.eat();
	}

	@Override // guarenttes eat is in the super class
	public void eat() {
		super.eat();
		System.out.println(this.getClass().getName() + "-> is eating. . .");
		size++;
	}

	@Override
	public void sleep() {
		System.out.println(this.getClass().getName() + "-> is sleeping lying down. . zzzzzz");

	}

	private class Pouch {
		// an inner class promotes encapsulation but not re-use
	}

}
