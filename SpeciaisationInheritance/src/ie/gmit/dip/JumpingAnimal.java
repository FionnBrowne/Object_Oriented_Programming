package ie.gmit.dip;

import java.io.Serializable;

public abstract class JumpingAnimal extends Animal implements Jumpator, Comparable<JumpingAnimal>, Serializable {
 
	private static final long serialVersionUID = 1L;
	private int maxHeight;

	public JumpingAnimal(int maxHeight, String name) {
		super(name);
		this.maxHeight = maxHeight;
	}

	public JumpingAnimal(int maxHeight, int lifeForce, String name) {
		super(lifeForce, name);
	}

	public int getMaxHeight() {
		return this.maxHeight;
	}

	@Override
	public int compareTo(JumpingAnimal other) {
		return (this.maxHeight > other.getMaxHeight()) ? 1 : -1;// ternary IF statement
	}

	public void jump() throws Exception {
		System.out.println(this.getName() + " is jumping to a height of " + this.maxHeight);// need getname to get
																							// access to privtae method
		super.move();// calling inherited move method
		System.out.println(super.getName() + " is finished jumping.");// getname is the one inherited from//because it
																		// is not defined in the class here super is
																		// better to use
	}

}
