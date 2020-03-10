package 线性表.链表;

import 线性表.List;

public class LinkList implements List{
	private Node head;//头结点
	private int curSize;//链表的长度
	
	public LinkList() {//空链表，只有头结点
		// TODO Auto-generated constructor stub
		head=new Node();
		head.data=null;
		head.next=null;
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
		if(head.next==null){
			return true;
		}
		return false;
	}

	@Override
	public int search(Object o) {
		// TODO Auto-generated method stub
		Node temp=head;
		for(int i=1;i<=curSize;i++){
			temp=temp.next;
			if(temp.data.equals(o)){
				return i;
			}
		}
		return 0;
	}

	@Override
	public boolean insertAt(int i, Object o) {//i=4
		// TODO Auto-generated method stub
		if(i>curSize+1){
			return false;
		}
		//1.先生成一个新的结点t
		Node t=new Node();
		//2.把插入的值(o)放到新结点t的数据域
		t.data=o;
		//3.把插入位置的结点放到新结点的指针域
		Node p=getNode(i-1);		
		t.next=p.next;
		//4.把新结点t放到插入位置前面结点的指针域
		p.next=t;
		//5.长度加1
		curSize++;
		
		return true;
	}

	@Override
	public boolean insertAfter(Object p, Object e) {
		// TODO Auto-generated method stub
		int i=search(p);
		insertAt(i+1, e);
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		int i=search(o);
		removeAt(i);
		return false;
	}

	@Override
	public boolean removeAt(int i) {
		// TODO Auto-generated method stub
		//1.找到删除位置前面的结点对象引用
		Node p=getNode(i-1);
		//2.把删除位置后面的结点对象引用放到前面结点对象的指针域
		p.next=p.next.next;
		curSize--;
		return false;
	}

	@Override
	public Object get(int i) {
		// TODO Auto-generated method stub
		if(i<0||i>curSize){
			System.out.println("位置应该在1到"+curSize+"之间");
			return null;
		}
		Node p=head;
		for(int j=0;j<i;j++){
			p=p.next;			
		}
		return p.data;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		Node p=head;
		for(int i=0;i<curSize;i++){
			p=p.next;
			System.out.print(p.data+"   ");
		}
		System.out.println();
	}
	
	//得到第i个元素的结点引用
	public Node getNode(int i){
		Node p=head;//临时结点，用来指向要先显示的结点
		for(int j=0;j<i;j++){
			p=p.next;
		}
		return p;
	}

}
