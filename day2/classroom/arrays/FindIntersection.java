package week1.day2.classroom.arrays;

public class FindIntersection{
	public static void main(String[] args) {
		int[] arryA= {3,2,11,4,6,7}; 
		int[] arryB={1,2,8,4,9,7};
		int len1=arryA.length;
		int len2=arryB.length;
		for (int i=0;i<len1;i++) {
			for(int j=0;j<len2;j++) {
				if(arryA[i]==arryB[j])
					System.out.println(arryA[i]);
			}
			}
		}
		
	}