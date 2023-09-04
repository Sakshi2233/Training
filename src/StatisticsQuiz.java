import java.util.Arrays;

public class StatisticsQuiz {

	public static void main(String[] args) {
		int arr[]= {3,8,2,5,9,4,7};
		
		System.out.println("Sum: "+ sum(arr));
		System.out.println("Min: "+ min(arr));
		System.out.println("Max: "+ max(arr));
		System.out.println("Avg: "+ avg(arr));
		

	}
	

	private static int sum(int[] arr) {
		int a = 0;
		for(int i=0;i<arr.length;i++) {
			a=a+arr[i];
			
		}
		return a;
	}

	

	private static int max(int[] arr) {
		
		//Arrays.sort(arr);
		int m=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>m) {
				m=arr[i];
			}
			
		}
		
		return m;
		
		
	//return arr[arr.length-1];
	}


	private static int min(int[] arr) {
		//Arrays.sort(arr);
		
		int min_m=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min_m) {
				min_m=arr[i];
			}
			
		
		}return min_m;
		//return  arr[0];
	}
private static int avg(int[] arr) {
	
	
		
		return sum(arr)/arr.length;
	}
}
