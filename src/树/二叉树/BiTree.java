package 树.二叉树;

import java.util.*;

//二叉树
public class BiTree {
	//创建一个不带头结点的二叉树
	public BiTreeNode makeBiTree(){
		BiTreeNode a,b,c,d,e,f,g;
		g=new BiTreeNode(new Character('g'),null,null);
		d=new BiTreeNode(new Character('d'),null,g);
		b=new BiTreeNode(new Character('b'),d,null);
		e=new BiTreeNode(new Character('e'),null,null);
		f=new BiTreeNode(new Character('f'),null,null);
		c=new BiTreeNode(new Character('c'),e,f);
		a=new BiTreeNode(new Character('a'),b,c);
		
		return a;
	}	
	//前序遍历二叉树
	public void preOrder(BiTreeNode t){
		//添加代码
	}	
	//中序遍历二叉树
	public void inOrder(BiTreeNode t){
		//添加代码
	}	
	//后序遍历二叉树
	public void postOrder(BiTreeNode t){
		//添加代码
	}
	//求二叉树的叶子结点个数
	public int leafNumber(BiTreeNode t){
		//添加代码
		return 0;
	}
}
