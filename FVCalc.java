// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		double numberOfYears = Double.parseDouble(args[2]);
		double futureValue = Math.round(currentValue * Math.pow((1 + rate/100), numberOfYears));
		System.out.printf("%n After %.0f years, $%d saved at %.1f%% will yeild $%d",
		numberOfYears, currentValue, rate, (int) futureValue);
	}
}