//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{


	}

	public StringChecker(String s)
	{

		word = s;
	}

   public void setString(String s)
   {
   		word=s;
   }

	public boolean findLetter(char c)
	{
		int check = word.indexOf(c);
		int len = word.length();
		if  (check <= len) {
			return true;
		}
		return false;
	}

	public boolean findSubString(String s)
	{
		int check = word.indexOf(s);
		int len = word.length();
		if  (check <= len) {
			return true;

		}
		return false;
		
	}

 	public String toString()
 	{
 		return "\n\n";
	}
}