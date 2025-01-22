package Exercise_3;

public class Q8 {
/*8. Write a Java program that reads a number in inches and converts it to meters. Note: One inch is 0.0254 meter.
	Test Data
	Input a value for inch: 1000

	Expected Output :
	1000.0 inch is 25.4 meters*/
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("Number before swapping : a = "+a + ", b = " + b);
		
		// Swap values without using a third variable
        a = a + b; // a now holds the sum of a and b                  a= 30
        b = a - b; // b is now assigned the original value of a       b=10
        a = a - b; // a is now assigned the original value of b       a=20
		
		System.out.println("Number after swapping : a = "+a + ",b ="+b);

	}

}
