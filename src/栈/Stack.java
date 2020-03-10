package 栈;

public interface Stack {
	//清空栈
	public void clear();
	//得到栈的大小
	public int size();
	//判断站是否为空
	public boolean isEmpty();
	//进栈
	public void push(Object o);
	//出栈
	public Object pop();
	//得到栈顶元素
	public Object getTop();
	//输出栈
	public void display();
}
