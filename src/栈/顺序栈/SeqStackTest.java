package 栈.顺序栈;

import 栈.Stack;

public class SeqStackTest {
	public static void main(String[] args) {
		Stack stack=new  SeqStack(100);
		for(int i=0;i<10;i++){
			stack.push(new Integer(i*i+1));
		}
		stack.display();
		System.out.println("出栈元素为："+stack.pop());
		stack.push(new Integer(123));
		stack.display();
		System.out.println("栈顶元素为："+stack.getTop());
		stack.display();
	}
}
