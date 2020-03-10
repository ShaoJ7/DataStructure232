package 树.二叉树;

//二叉树的结点
public class BiTreeNode {
	private BiTreeNode leftChild;//左孩子对象引用
	private BiTreeNode rightChild;//右孩子对象引用
	public Object data;//数据元素	
	
	//构造一个非空结点
	BiTreeNode(Object item, BiTreeNode left, BiTreeNode right){
		data = item;
		leftChild = left;
		rightChild = right;
	}
	
	public BiTreeNode getLeft(){//得到左孩子
		return leftChild;
	}
	
	public BiTreeNode getRight(){//得到右孩子
		return rightChild;
	}
	
	public Object getData(){//得到数据元素
		return data;
	}

}
