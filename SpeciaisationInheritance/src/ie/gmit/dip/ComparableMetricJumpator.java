package ie.gmit.dip;

import ie.gmit.dip.Jumpator.Unit;

public interface ComparableMetricJumpator extends MetricJumpator, Comparable<ComparableMetricJumpator> {

	public default void jump(double height, Unit unit) throws Exception {
		//completly override the inherited behavior! Guarantees we dont have a DDoD
		//Jumpator.super.jump(height, unit);
	}

}
