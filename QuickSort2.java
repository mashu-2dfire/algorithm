/**
*Description:<p>ʵ�ֿ����㷨���Ż�</p>
*author ����
*/
class QuickSort2
{
	//һ�λ���
	public static int paratition(int[] arr,int left,int right) 
	{
		int pivotKey=arr[left];
		while(left<right)
		{
			while(left<right && arr[right]>=pivotKey)
				right--;
			arr[left]=arr[right];//�Ѵ�Ľ��������
			while(left<right && arr[left]<=pivotKey)
				left++;
			arr[right]=arr[left];//С�Ľ������ұ�
		}
		arr[left]=pivotKey;//����pivot�������м�
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
//��Ҫ˼�룺ð��+���ֲ���+�ݹ����
