package collection.arrayList;

import java.util.ArrayList;

public class QueueTest { //Queue = First In First Out
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}

}

class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len = arrayQueue.size();
		if(len==0) {
			System.out.println("ºó Å¥");
			return null;
		}
		return (arrayQueue.remove(0));
	}
}
