package 栈.顺序栈;

import 栈.Stack;

public class SeqStack implements Stack{
	private Object[] elements;//数组，存放栈中各个数据元素
	private int top;//代表数组的下标
	private int maxSize;//代表顺序栈元素个数的最大值
	
	public SeqStack(int size){
		elements=new Object[size];
		maxSize=size;
		top=0;//假定top=0时为空栈
	}
	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		top=0;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return top;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==0;
	}
	@Override
	public void push(Object o) {
		// TODO Auto-generated method stub
		if(top==maxSize){
			System.out.println("栈已满，不能入栈！");
			return;
		}
		elements[top]=o;
		top++;
	}
	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			System.out.println("栈为空，不能出栈！");
			return null;
		}
		top--;
		return elements[top];
	}
	@Override
	public Object getTop() {
		// TODO Auto-generated method stub
		return elements[top-1];
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
//		//从栈底开始往栈顶输出
//		for(int i=0;i<top;i++){
//			System.out.print(elements[i]+"   ");
//		}
		//从栈顶开始往栈底输出
		for(int i=top-1;i>=0;i--){
			System.out.print(elements[i]+" ");
		}		
		
		System.out.println();
	}
	
	

}
