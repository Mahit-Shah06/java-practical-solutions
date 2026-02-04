import java.util.Scanner;

public class q2{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a num: ");
                int num = sc.nextInt();

		int result = sod(num);
		System.out.println("Sum of all the digits = "+result);
	}

	public static int sod(int num){
		int sum = 0;
		while(num!=0){
			int digit = num%10;
                        sum+=digit;
                        num/=10;
                }
		return sum;
	}
}
