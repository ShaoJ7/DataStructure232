package 队列.链队列;

import 队列.Queue;

public class LinkQueue implements Queue{
	private Node front,rear;//队头和队尾结点
	private int count;//队列元素个数

	public LinkQueue() {
		// TODO Auto-generated constructor stub
		count=0;
		front=rear=null;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		front=rear=null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return count==0;
	}

	@Override
	public void enQueue(Object o) {
		// TODO Auto-generated method stub
		//判断
		if(count==0){
			//1.先生成一个新的结点
			//添加代码
			//2.把插入的值放到数据域
			//添加代码
			//3.新结点的指针域为空
			//添加代码
			//4.队头和队尾都指向第一个结点
			//添加代码
		}else{
			//1.先生成一个新的结点
			//添加代码
			//2.把插入的值放到数据域
			//添加代码
			//3.新结点的指针域为空
			//添加代码
			//4.把新的结点p连接到当前队尾元素的指针域
			//添加代码
			//5.新结点p就变为队尾结点
			//添加代码	
		}
		//6.队列元素个数加1
		//添加代码
	}

	@Override
	public Object deQueue() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			return null;
		}else{
			//1.保存当前队头结点		
			//添加代码
			//2.当前队头结点的下一个元素就是新的队头结点
			//添加代码
			//3.队列元素个数减1
			//添加代码
			//4.把出队列结点的元素值返回
			//修改代码
			return null;
		}
	}

	@Override
	public Object getFront() {
		// TODO Auto-generated method stub
		return front.data;
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		//添加代码
	}

}
