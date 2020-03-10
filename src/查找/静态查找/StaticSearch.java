package 查找.静态查找;

import java.util.Random;

public class StaticSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[20];
		generateRandom(a);
		System.out.println("随机产生的"+a.length+"个数：");
		print(a);
		int elem = new Random().nextInt(100);//要查找的数
		/*顺序查找*/
		int i;//顺序查找的返回值
		if((i = seqSearch(a, elem)) != -1) {
			System.out.println("顺序查找成功! 存在" + elem + "这个数，为第" + (i+1) + "个数");
		}else {
			System.out.println("顺序查找失败! 不存在" + elem + "这个数");
		}
		
		/*二分查找*/
		selectSort(a);
		System.out.println("排序后的序列：");
		print(a);		
		if((i = biSeach(a, elem)) != -1) {
			System.out.println("二分查找成功! 存在" + elem + "这个数，为第" + (i+1) + "个数");
		}else {
			System.out.println("二分查找失败! 不存在" + elem + "这个数");
		} 
	}
	
	//产生0-99之间的随机数
	public static void generateRandom(int[] a){
		Random random=new Random();
		int num=a.length;
		for(int i=0;i<num;i++){
			a[i]=random.nextInt(100);
		}
	}	
	//输出数组中的值，20个数一行
	public static void print(int[] a){
		int num=a.length;
		for(int i=0;i<num;i++){
			System.out.print(a[i]+" ");
//			if((i+1)%20==0){
//				System.out.println("\n");
//			}
		}	
		System.out.println();
	}
	//直接选择排序，二分查找需要是有序的
	public static void selectSort(int[] a) {
		// TODO Auto-generated method stub
		int i, j, small;
		int temp;
		int n = a.length;

		for(i = 0; i < n - 1; i ++){
			small = i;//设第i个数据元素最小
			for(j = i + 1; j < n; j ++){//寻找最小的数据元素
				if(a[j] < a[small]) small = j;//记住最小元素的下标
			}
			if(small != i){//当最小元素的下标不为i时交换位置
				temp = a[i];
				a[i] = a[small];
				a[small] = temp;
			}
		}
	}
	
	//顺序查找（-1代表查找不成功，查找成功返回这个数的序号）
	public static int seqSearch(int[] a, int elem){

		return -1;
	}
	
	//二分查找的非递归算法（-1代表查找不成功，查找成功返回这个数的序号）
	public static int biSeach(int[] a, int elem){

   		return -1;
	}

}
