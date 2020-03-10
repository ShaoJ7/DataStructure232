package 队列.顺序队列;

import 队列.Queue;

public class SeqQueue implements Queue{
	private int front,rear;//队头和队尾下标,front代表队头下标，rear代表队尾的下一个元素下标
	private Object[] elements;//数组存放顺序队列
	private int maxSize;
	
	public SeqQueue(int size) {
		// TODO Auto-generated constructor stub
		maxSize=size;
		elements=new Object[size];
		front=rear=0;//队头队尾都是0
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		front=rear=0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return rear-front;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return front==rear;
	}

	@Override
	public void enQueue(Object o) {
		// TODO Auto-generated method stub
		if(rear==maxSize){
			System.out.println("顺序队列已满，不能入队列");
			return;
		}
		//1.把要入队列的值插入到队尾下标中
		elements[rear]=o;
		//2.改变队尾下标，加1
		rear++;		
	}

	@Override
	public Object deQueue() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			System.out.println("顺序队列已空，不能出队列");
			return null;
		}
		//1.先把要出队列的元素保存下来
		Object o=elements[front];
		//2.队头下标加1
		front++;
		return o;
	}

	@Override
	public Object getFront() {
		// TODO Auto-generated method stub
		return elements[front];
	}
	@Override
	public void output() {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=front;i<rear;i++){
			System.out.print(elements[i]+"  ");
			count++;
			if(count%10==0){
				System.out.println();
			}
		}
		System.out.println();
	}

}
