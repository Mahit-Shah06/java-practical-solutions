import java.util.Scanner;

public class q1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		Integer x = sc.nextInt();

		if (palindrome(x)){
			System.out.println("Yes, it is a palindrome");
		}
		else{
			System.out.println("It is not a palindrome");
		}
	}

	public static boolean palindrome(int num){
		int original = num;
		int reversed = 0;
		while(num!=0){
			int digit = num%10;
			reversed = reversed*10 + digit;
			num/=10;
		}
		
		return original == reversed;
	}
}
