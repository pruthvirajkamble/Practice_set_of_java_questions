import java.util.Scanner;
class CountOfDigit01
{
	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int num = sc.nextInt();
		int count = 0;
		int i = num;// 1000
		while(i>0){ //1000>0
			count++;
			i/=10;// 1000/10, 100/10, 10/10, 1/10, 
		}
		System.out.println("Count of digit number : " + count);

	}
}