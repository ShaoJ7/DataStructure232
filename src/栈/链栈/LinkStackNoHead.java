package 栈.链栈;

import 栈.Stack;

public class LinkStackNoHead implements Stack{
	private Node top;//指向栈顶结点
	private int curSize;

	public LinkStackNoHead(){
		curSize=0;
		top=null;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		top=null;
		curSize=0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return curSize;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==null;
	}

	@Override
	public void push(Object o) {
		// TODO Auto-generated method stub
		//1.生成新的结点
		Node p=new Node();
		//2.把插入的值放到新结点的数据域
		p.data=o;
		//3.把当前栈顶结点top放到新结点的指针域
		p.next=top;
		//4.新结点为新的栈顶结点，改变栈顶结点指向
		top=p;
		//5.长度加1
		curSize++;
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		Node p=top;
		top=top.next;
		curSize--;
		return p.data;
	}

	@Override
	public Object getTop() {
		// TODO Auto-generated method stub
		return top.data;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		Node p=top;
		while(p!=null){
			System.out.print(p.data+" ");
			p=p.next;
		}
		System.out.println();
	}

}
