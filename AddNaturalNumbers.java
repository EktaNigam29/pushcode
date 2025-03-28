package learncoding;

import java.util.Scanner;

public class AddNaturalNumbers {
	static int n;
	static int sum=0;
	public static void main(String[] args) {
	
	System.out.println("Enter number of term");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
			for(int i=1;i<=n;i++)
			{
				sum=sum+i;
			}
			System.out.println("addition of natural  number" + sum);

	}

}
