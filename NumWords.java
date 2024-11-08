// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // reciving a number & returns its hundreds, tens, and ones values
		int givenNumber = Integer.parseInt(args[0]);
		int ones = (givenNumber % 10);
		int tens = (((givenNumber % 100) - ones) / 10);
		int hundreds = ((givenNumber - tens - ones) / 100);
		System.out.printf("%n %s hundreds, %s tens, and %s ones.", hundreds, tens, ones);
	}
}
