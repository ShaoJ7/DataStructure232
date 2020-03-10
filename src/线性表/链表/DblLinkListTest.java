package 线性表.链表;

public class DblLinkListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DblLinkList dll=new DblLinkList();
		for(int i=0;i<10;i++){
			dll.insertAt(i+1, new Integer(i*i+5));
		}
		dll.display();
//		System.out.println(dll.getNode(8).data);
		dll.removeAt(2);
		dll.display();
	}

}
