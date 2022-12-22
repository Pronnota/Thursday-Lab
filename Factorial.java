package ThursdayLab;

import java.util.Scanner;

public class Factorial {
	
public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num=sc.nextInt();
		
		int fact=1;  // Variable to store multiplication value for each iteration
		
		for(int i=1;i<=num;i++){
			
		fact*=i;
		
		}
		System.out.println("The factorial of "+num+" is "+fact);
	}

}
