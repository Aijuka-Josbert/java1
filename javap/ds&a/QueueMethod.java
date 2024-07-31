import java.util.Queue;
import java.util.LinkedList;

public class QueueMethod{
	
	public static void main(String[] args) {
		
		// *****************************************************
		
		// Queue = FIFO data structure. First-In First-Out
		//		   A collection designed for holding elements prior to processing
		//		   Linear data structure
		
		//         enqueue = offer()
		//         dequeue = poll()
		
		// Where are queues useful?
		
		// 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
		// 2. Printer Queue (Print jobs should be completed in order)
		// 3. Used in LinkedLists, PriorityQueues, Breadth-first search
		
		// *****************************************************
		
		Queue<String> queue = new LinkedList<String>();//we use linkedlist since we cnt use queue itself.
		
		queue.offer("Karen");
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Harold");
		
		System.out.println(queue.isEmpty());
		//System.out.println(queue.size());
		//System.out.println(queue.contains("Harold"));
		
		//System.out.println(queue.peek());
		// queue.poll();
		//queue.poll();to dequeue an elemeemtn
		//queue.poll();
		//queue.poll();
					
		System.out.println(queue);
		
	}
}