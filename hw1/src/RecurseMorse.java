import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RecurseMorse {
	public static Set<String> morseCodes (int m, int n) {
	    Set<String> result = new TreeSet<>();
	    int posCombinations = factorial(m + n) / (factorial(m) * factorial(n));
	    while (result.size() < posCombinations) {
	    String base = createMorse(m, n);
	    result.add(base);
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
		
	
	
	
	public static int factorial(int num) {
		int answer = num;
		for (int i = num - 1; i > 0; i--) {
			answer *= i;
		}
		return answer;
	}
	
	
	
	
	
	public static void main (String[] args) {
		Set<String> huh = morseCodes(4,2);
		System.out.println(huh);
	}
}
