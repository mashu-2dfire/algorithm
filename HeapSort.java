import java.util.Arrays;
class HeapSort 
{
	public static void main(String[] args) 
	{
		int[] arr={49,38,65,98,76,13,27,49,78,34,12,64};
		int arrLength=arr.length;
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arrLength;i++)
		{
			buildMaxHeap(arr,arrLength-1-i);
			swap(arr,0,arrLength-1-i); 
			System.out.println(Arrays.toString(arr));
		}
	}
	public static void buildMaxHeap(int[] data,int lastIndex)
	{
		//从lastIndex处节点（最后一个节点）的父节点开始
		for(int i=(lastIndex-1)/2;i>=0;i--)
		{
			//k保存正在判断的节点
			int k=i;
			//如果当前k节点的子节点存在
			while(k*2+1<=lastIndex)
			{
				//k节点的左子节点的索引
				int biggerIndex=2*k+1;
				//如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在
				if(biggerIndex<lastIndex)
				{
					if(data[biggerIndex]<data[biggerIndex+1])
					{
						//biggerIndex总是记录较大子节点的索引
						biggerIndex++;
					}
				}
				//如果k节点的值小于其较大的子节点的值
				if(data[k]<data[biggerIndex])
				{
					swap(data,k,biggerIndex);
					//将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右节点的值
					k=biggerIndex;
				}
				else
					break;
			}
		}
	}
	public static void swap(int[] arr,int a,int b)
	{
		int temp;
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}
