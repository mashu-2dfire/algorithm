/**
*Description:<p>实现快速算法的优化</p>
*author 兰婷
*/
class QuickSort2
{
	//一次划分
	public static int paratition(int[] arr,int left,int right) 
	{
		int pivotKey=arr[left];
		while(left<right)
		{
			while(left<right && arr[right]>=pivotKey)
				right--;
			arr[left]=arr[right];//把大的交换到左边
			while(left<right && arr[left]<=pivotKey)
				left++;
			arr[right]=arr[left];//小的交换到右边
		}
		arr[left]=pivotKey;//最后把pivot交换到中间
		return left;
	}
	public static void quickSort(int[] arr,int left,int right)
	{
		if(left>=right)
			return;
		int pivotPos=paratition(arr,left,right);
		quickSort(arr,left,pivotPos-1);
		quickSort(arr,pivotPos+1,right);
	}
	public static void sort(int[]arr)
	{
		if(arr==null||arr.length==0)
			return;
		quickSort(arr,0,arr.length-1);
	}
}
//主要思想：冒泡+二分查找+递归分治
