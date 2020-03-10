package 查找.动态查找;

import 图.图.Visit;

//二叉树查找测试类
public class BiSearchTreeTest{
	public static void main(String[] args){
		BiSearchTree searchTree = new BiSearchTree();
		int[] a = {4, 5, 7, 2, 1, 9, 8, 11, 3};
		int n = 9;
		Visit vs = new Visit();
		BiTreeNode temp = new BiTreeNode(a[0]);
		
		for(int i = 1; i < n; i ++){
			 searchTree.insert(temp, a[i]);
		}
		searchTree.setRoot(temp);
				
		System.out.println("构造完成后：");
		System.out.print("中序遍历序列为：");
		searchTree.inOrder(vs);
		System.out.print("\n前序遍历序列为：");
		searchTree.preOrder(vs);
		System.out.println();
		
		System.out.print("查找的数据元素为：");
		System.out.println(searchTree.find(9).getData());
		
		searchTree.delete(searchTree.getRoot(),4);
			 searchTree.insert(temp, 1);
		
		System.out.println("删除结点4后：");
		System.out.print("中序遍历序列为：");
		searchTree.inOrder(vs);
		System.out.print("\n前序遍历序列为：");
		searchTree.preOrder(vs);
		System.out.println();
	}
}