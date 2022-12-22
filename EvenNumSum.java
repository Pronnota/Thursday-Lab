package ThursdayLab;

import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the range: ");
		int range=sc.nextInt();
		
		int sum=0;			//Variable to store the sum value
		
		for (int i=0;i<=range;i+=2) {
			
			System.out.print(i+" ");
			sum+=i;
			
		}
		System.out.println();
		System.out.println("The summation of the even number upto "+range+" is: "+sum);
	}

}
