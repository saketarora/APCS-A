//� A+ Computer Science  -  www.apluscompsci.com
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
		return word.indexOf(c) >= 0;
	}

	public boolean findSubString(String s)
	{
		return word.indexOf(s) >= 0;
		
	}

 	public String toString()
 	{
 		return word;
	}
}