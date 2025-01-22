package Exercise_3;

import java.util.Scanner;

public class Q7 {
//7. WAP that accepts an integer n and compute the value of n+nn+nnn+nnnn?//
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
        int nn = (n + n);
        int nnn = (n + n + n);
        int nnnn = (n + n + n + n);

        int result = n + nn + nnn + nnnn;

        // Display the result
        System.out.println("The result of n + nn + nnn + nnnn is: " +result);


	}

}
