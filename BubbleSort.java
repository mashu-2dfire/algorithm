public class BubbleSort
{
	public static void bubbleSort(int[] arr)
	{
		if(arr==null||arr.length==0)
			return;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=arr.length-1;j>i;j--)
			{
				if(arr[j-1]>arr[j])
					swap(arr,j-1,j);
			}
		}
	}
	public static void swap(int[]arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}