import java.util.Scanner;
class ExtractDigit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int num = sc.nextInt();
        int i = num;//123
		while(i>0)//123>0
		{
			int rem = i%10;
			System.out.println(rem); // 123%10=3
			i/=10;
		}
		
	}
}