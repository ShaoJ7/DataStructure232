package 栈.链栈;

import 栈.Stack;

public class LinkStack implements Stack{
	private Node top;//链栈的头结点
	private int curSize;//栈的大小

	public LinkStack(){//生成一个空的链栈
		curSize=0;
		top=new Node();
		top.data=null;
		top.next=null;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		top.next=null;
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
		return top.next==null;
	}

	@Override
	public void push(Object o) {
		// TODO Auto-generated method stub
		//1.生成新的结点
		Node p=new Node();
		//2.把插入的值放到新结点的数据域
		p.data=o;
		//3.把当前栈顶结点top.next 放到新结点的指针域
		p.next=top.next;
		//4.新结点为新的栈顶结点，把新结点放到头结点的指针域
		top.next=p;
		//5.长度加1
		curSize++;
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		Node temp=top.next;
		top.next=temp.next;
		curSize--;
		return temp.data;
	}

	@Override
	public Object getTop() {
		// TODO Auto-generated method stub
		return top.next.data;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		Node p=top.next;
		while(p!=null){
			System.out.print(p.data+" ");
			p=p.next;
		}
		System.out.println();
	}

}
