package 树.哈夫曼树;

public class HaffmanTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int n=5;//常量
		HaffmanTree hfmt = new HaffmanTree(n);
		int[] weight={2,6,8,1,3};
		HaffmanNode[] hfmn=new HaffmanNode[2*n-1];
		hfmt.haffman(weight, hfmn);
		HaffmanCode[] hfmc=new HaffmanCode[n];
		hfmt.haffmanCode(hfmn, hfmc);
		for(int i=0;i<hfmc.length;i++){
			System.out.print(hfmc[i].weight+"的编码:");
			for(int j=0;j<hfmc[i].bit.length;j++){
				System.out.print(hfmc[i].bit[j]);
			}
			System.out.println();
		}
	}

}
