package EclipseProject;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of sub1: ");
		int sub1 = sc.nextInt();
		System.out.println("Enter the marks of sub2: ");
		int sub2 = sc.nextInt();
		System.out.println("Enter the marks of sub3: ");
		int sub3 = sc.nextInt();
		int avg = (sub1+sub2+sub3)/3;
		sc.close();
	    if(avg>90) {
	    	System.out.print("Congratulations!! Your grade is A ");
	    }
	    else if(avg>=80 && avg<90) {
	    	System.out.print("Congratulations!! Your grade is B ");
	    }
	    else if(avg>=70 && avg<80) {
	    	System.out.print("Congratulations!! Your grade is C ");
	    }
	    else {
	    	System.out.print("Sorry, You are failed");
	    }

	}
	

}
