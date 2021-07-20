package collection.arrayList;

//ArrayList를 통한 Stack 구현(First In First Out)
import java.util.ArrayList;

class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	private int len;

	public void push(String data) {
		arrayQueue.add(data);
	}

	public String pop() {
		len = arrayQueue.size();
		if (len == 0) {
			return "Data가 없습니다.";
		} else {
			return arrayQueue.remove(0); // 앞에서 부터 remove
		}
	}

	public void showAllQueue() {
		len = arrayQueue.size(); // Stack 전체 크기 확인
		if (len != 0) {
			for (String str : arrayQueue) {
				System.out.println(str);
			}
		}
	}
}

public class QueueTest {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.push("A");
		queue.push("B");
		queue.push("C");
		queue.showAllQueue();

		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
	}
}
