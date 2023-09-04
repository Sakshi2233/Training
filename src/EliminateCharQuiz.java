
public class EliminateCharQuiz {
//	
//	public static void main(String[] args) {
//		String str="Hello-Beautiful-World";
//		
//		System.out.println(eliminate(str,"-"));
//	}
//
//	private static String eliminate(String str, String ch) {
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)=='-') {
//			str.charAt(i)="";
//				
//				
//			}
//			
//		}
//		return 0;
//		 
//		//return str.replace("-", "");
//	}
//
//}


public int solution(int[] A) {
    int min=0;

     for(int i=0;i<A.length;i++){
         for(int j=i+1;j<A.length;j++){
             for(int k=i+2;k<A.length;k++){
                 int final1 = A[i]*A[j]*A[k];
                 if(final1>min){
                     min=final1;
                 }
                 else if(final1<0) {
                	 min=final1;
                 }
                 
             }}}
	return min;
	
}}