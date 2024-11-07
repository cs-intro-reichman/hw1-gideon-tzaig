// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// Function gets 3 names of diners and devide their bill between them
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		double amount = Math.ceil(Double.parseDouble(args[3]) / 3);
		System.out.printf("%nDear %s, %s, and %s: pay %.0f Shekels each.%n",
			name1, name2, name3, amount);
	}
}
