package week1.day1;
public class Factorial 	{
		public static void main(String[] args) {
		
			int num=5;
			int factorial=1;
			
			for(int i=num;i>0;i--)
			{
				factorial = factorial *i;
			}
			System.out.println("Factorial of 5 is:"+factorial );
		}
}
