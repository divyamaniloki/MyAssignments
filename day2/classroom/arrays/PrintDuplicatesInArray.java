package week1.day2.classroom.arrays;

public class PrintDuplicatesInArray 
{
	public static void main(String[] args) {
		
	 	int[] arry = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	 	
	 	int l=arry.length;
	 	for(int i=0;i<l;i++)
	 	{
	 		for(int j=i+1;j<l;j++) {
	 			if(arry[i]==arry[j])
	 			
	 System.out.println("Duplicates in array :"+arry[i]);
	 
	 		
	 	}
	 	}
	}}