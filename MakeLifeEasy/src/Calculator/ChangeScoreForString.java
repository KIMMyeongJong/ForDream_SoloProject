package Calculator;

public class ChangeScoreForString {
	static String[] stringScoreArray = new String[33];

	void changeScore() {
		for (int i = 0; i < 33; i++) {
			stringScoreArray[i] = Double.toString(CalculatorArray.scoreArray[i]);
		} // for end
	}// void end
}
