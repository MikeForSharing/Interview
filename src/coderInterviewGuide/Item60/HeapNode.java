package src.coderInterviewGuide.Item60;

public class HeapNode {
	public int value;   //节点的值
	public int arrNum;  //来自哪个数组
	public int index;   //来自数组中第几个元素
	
	public HeapNode(int value,int arrNum, int index) {
		this.value = value;
		this.arrNum = arrNum;
		this.index = index;
	}
}
