// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int currentValue = Integer.parseInt(args[0]);
		double rate = Math.ceil(Double.parseDouble(args[1]) / 100);
		double numberOfYears = Double.parseDouble(args[2]);
		double futureValue = currentValue * Math.pow((1 + rate), numberOfYears);
		System.out.printf("%n After %f years, $%f saved at %f.0% will yeild $%f",
			numberOfYears, currentValue, rate, (int) futureValue);
	}
}