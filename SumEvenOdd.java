import java.util.Scanner;
class SumEvenOdd
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		int even = 0;
		int odd = 0;

		for (int i = num;i>0 ;i/=10 ) 
		{
			int rem = i%10;
			if(rem%2==0){
				even += rem;	
			}
			else {
				odd+=rem;	
			}
		}
		System.out.println("Sum of even : " even);
		System.out.println("Sum of Odd " odd);
	}
}