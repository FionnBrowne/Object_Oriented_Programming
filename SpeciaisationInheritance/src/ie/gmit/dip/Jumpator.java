package ie.gmit.dip;

public interface Jumpator {// interfaces are implicityly public
	public static double MIN_HEIGHT = 1.00d;

	public enum Unit {
		Metric, Imperial
	};// A set of predefined constants

	public abstract void jump() throws Exception;

//a static methods is used to add helper behaviour to an interface
	public static double getHeightAsMeters(double feet) {
		final double weight = 0.3048d;
		return feet * weight;
	}

//a default method is used to retrofit and interface with  new functional behavior 
	public default void jump(double height, Unit unit) throws Exception {// every class has to implement this if not the
																			// dont work
		if (unit == Unit.Imperial) {
			height = Jumpator.getHeightAsMeters(height);
		}
		jump();// call jump() even though it has not been implemented yet!
	}
}
