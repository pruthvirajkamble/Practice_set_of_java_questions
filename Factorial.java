import java.util.Scanner;
class Factorial
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Number : ");
		int num = sc.nextInt();
		// int n=1;     
		// for(int i=1;i<=num;i++)
		// {
		// 	n *= i;
		// }
		// System.out.println(n);
		int ans = factorialNumber(num);
		System.out.println(ans);
	}
	public static int factorialNumber(int n) // 4 , 3 
		{
			if(n==0)
				return 1;

            return n*factorialNumber(n-1); // 4*fan(3), 3 * fac(2), 
		}
}