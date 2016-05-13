/**
*@Description:<p>堆排序算法的实现，以大顶堆为例</p>
*@author：兰婷
*@time:2016/4/2
*
*/
class HeapSort 
{
	public static void heapAdjust(int[] arr,int start ,int end)
	{
		int temp=arr[start];
		for(int i=2*start+1;i<=end;i=i*2+1)//第一个索引为0，左右孩子的节点为2i+1与2i+2
		{
			if(i<end&&arr[i]<arr[i+1])//选出较大的节点
			{
				i++;
			}
			if(temp>=arr[i])//如果大于大的节点，说明符合，直接跳出
			{
				break;
			}
			arr[start]=arr[i];//将大的上移
			start=i;			//开始子节点的调整
		}
		arr[start]=temp;
	}
	public static void heapSort(int[] arr)
	{
		if(arr==null||arr.length==0)
			return;
		for(int i=arr.length/2;i>=0;i--) //从最后一排中间部分开始组建堆
		{
			heapAdjust(arr,i,arr.length-1);
		}
		for(int p=0;p<arr.length;p++)
			{
				System.out.println("paiwan1-----------"+arr[p]);
			}
		for(int i=arr.length-1;i>0;i--) //大顶堆已经构建好，然后调整为有序列
		{
			swap(arr,0,i);
			heapAdjust(arr,0,i-1);
		}
	}
	public static void swap(int[]arr ,int i,int j)//交换
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
