// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Generate 3 random numbers in the given range sort them from the smallest to biggest
		double range = Double.parseDouble(args[0]);
		double a = Math.round(Math.random() * range);
		double b = Math.round(Math.random() * range);
		double c = Math.round(Math.random() * range);
		System.out.println((int) a + " " + (int) b + " " + (int) c);

		// sort the numbers from the smallest to biggest
        double min = Math.min(a, Math.min(b, c));         // Smallest value
        double max = Math.max(a, Math.max(b, c));         // Largest value
    	double middle = a + b + c - min - max;            // Middle value
        System.out.println((int) min + " " + (int) middle + " " + (int) max);
	}
}
