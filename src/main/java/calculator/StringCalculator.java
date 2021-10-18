package calculator;

class StringCalculator {

    public static int add(String input) {
    	if(input.isEmpty()) {
    		return 0;
    	}else if(input.contains(",")) {
    		String[] data = input.split(",");
    		return Integer.parseInt(data[0]) +Integer.parseInt(data[1]);
    	}else {
    		return Integer.parseInt(input);
    	}
        
    }

}