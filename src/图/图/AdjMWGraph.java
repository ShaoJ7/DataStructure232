package 图.图;


import 线性表.顺序表.SeqList;

/*
 * 邻接矩阵图类的设计
 */
public class AdjMWGraph{
	static final int maxWeight = 10000;
	
	private SeqList vertices;//存储结点的顺序表
	private int[][] edge;//存储边的二维数组
	private int numOfEdges;//边的个数
	
	//构造函数，maxV为结点个数
	public AdjMWGraph(int maxV){
		vertices = new SeqList(maxV);
		edge = new int[maxV][maxV];
		for(int i = 0; i < maxV; i ++){
			for(int j = 0; j < maxV; j ++){
				if(i == j)
					edge[i][j] = 0;
				else
					edge[i][j] = maxWeight;	
			}
		}
		numOfEdges = 0;
	}
	
	//返回结点个数
	public int getNumOfVertices(){						
		return vertices.getSize();
	}
	
	//返回边的个数
	public int getNumOfEdges(){							
		return numOfEdges;
	} 
	
	//返回结点v的数据元素
	public Object getValue(int v) throws Exception{	
		return vertices.get(v+1);
	}
	
	//返回边<v1,v2>的权值
	public int getWeight(int v1, int v2) throws Exception{		
		if(v1 < 0 || v1 >= vertices.getSize() || v2 < 0 || v2 >= vertices.getSize()){
			throw new Exception("参数v1或v2越界出错！");
		}
		return edge[v1][v2];
	}
	//插入结点
	public void insertVertex(Object vertex) throws Exception{
		vertices.insertAt(vertices.getSize()+1, vertex);
	}
	//插入边<v1,v2>，权值为weight
	public void insertEdge(int v1, int v2, int weight) throws Exception{
		if(v1 < 0 || v1 >= vertices.getSize() || v2 < 0 || v2 >= vertices.getSize()){
			throw new Exception("参数v1或v2越界出错！");
		}			
		edge[v1][v2] = weight;//置边的权值
		numOfEdges ++;//边的个数加1
	}
	//删除边<v1,v2>
	public void deleteEdge(int v1, int v2) throws Exception{
		if(v1 < 0 || v1 > vertices.getSize() || v2 < 0 || v2 > vertices.getSize()){
			throw new Exception("参数v1或v2越界出错！");
		}
			
		if(edge[v1][v2] == maxWeight || v1 == v2){
			throw new Exception("该边不存在！");
		}
		edge[v1][v2] = maxWeight;//置边的权值为无穷大
		numOfEdges --;//边的个数减1
	}
	//取结点v的第一个邻接结点。若存在返回该结点的下标序号，否则返回-1
	public int getFirstNeighbor(int v) throws Exception{
		if(v < 0 || v >= vertices.getSize()){
			throw new Exception("参数v越界出错！");
		}
		for(int col = 0; col < vertices.getSize(); col ++){
			if(edge[v][col] > 0 && edge[v][col] < maxWeight){
				return col;
			}
		}
			
		return - 1;			
	}
	//取结点v1的邻接结点v2后的邻接结点
	//若存在返回该结点的下标序号，否则返回-1
	public int getNextNeighbor(int v1, int v2) throws Exception{
		if(v1 < 0 || v1 >= vertices.getSize() || v2 < 0 || v2 >= vertices.getSize()){
			throw new Exception("参数v1或v2越界出错！");
		}			
		for(int col = v2 + 1; col < vertices.getSize(); col ++){
			if(edge[v1][col] > 0 && edge[v1][col] < maxWeight){
				return col;
			}
		}
		return - 1;			
	}
	//连通图以v为初始结点序号、访问操作为vs的深度优先遍历
	//数组visited标记了相应结点是否已访问过，0表示未访问，1表示已访问	
	private void depthFirstSearch(int v, boolean[] visited, Visit vs) throws Exception{
		//添加代码
	}
	//非连通图的深度优先遍历
	public void depthFirstSearch(Visit vs) throws Exception{	
		//添加代码
						
	}
	//连通图以v为初始结点序号、访问操作为vs的广度优先遍历
	//数组visited标记了相应结点是否已访问过，0表示未访问，1表示已访问
	private void broadFirstSearch(int v, boolean[] visited, Visit vs) throws Exception{
		//添加代码
	}

	//非连通图的广度优先遍历
	public void broadFirstSearch(Visit vs) throws Exception{	
		//添加代码
	}
}