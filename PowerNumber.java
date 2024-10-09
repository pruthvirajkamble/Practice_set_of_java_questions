import java.util.Scanner;
class PowerNumber {
    static int power(int N, int P)
    {
        // int pow = 1;
        // for (int i = 1; i <= P; i++)
        //     pow *= N;
        // return pow;
        if(P==0){
        	return 1;
        }
        int ans = N*(power(N,P-1));
        return ans;

    }
 
    // Driver code
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int N = sc.nextInt();
        System.out.print("Enter your pow : ");
        int P = sc.nextInt();
 
        System.out.println(power(N, P));
    }
}