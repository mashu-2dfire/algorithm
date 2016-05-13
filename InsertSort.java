/**
*@Description:<p>简单插入排序算法实现</p>
*@author 兰婷
*/
public class InsertSort 
{
	public static void InsertSort(int[] arr) 
	{
		if(arr==null||arr.length=0)
			return;
		for(int i=1;i<arr.length;i++)
		{
			int j=i;
			int target=arr[i];//待插入的
			//后移
			while(j>0&&target<arr[j-1])
			{
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=target;
		}
	}
}
