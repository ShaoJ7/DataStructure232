package 线性表.顺序表;

public class SeqListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeqList sl=new SeqList(100);//建立了一个最大长度为100的空表
		for(int i=0;i<10;i++){
			sl.insertAt(i+1, new Integer(i+1));
		}
		sl.display();
		System.out.println(sl.search(new Integer(6)));
		if(sl.insertAfter(6, 100)){
			sl.display();
		}else{
			System.out.println("找不到要插入的元素值");
		}
		if(sl.removeAt(10)){
			sl.display();
		}else{
			System.out.println("删除位置不合法");
		}
		if(sl.remove(5)){
			sl.display();
		}else{
			System.out.println("找不到要删除的元素值");
		}
		
		System.out.println(sl.get(3));
	}

}
