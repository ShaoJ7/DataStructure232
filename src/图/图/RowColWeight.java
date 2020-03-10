package 图.图;

/*
 * 辅助类：设计创建图所需的数据及方法
 */
public class RowColWeight{
	public int row;//行下标
	public int col;//列下标
	public int weight;//权
	
	public RowColWeight(int r, int c, int w){
		row = r;
		col = c;
		weight = w;
	}
	/*
	 * v为结点数据元素的集合，n为结点个数；
	 * rc为边的集合，e为边的个数
	 */
	public static void createGraph(AdjMWGraph g, Object[] v, int n, RowColWeight[] rc, int e) throws Exception{
		for(int i = 0; i < n; i ++)
			g.insertVertex(v[i]);
		for(int k = 0; k < e; k ++)
			g.insertEdge(rc[k].row, rc[k].col, rc[k].weight);	
	}
}