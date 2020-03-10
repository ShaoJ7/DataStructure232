package 线性表.顺序表;

import 线性表.List;

public class SeqList implements List {
    private Object[] elements;//数组，存放各个数据元素
    private int maxSize,curSize;//maxSize代表所能存放的最大量，curSize代表当前个数

    public SeqList(int size) {
        super();
        this.maxSize = size;
        this.curSize=0;
        elements=new Object[size];
//		System.out.println("length:"+elements.length);
    }

    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        return curSize;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return curSize==0;
    }

    @Override
    public int search(Object o) {
        // TODO Auto-generated method stub
        for(int i=0;i<curSize;i++){
            if(elements[i].equals(o)){
                return i+1;
            }
        }
        return 0;
    }

    @Override
    public boolean insertAt(int i, Object o) {
        // TODO Auto-generated method stub
		/*
		 * 1.把插入位置后面的元素依次后移
		   2.把要插入的值放到插入位置
		   3.长度加1
		 */
        if(i<1||i>(curSize+1)){
            System.out.println("插入位置不合法");
        }
        if(curSize==maxSize){
            System.out.println("当前已得到最大容量，不能插入");
            return false;
        }
        //1.把插入位置后面的元素依次后移
        for(int j=curSize-1;j>=i-1;j--){
            elements[j+1]=elements[j];
        }
        //2.把要插入的值放到插入位置
        elements[i-1]=o;
        //3.长度加1
        curSize++;
        return true;
    }

    @Override
    public boolean insertAfter(Object p, Object e) {
        // TODO Auto-generated method stub
        int k=search(p);
        if(k==0){
            return false;
        }
        insertAt(k+1, e);

        return true;
    }

    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        int k=search(o);
        if(k==0){
            return false;
        }
        removeAt(k);
        return true;
    }

    @Override
    public boolean removeAt(int i) {
        // TODO Auto-generated method stub
        if(i<=0||i>curSize){
            return false;
        }
        //1.把插入位置后面的元素依次前移
        for(int j=i-1;j<curSize-1;j++){
            elements[j]=elements[j+1];
        }
        //2.个数减1
        curSize--;
        return true;
    }

    @Override
    public Object get(int i) {
        // TODO Auto-generated method stub
        return elements[i-1];
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        for(int i=0;i<curSize;i++){
            System.out.print(elements[i]+"  ");
        }
        System.out.println();//换行
    }

}
