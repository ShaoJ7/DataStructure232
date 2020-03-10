package 队列;


import 队列.链队列.LinkQueue;
import 队列.顺序队列.SeqLoopQueue;
import 队列.顺序队列.SeqQueue;

public class QueueTest {
	public static void main(String[] args) {
		//创建一个队列对象，多态的用法
//		Queue q=new LinkQueue();
//		Queue q=new SeqLoopQueue(100);
		Queue q=new SeqQueue(100);
		for(int i=0;i<10;i++){
			q.enQueue(i+1);
		}
		System.out.println("初始队列");
		q.output();
		for(int i=0;i<6;i++){
			q.deQueue();
		}
		System.out.println("删除后的队列");
		q.output();
		System.out.println("队列的长度："+q.size());
		System.out.println("重新插入后的队列");
		q.enQueue(-1000);
		q.output();
	}
}
