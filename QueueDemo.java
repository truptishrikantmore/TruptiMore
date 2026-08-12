package Day5;

public class QueueDemo {

	int arr[];
	int front, rear, size;

	public QueueDemo(int size) {
		this.size = size;
		arr = new int[size];
		front = 0;
		rear = -1;	
	}
	
	void enqueue() {
		if(rear == -1) {
			System.out.println("Queue is full");		
		}
		else {
			rear++;
			int element = arr[rear];
			arr[rear] = element;
		}
 	}
	
	void dequeue() {
		if(front == -1) {
			System.out.println("Queue is empty");
		}
		else {
			int value = arr[front];
			front++;
		}
	}
	
	int peek() {
		int value = arr[front];
		return value;
	}
	
	void display() {
		System.out.println("Queue is :: " + arr);
	}
	
	public static void main(String[] args) {
		QueueDemo queueDemo = new QueueDemo(5);
		queueDemo.enqueue();
		queueDemo.dequeue();
		queueDemo.display();			
	}
}
