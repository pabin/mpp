package lab3.prob4;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		for (Property o : properties) {
			totalRent += o.calculateRent();
		}
		return totalRent;
	}
}
