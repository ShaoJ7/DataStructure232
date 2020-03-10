package 队列;

public interface Queue {
	//清空队列
	public void clear();
	//得到队列元素个数
	public int size();
	//判断队列是否为空
	public boolean isEmpty();
	//入队列
	public void enQueue(Object o);
	//出队列，并返回出队列的元素值
	public Object deQueue();
	//得到队头元素值
	public Object getFront();
	//输出队列
	public void output();

}
