
public class TestQueue {

	public static void main(String[] args) {
		Queue q=new Queue();
		System.out.println("Enqueue: ");
		q.peek(90);
		q.peek(20);
		q.peek(10);
		q.peek(12);
		q.print();
		
		System.out.println("Dequeue: ");
		q.pop();
		q.print();
		

	}

}
