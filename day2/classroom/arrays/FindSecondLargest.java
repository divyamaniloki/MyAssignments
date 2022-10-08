package week1.day2.classroom.arrays;

import java.util.Arrays;

public class FindSecondLargest 
{
	public static void main(String[] args) 
	{
		// Here is the input
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		 for (int values : data)
		 {     
					 
		System.out.print(values + ", ");
		 }
		System.out.println("\n"+data[data.length-2]);

	     }
}
	
