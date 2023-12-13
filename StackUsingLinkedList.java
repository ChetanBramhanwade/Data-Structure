
public class StackUsingLinkedList {

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;

		}
	}

	static class Stack {
		static Node head = null;

		public static boolean isEmpty() {
			return head == null;
		}

		// push
		public void push(int data) {
			Node newNode = new Node(data);

			if (isEmpty()) {
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}

		// pop
		public int pop() {
			if (isEmpty()) {
				return -1;
			}
			int top = head.data;
			head = head.next;
			return top;
		}

		// peek
		public int peek() {
			if (isEmpty()) {
				return -1;
			}
			return head.data;
		}
		
		// print
		public void display() {
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.display();
		System.out.println("pop is: "+s.pop());
		s.display();
		System.out.println("Peek is : " + s.peek());
	}

}
