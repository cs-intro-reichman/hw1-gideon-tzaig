// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // reciving a number & returns its hundreds, tens, and ones values
		String numberString = args[0];
		while (numberString.length() < 3) {
			numberString = ("0" + numberString);
		}
		System.out.printf("%n %s hundreds, %s tens, and %s ones.",
			numberString.charAt(numberString.length() - 3), 
			numberString.charAt(numberString.length() - 2), 
			numberString.charAt(numberString.length() - 1));
	}
	// if 'string' is not accepted, use modulu 
}
