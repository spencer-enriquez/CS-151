import java.util.*;

import javax.xml.datatype.DatatypeConstants.Field;

public class lab22 {
	
	public static Object[] grow(Object[] a, int newLength) throws Exception
	{
	   Object[] newArray = new Object[newLength];
	   for (int i = 0; i < Math.min(a.length, newLength); i++)
	      newArray[i] = a[i];
	   return newArray;
	}

	
	public static void main(String[] args) throws Exception {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Hello");
		myList.add("World");
		
		String[] words = "Mary had a little lamb".split(" ");
		String[] moreWords = (String[]) grow(words, 10);
		System.out.println(moreWords.length);
		System.out.println(moreWords[0].length());
	}
}
