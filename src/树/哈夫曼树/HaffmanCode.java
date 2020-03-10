package 树.哈夫曼树;
//哈夫曼编码类
public class HaffmanCode{							
	int[] bit;//数组
	int start;//编码的起始下标
	int weight;//字符的权值
	
	public	HaffmanCode(int n){
		bit = new int[n];
		start = n - 1;
	}
}
