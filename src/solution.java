import java.lang.reflect.Array;
import java.util.Scanner;

public class solution {
public static void main(String[] args) {


Scanner newScanTest = new Scanner(System.in);
int n=newScanTest.nextInt();
int One = 0,Two = 0;
int[] array = new int[10];   
for(int i=0; i<n; i++)  
{    
	One = newScanTest.nextInt();
	Two = newScanTest.nextInt();  
}  



System.out.println(Solution(One,Two));

}

private static int Solution(int one,int two) {
	int max=100000;
	int peri=2*(one+two);
	if(max>peri) {
		max=peri;
	}
	
	return peri;
	
	
	
}
}
