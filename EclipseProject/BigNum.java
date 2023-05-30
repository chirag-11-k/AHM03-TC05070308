package EclipseProject;

import java.util.Scanner;

public class BigNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = sc.nextInt();
		System.out.println("Enter b : ");
		int b = sc.nextInt();
		int biggerNumber = (a > b) ? a : b;
		System.out.print("Max : "+ biggerNumber);
	    sc.close();

	}

}
