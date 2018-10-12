import java.util.*;

public class LoopMorse {

	public static Set<String> morseCodes (int m, int n) {
	    Set<String> result = new TreeSet<>();
	    String dotBase = createMorse(".", m, n);
	    result.add(dotBase);
	    for (int i = 0; i < dotBase.length(); i++) {
	    	for (int j = 0; j < dotBase.length(); j++) {
	    		result.add(swappedMorse(dotBase, i, j));
	    		result.add(dotBase);
	    	}
	    }
	    
	    String dashBase = createMorse("-", m, n);
	    result.add(dashBase);
	    for (int i = 0; i < dashBase.length(); i++) {
	    	for (int j = 0; j < dashBase.length(); j++) {
	    		result.add(swappedMorse(dashBase, i, j));
	    	}
	    }
	    
	    
	    
	    return result;
	}
	
	
	
	
	
	
	public static String createMorse(String start, int m, int n) {
		String result = start;
		if (result.substring(0,1) == ".") {
			for (int i = m - 1; i > 0; i--) {
				result += ".";
			}
			for (int j = n; j > 0; j--) {
				result += "-";
			}
		}
		else if (result.substring(0,1) == "-") {
			for (int i = n - 1; i > 0; i--) {
				result += "-";
			}
			for (int j = m; j > 0; j--) {
				result += ".";
			}
		}
		return result;
	}
	
	
	
	
	
	
	public static String swappedMorse (String phrase, int start, int end) {
		char[] letters = phrase.toCharArray();
		char temp = letters[start];
		letters[start] = letters[end];
		letters[end] = temp;
		return String.valueOf(letters);
	}
	







	public static void main (String[] args) {
		Set<String> huh = morseCodes(4 , 2);
		System.out.println(huh);
	}
	
}
