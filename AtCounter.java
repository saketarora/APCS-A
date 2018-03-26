//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;

	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{		{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
	}

	public int countAts(int r, int c)
	{
		int counter = 0;
		int rows = 10;
		int col = 10;
		if (atMat[r][c] == '@'){
			atMat[r][c] = 'c';
			counter++;
			if (r+1 < rows && r+1 > 0)
				{counter = counter + countAts(r + 1, c);}
			if (r-1 < rows && r-1 >= 0)
				counter = counter + countAts(r - 1, c);
			if (c+1 < col && c+1 > 0)
				counter = counter + countAts(r, c + 1);
			if (c-1 < col && c-1 > 0)
				counter = counter + countAts(r, c - 1);
			}

		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
		atCount = counter;
		return counter;
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected.";
		return output;
	}
}