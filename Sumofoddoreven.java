package learncoding;

import java.util.Scanner;

public class Sumofoddoreven {
	static int n;
	static int sum=0;
	public static void main(String[] args) {
		System.out.println("Enter number of term");
		Scanner s=new Scanner(System.in);
//	int 	ch=s.next().charAt(0);to take cahracter input frm the user
		n=s.nextInt();
		
if(n%2==0)
{for(int i=0;i<=n;i=i+2)
{
	sum=sum+i;
}
System.out.println("even number" + sum);
	}
		
		else
		{
			for(int i=1;i<=n;i=i+2)
			{
				sum=sum+i;
			}
			System.out.println("odd number" + sum);
		}
}
}
