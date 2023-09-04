import java.util.Scanner;

public class PrimeNumberQuiz {
	
	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=console.nextInt();
		
		System.out.println(CheckPrime(num)? "Prime No":"Composite No");
	}

	private static boolean CheckPrime(int num) {
		int flag = 0;
		
		if(num==0 || num==1) {
			flag =1;
			
		}
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				flag=1;
				
				
			}
			
		}
		if(flag==1)
		return false;
		else
			return true;
	}

	
}
