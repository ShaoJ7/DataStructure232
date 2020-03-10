package 排序;

public interface MySort {
	//插入排序
	public void insertSort(int[] a);//直接插入排序
	public void shellSort(int[] a, int[] step, int numOfStep);//希尔排序
	
	//交换排序
	public void bubbleSort(int[] a);//冒泡排序
	public void quickSort(int[] a, int low, int high);//快速排序
	
	//选择排序
	public void selectSort(int[] a);//直接选择排序
	public void heapSort(int[] a);//堆排序
	/*以下两个方法是堆排序所用的辅助方法*/
	public void createHeap(int[] a, int n, int h);
	public void initCreateHeap(int[] a);
}
