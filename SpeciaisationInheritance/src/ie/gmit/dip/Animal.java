package ie.gmit.dip;

import java.util.*;

public abstract class Animal {
	// instance variables
	private int lifeForce;
	private String name;

	// overloading method
	public Animal(String name) {
		super();
		this.name = name;
		this.lifeForce = new Random().nextInt() >>> 1;// creates random number//>>> shift 32 bits to the right which
														// means put a 1 infront of it
	}

	public Animal(int lifeForce, String name) {
		super();// my super type is java.lang.Object
		this.lifeForce = lifeForce;
		this.name = name;
	}

	public abstract void sleep();// An abstract / deferred method

	// Protected visibility can be seen by subtypes and co-packaged types
	protected String getName() {
		return name;
	}

	public void eat() {// links to kangaroo superclass
		System.out.println(this.getClass().getName() + "-> is eating. . .");
		lifeForce++;
	}

	public void move() throws Exception {
		if (lifeForce <= 0)
			throw new Exception("Cannot move because " + name + "is dead.");
		if (lifeForce <= 100)
			sleep();
		lifeForce--;
	}

}
