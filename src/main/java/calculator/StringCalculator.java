package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;

class StringCalculator {

	public static int add(String input) {
		if (input.isEmpty()) {
			return 0;
		} else if (input.contains(",")) {
			String[] data = input.split(",");
//    		int values = Integer.parseInt(data.toString());

			return Integer.parseInt(data[0]) + Integer.parseInt(data[1]);
//    		return sum(values);
			
//			String[] tokens = tokenize(input);
//			List<Integer> numbers= Integer.toString(tokens, toInt(input));
//			return sum(numbers).intValue();
			
		} else {
			return Integer.parseInt(input);
		}
	}
	

	private static String[] tokenize(String input) {
		if (input.startsWith("//")) {
			Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
			m.matches();
			String customDelimiter = m.group(1);
			String numbers = m.group(2);
			return numbers.split(customDelimiter);
		} else {
			String[] tokens = input.split(",|\n");
			return tokens;
		}
	}

	private static int toInt(String input) throws NumberFormatException{
		return Integer.parseInt(input);
	}
}