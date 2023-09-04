
public class Example4 {
	public static void main(String[] args) {
		String[] vocab= {"is","are","am","of","an","a"};
		String quote="These are Apples";
		
		boolean flag=false;
		for(String word:vocab) {
			if(quote.indexOf(word)!=-1) {
				flag= true;
				break;
			}
		}
		
		System.out.println(flag?"valid quote":"invalid quote");
	}

}
