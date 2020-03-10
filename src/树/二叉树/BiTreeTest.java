package 树.二叉树;

public class BiTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiTree tree=new BiTree();//建立一个BiTree类的对象tree
		BiTreeNode treeNode;//定义一个BiTreeNode类的对象treeNode
		treeNode=tree.makeBiTree();/*调用BiTree类中的makeBiTree方法，赋值给treeNode*/
		System.out.print("前序遍历二叉树的结果是：");
		tree.preOrder(treeNode);//调用BiTree类的前序遍历方法preOrder
		System.out.print("\n中序遍历二叉树的结果是：");
		tree.inOrder(treeNode);//调用BiTree类的中序遍历方法inOrder
		System.out.print("\n后序遍历二叉树的结果是：");
		tree.postOrder(treeNode);//调用BiTree类的后序遍历方法postOrder
		System.out.print("\n二叉树的叶子结点个数是："+tree.leafNumber(treeNode));
	}

}
