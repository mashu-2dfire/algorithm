/**
*@Descroption：<p>简单选择排序的算法实现</p>
*@author 兰婷
*/
public class SelectSort 
{
	public static void selectSort(int[] arr) 
	{
		if(arr==null||arr.length=0)
		{
			return;
		}
		for(int i=0;i<arr.length-1;i++)
		{
			int minIndex=i;				//记录最初的minIndex的位置
			for(int j=i+1,j<arr.length-1;j++)
			{
				if(arr[minIndex]>arr[j])
					minIndex=j;
			}
			if(minIndex!=i)				//如果不是，说明最小值不是索引为i的项，则交换
				swap(arr,i,minIndex);
		}
	}
	public static void swap(int[]arr,int i,int j)
	{
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
//一次选择一个数字和其他所有的比较，将最小的放入当前位置