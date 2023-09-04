
public class TestLinkedList {

	public static void main(String[] args) {
		CircularLinkedList lc=new CircularLinkedList();
		lc.add(10);
		lc.add(20);
		lc.add(30);
		lc.print();
		
		System.out.println("Adding After: ");
		lc.addAfter(20, 25);
		lc.addAfter(30,35);
		lc.print();
		
		System.out.println("Adding Before: ");
		lc.addBefore(20, 15);
		lc.addBefore(10, 5);
		lc.print();
		
		System.out.println("After Removing: ");
		lc.remove(20);
		lc.remove(5);
		lc.print();

	}

}
