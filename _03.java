package programs;
import java.util.Scanner;
public class _03{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++)
			System.out.print(fib(i)+" ");
		
	}
	
	public static int fib(int n) {
		if (n==0)
			return 0;
		else if (n==1)
			return 1;
		else
			return fib(n-1)+fib(n-2);
	}
	
	
}