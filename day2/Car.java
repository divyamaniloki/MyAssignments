package week1.day2;
public class Car {
	public static void main(String[] args) {
		Car obj=new Car();
		int output1=obj.addnumbers(1, 2, 3);
		float output2= obj.subnumbers(2, 1);
		int output3= obj.division(5, 4);
		System.out.println(output1);
		System.out.println(output2);
		System.out.println(output3);
	}
	
public void CarName() 
{
System.out.println("Fiat Punto");
}
public int getRegistrationNumber(int reg)
{
	reg = 8888;
	return reg;	
}
public String getCarColour ()
{
	String color = "white";
	return color;
}
public boolean iscarpuncture()
{
	return false;
}
public int addnumbers(int a, int b, int c)
{
	int sum = a+b+c;
	return sum;
}
public int subnumbers(int d, int e)
{
	int sub = d-e;
	return sub;
}
public float muliplication(int f, int g)
{
	int mul = f*g;
	return mul;
}
public int division(int h, int i)
{
	int div = h/i;
	return div;
}
}



