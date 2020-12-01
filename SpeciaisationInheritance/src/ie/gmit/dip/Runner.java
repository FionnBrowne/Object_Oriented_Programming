package ie.gmit.dip;

import java.util.*;

public class Runner {
	public static void main(String[] args) throws Exception {
		Jumpator a = new RaceHorse(34, "sheep");// ainmal is abstract
		a.jump();
//		a.move();
//		a.eat();
//		a.sleep();

//		Jumpator.getHeightAsMeters(34);
//		double val = Jumpator.MIN_HEIGHT;

		a = new Kangaroo(12, "Arkle");
		// a = new Kangaroo(4, "skippy");// wont work cant be cast as an array RaceHorse

		RaceHorse arkle = (RaceHorse) a;// Down-casts are dangerous!
		arkle.gallop();

		// visit(arkle);// passing in jump
		// visit(new Kangaroo(4, "Skippy"));

		List<Jumpator> jumper = new ArrayList<>();
		for (int i = 0; i < 10; i++) {

			int random = (int) (Math.random() * 100);
			if (random > 50) {
				jumper.add(new RaceHorse(12, "Arkle -" + i));
			} else {
				jumper.add(new Kangaroo(12, "Skippy +" + i));
			}
		}
		visit(jumper);

	}

	// standard method
	public static void visit(Collection<Jumpator> col) throws Exception {
		for (Jumpator j : col) {// parametric polymorphism
			j.jump();// Behavior depends on the type of jumpingAnimal => POLYMORPHISM
			// j.eat();// this behaviour is polymorphic it depends on the type of ainmal
			// j.sleep();
		}

	}
}
