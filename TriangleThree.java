//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
	}

	public TriangleThree(int count, String let)
	{
	}

	public void setTriangle( String let, int sz )
	{
		letter = let;
		size = sz;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";		
		for(int i = 0; i<size; i++ )
		{
		   for(int h=i; h<=size; h++ )
			  output = output + " ";				
		   for(int j=i; j>=0; j--)
			output = output + letter; 
		   
		   output = output+"\n";
		}
		return output;
	}
}