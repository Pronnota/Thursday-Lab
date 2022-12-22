package ThursdayLab;

import java.util.Scanner;

public class AngstromNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number: ");
		int x=sc.nextInt();

		int rem,num=x,c=0,sum=0;
		
		while(x!=0) {
			
			x/=10;
			c+=1;
		}
		while (num!=0) {
			
			rem=num%10;
			sum+=(int)Math.pow(rem,c);
			num/=10;
		}
		System.out.println(sum);
	}

}
