import java.util.*;

public class OldMorse {

	public static Set<String> morseCodes (int m, int n) {
	    Set<String> result = new TreeSet<>();
	    String base = createMorse(m, n);
	    result.add(base);
	    for (int i = 0; i < base.length(); i++) {
	    	for (int j = 0; j < base.length(); j++) {
	    		base = swappedMorse(base, i, j);
	    		result.add(base);
	    	}
	    }
	    return result;
	}
	   
	    	
	public static String createMorse (int m,  int n) {
		String str = "";
    	Random r = new Random();
    	if (m == 0 && n == 0) {
    		return str;
    	}
    	else {
    		int toss = r.nextInt(2) + 1;
    		if (toss == 1) {
    			if (m <= 0) {
    				str = "-" + createMorse(m, n - 1);
    			}
    			else {
    				str = "." + createMorse(m - 1, n);
    			}
    		}
    		else if (toss == 2){
    			if (n <= 0) {
    				str = "." + createMorse(m - 1, n);
    			}
    			else {
    				str = "-" + createMorse(m, n - 1);
    			}
    		}
    	}
    	return str;
	}
	
	public static String swappedMorse (String phrase, int start, int end) {
		char[] letters = phrase.toCharArray();
		char temp = letters[start];
		letters[start] = letters[end];
		letters[end] = temp;
		return String.valueOf(letters);
	}
	   
	
	
	public static void main (String[] args) {
		Set<String> huh = morseCodes(2 , 2);
		System.out.println(huh);
	}
}
