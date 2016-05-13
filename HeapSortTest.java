class  HeapSortTest
{
	public static void main(String[] args) 
	{
		int[] arr={39,49,10,9,51,7};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("kaishi-----------"+arr[i]);
		}
		HeapSort.heapSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("jieshu-----------"+arr[i]);
		}
	}
}
