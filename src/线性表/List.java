package 线性表;

public interface List {
	//得到线性表的长度	 
	public int getSize();
	//判断线性表是否为空	
	public boolean isEmpty();
	 //查找元素	  
	public int search(Object o);
	//在i(从1开始)位置插入一个元素
	public boolean insertAt(int i, Object o);
	//在某个元素后插入一个元素
	public boolean insertAfter(Object p, Object e);
	//根据元素的内容移除元素，删除元素o
	public boolean remove(Object o);
	//移除第i个（从1开始）元素
	public boolean removeAt(int i);
	//得到第i个（从1开始）元素
	public Object get(int i);
	//输出线性表中的元素
	public void display();
}
