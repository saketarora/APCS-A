//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort 
{
	private static int passCount;

	public static void quickSort(Comparable[] list)
	{




	}


	private static void quickSort(Comparable[] list, int low, int high)
	{
		if (low < high){
			int split = partition(list, low, high);
			quickSort(list, low, split);
			quickSort(list, split+1, high);

		}






	}


	private static int partition(Comparable[] list, int low, int high) 
	{
		Comparable pivot = list[0];
		int bot = low-1;
		int top = high + 1;
		while (bot < top){
			if (list[++bot].compareTo(pivot) > 0){
				if (list[--top].compareTo(pivot) < 0){
					if(bot>=top){
						return top;
					}
					Comparable temp = list[bot];
					list[bot] = list[top];
					list[top] = temp;
					
				}
				else
					break;
			}
			else
				break;
		}


		return 0;
	}

	public static String toString(Comparable[] list){
		System.out.println("pass " + list);
		return "pass " + list;
	}

}