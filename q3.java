import java.util.Scanner;

public class q3{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter num of primes: ");
                int num = sc.nextInt();

		System.out.println("First n prime numbers are:");
		
		int count = 0;
		int x = 2;
		while(count<=num-1){
			if (isPrime(x)){
				System.out.println(x);
			count++;
			}
		x++;
		}
	}

	public static boolean isPrime(int num){
		if (num<=1) 
			return false;
		for (int i = 2; i<=Math.sqrt(num); i++){
			if(num%i == 0)
				return false;
		}
		return true;
	}
}
