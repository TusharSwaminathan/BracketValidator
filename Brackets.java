package Git;

import java.util.Hashtable;
import java.util.Stack;

public class Brackets {

	public static void main(String[]a) {

		String strInput="({[]{}})";
		Hashtable<String, String> hBracket=new Hashtable<String, String>();
		Stack<String> stkBrackets=new Stack<String>();
		hBracket.put("]", "[");
		hBracket.put("}", "{");
		hBracket.put(")", "(");

		for(int i=0;i<strInput.length();i++)
		{
			if(stkBrackets.isEmpty())
				stkBrackets.push(String.valueOf(strInput.charAt(i)));
			else if(hBracket.containsKey(String.valueOf(strInput.charAt(i)))){
				if(stkBrackets.peek().equals(hBracket.get(String.valueOf(strInput.charAt(i)))))
				stkBrackets.pop();}
			else
				stkBrackets.push(String.valueOf(strInput.charAt(i)));
		}
		if(stkBrackets.isEmpty())
			System.out.print("Valid Expression");
		else
			System.out.print("InValid Expression");			
	}
}
