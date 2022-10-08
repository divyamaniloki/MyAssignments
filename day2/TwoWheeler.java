package week1.day2;

public class TwoWheeler {
	int noOfWheels = 4;
	short noOfMirrors = 2;
	long chassisNumber = 1L;
	boolean isPunctured = false;
	String bikeName = "Honda";
	double runningKM = 25.6;
	
public static void main(String[] args) {
	TwoWheeler myobj = new TwoWheeler();
	System.out.println(myobj.noOfWheels);
	System.out.println(myobj.noOfMirrors);
	System.out.println(myobj.chassisNumber);
	System.out.println(myobj.isPunctured);
	System.out.println(myobj.bikeName);
	System.out.println(myobj.runningKM);
}
}
