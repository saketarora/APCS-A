//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Student
{
	private String myName;
	private Grades myGrades;
	
	public Student()
	{
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{
		setName(name);
		setGrades(gradeList);


	}
	
	public void setName(String name)
	{
		myName = name;

	}	
	
	public void setGrades(String gradeList)
	{	
		
		myGrades = new Grades(gradeList);
	
	}
	
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot, grade);

	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{	
		double av = 0.0;
		av = getSum() / getNumGrades();
		return av;
	}

	public double getAverageMinusLow()
	{
		double av = 0.0;
		av = (getSum() - myGrades.getLowGrade()) / (getNumGrades() -1);
		return av;
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();		
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();	
	}
	
	public String toString()
	{
		String output = getName();
		return output + " :: " + myGrades.toString();
	}

	public int compareTo(Student student) {
		
		return 0;
	}	
}