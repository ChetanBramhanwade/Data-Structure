
public class QueueUsingLinkedList {

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	static class Queue {
		static Node head = null;
		static Node tail = null;

		public static boolean isEmpty() {
			return head == null && tail == null;
		}

		public void add(int data) {
			Node newNode = new Node(data);
			if (head == null) {
				head = tail = newNode;
				return;
			}
			tail.next = newNode;
			tail = newNode;
		}
		
		public int remove() {
			if(isEmpty()) {
				System.out.println("Empty Queue");
				return -1;
			}
			int front = head.data;
			if(tail == head) {
				tail = head = null;
			}else {
				head = head.next;
			}
			return front;
		}
		
		public int peek() {
			if(isEmpty()) {
				System.out.println("Empty queue");
				return -1; 
			}
			return head.data;
		}
		
		public void display() {
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}

		}
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.display();
		System.out.println("remove: "+q.remove());
		System.out.println("peek: "+q.peek());
		
	}
}
