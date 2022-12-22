package ThursdayLab;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number: ");
		int x=sc.nextInt();
		
		int rem,rev=0,num=x;			//Variables to store the reminder and reverse number
		
		// To get the reverse number
		
		while(x!=0) {
			
			rem=x%10;
			x/=10;
			rev=rem+(10*rev);
		}
		if (rev==num) {
			System.out.println("The given number "+num+" is a palindrome number.");
		}
		else
			System.out.println("The given number "+num+" is not a palindrome number and the reverse number is "+rev);
	}

}
