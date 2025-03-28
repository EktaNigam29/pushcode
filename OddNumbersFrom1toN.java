package learncoding;

import java.util.Scanner;

public class OddNumbersFrom1toN {
	static int n;
	public static void main(String[] args) {
		System.out.println("Enter number of term");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i=i+2)
		{
			
				System.out.println("print all odd numbers"+i);
			
		}
	}

}
