class QuickSortTest 
{
	public static void main(String[] args) 
	{
		int[]arr={5,3,8,4,6};
		QuickSort2.sort(arr,0,4);
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
