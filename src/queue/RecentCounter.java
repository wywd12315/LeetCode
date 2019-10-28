package queue;
import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
	Queue<Integer> myqueue = new LinkedList<Integer>();
    public RecentCounter() {
        
    }
    
    public int ping(int t) {
    	while(!myqueue.isEmpty()&&myqueue.peek()<t-3000) {
    	myqueue.poll();
    	}
        myqueue.offer(t);
        return myqueue.size();
    }
}
