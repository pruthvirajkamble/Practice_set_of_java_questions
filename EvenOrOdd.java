import java.util.Scanner;
class EvenOrOdd
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		// if(num%2==0){
		// 	System.out.println(num + " It is Even");
		// }else {
		// 	System.out.println(num + " It is odd ");
		// }

		int i = num;
		while(i>0){
			int rem = i%10;
			if(rem%2==0){
				System.out.println(rem+" it is a even ");
			}else {
				System.out.println(rem + " it is a odd");
			}
			i/=10;
		}
	}
}