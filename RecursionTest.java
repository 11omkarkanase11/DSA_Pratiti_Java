import java.util.Scanner;

public class RecursionTest {
       
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number:");
			int n = sc.nextInt();
			int f =factorial(n);
			
			System.out.println(f);
		
	}
	
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		
		return n*factorial(n-1);
	}
}
