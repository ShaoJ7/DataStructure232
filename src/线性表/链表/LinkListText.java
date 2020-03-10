package 线性表.链表;

public class LinkListText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList linkList=new LinkList();//创建一个空链表
		for(int i=1;i<=10;i++){
			linkList.insertAt(i, new Integer(i));
		}
		linkList.display();
//		linkList.removeAt(4);
//		linkList.display();
		linkList.insertAfter(5, 1000);
		linkList.display();
	}

}
