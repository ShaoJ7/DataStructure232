package 栈.链栈;

import 栈.Stack;

public class LinkStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack=new  LinkStackNoHead();//多态
		for(int i=0;i<10;i++){
			stack.push(new Integer(i*i+1));
		}
		stack.display();
		System.out.println("出栈元素为："+stack.pop());
		System.out.println("栈的长度为："+stack.size());
		stack.push(new Integer(123));
		stack.display();
		System.out.println("栈顶元素为："+stack.getTop());
		stack.display();
		System.out.println("栈的长度为："+stack.size());
	}

}
