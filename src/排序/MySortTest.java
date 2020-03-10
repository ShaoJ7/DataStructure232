package 排序;

import java.util.Random;

public class MySortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[20];
		generateRandom(a);
		System.out.println("随机产生的"+a.length+"个数");
		print(a);
		MySort mySort=new MySortImpl();
		System.out.println("排序后的数");
		//以下是插入排序
		mySort.insertSort(a);//直接插入排序
		
//		int[] step={6,3,1};//希尔排序
//		int numOfStep=3;//希尔排序
//		mySort.shellSort(a, step, numOfStep);//希尔排序
		
		//以下是交换排序
//		mySort.bubbleSort(a);//冒泡排序
//		mySort.quickSort(a, 0, a.length-1);//快速排序
		
		//以下是选择排序
//		mySort.selectSort(a);//直接选择排序
//		mySort.initCreateHeap(a);//堆排序（初始化）
//		mySort.heapSort(a);//堆排序
		
		
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
			if((i+1)%20==0){
				System.out.println("\n");
			}
		}
		
	}
}
