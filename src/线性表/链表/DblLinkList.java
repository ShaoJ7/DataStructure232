package 线性表.链表;

import 线性表.List;

public class DblLinkList implements List{
	private DblNode head;//头结点
	private int curSize;//双向链表的长度
	
	public DblLinkList(){
		head=new DblNode();
		head.data=null;
		head.next=null;
		head.pre=null;
		curSize=0;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return curSize;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(curSize==0){
			return true;
		}
		return false;
	}

	@Override
	public int search(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean insertAt(int i, Object o) {
		// TODO Auto-generated method stub
		if(i<0||i>curSize+1){
			return false;
		}
		//1.生成新的结点，并且把插入的值放到新结点的数据域
		DblNode q=new DblNode();
		q.data=o;
		//2.找到插入位置前面结点的对象引用
		DblNode p=getNode(i-1);
		if(p.next==null){//判断插入位置是不是在最后一个结点
			q.next=p.next;
			p.next=q;
			q.pre=p;
		}
		else{			
			//3.改变指针域			
			q.next=p.next;			
			p.next=q;
			q.next.pre=q;
			q.pre=p;
		}
		
		//4.长度加1
		curSize++;
		
		return false;
	}

	@Override
	public boolean insertAfter(Object p, Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAt(int i) {
		// TODO Auto-generated method stub
		DblNode p=getNode(i-1);
		p.next=p.next.next;
		p.next.pre=p;
		curSize--;
		return false;
	}

	@Override
	public Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		DblNode p=head;
		for(int i=0;i<curSize;i++){
			p=p.next;
			System.out.print(p.data+"   ");
		}
		System.out.println();
	}
	//得到第i个元素的结点引用
	public DblNode getNode(int i){
		DblNode p=head;//临时结点，用来指向要先显示的结点
		for(int j=0;j<i;j++){
			p=p.next;
		}
		return p;
	}
	
	

}
