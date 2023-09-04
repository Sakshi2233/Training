import java.util.Scanner;

public class PalindromeQuiz {

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String word = console.next();
		System.out.println(checkPalindrome(word )? "Palindrome" : "NOt Palindrome");

	}

	private static boolean checkPalindrome(String word) {
		for(int i=0;i<=word.length()/2;i++) {
			for(int j=word.length()-1;j>0;j--) {
				
			}
			if(word.length()%2==0) {
				if(word.charAt(i)==word.charAt(word.length()-i));{
					return true;
				}
			}
			
			
		}
		return false;
	}

}
