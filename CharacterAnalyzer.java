//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;


	public CharacterAnalyzer(char c)
	{
		theChar = c;

	}

	public void setChar(char c)
	{
		

	}

	public char getChar()
	{
		return theChar;
	}
	
	public int getASCII( )
	{
		int As = 0;
		if (theChar == 'A'){
			As = 65;
		}
		if (theChar == 'a') {
			As = 97;
		}
		if (theChar == '0') {
			As = 48;
		}
		
		return As;
	}

	public boolean isUpper( )
	{
		if (getASCII() >= 65 && getASCII() <= 90) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean isLower( )
	{
		if (getASCII() >= 97 && getASCII() <= 122) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isNumber( )
	{
		if (getASCII() >= 48 && getASCII() <= 57) {
			return true;
		}
		else {
			return false;
		}
	}	


	public String toString()
	{

		if (isLower() == true) {
			return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	
		}
		if (isUpper() == true) {
			return ""+getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";
		}
		if (isNumber() == true) {
			return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";
		}
		
		return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";
	}
}