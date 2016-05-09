import java.util.Arrays;
class MergeSort 
{
	public static void main(String[] args) 
	{
		int []a={49,38,65,97,76,12,27,49,78,34,12,64,1,8};
		System.out.println("排序之前： "+Arrays.toString(a));
		mergeSort(a,0,a.length-1);
		System.out.println("排序之后： "+Arrays.toString(a));
	}
	private static void mergeSort(int[]a,int left,int right)
	{
		if(left<right)
		{
			int middle=(left+right)/2;
			//对左边进行递归
			mergeSort(a,left,middle);
			//对右边进行递归
			mergeSort(a,middle+1,right);
			//合并
			merge(a,left,middle,right);
		}
	}
	private static void merge(int[]a,int left,int middle,int right)
	{
		int[] tempArray=new int[a.length];
		int mid=middle+1;//序列右侧开始索引
		int third=left;//新数组索引
		int tmp=left;
		while(left<=middle&&mid<=right)
		{
			if(a[left]>=a[mid])
			{
				tempArray[third++]=a[mid++];
			}
			else
			{
				tempArray[third++]=a[left++];
			}
		}
		//复制剩余元素
		while(left<=middle)
		{
			tempArray[third++]=a[left++];
		}
		while(mid<=right)
		{
			tempArray[third++]=a[mid++];
		}
		//将中间数组复制回原数组
		while(tmp<=right)
		{
			a[tmp]=tempArray[tmp];
			tmp++;
		}
	}
}