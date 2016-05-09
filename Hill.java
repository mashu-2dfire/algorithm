/**
*希尔排序
*
*/
class Hill 
{
	public static void main(String[] args) 
	{
		int[] arr={49,38,65,97,13,27,49,78,34,12,64,1};
		System.out.println("before:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		hill(arr);
		System.out.println("after:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void hill(int[] a)
	{
		int d=a.length;//初始化d的值
		while(true)
		{
			d=d/2;
			for(int x=0;x<d;x++)//划分循环次数
			{
				//每一系列都进行：插入排序
				for(int i=x+d;i<a.length;i=i+d)//从第二项开始，到结束
				{
					int j;
					int temp=a[i];
					for(j=i-d;j>=0&&a[j]>temp;j=j-d)//符合条件后做调整
					{
						a[j+d]=a[j];
					}
					a[j+d]=temp;
				}
			}
			if(d==1)//当d为1时跳出循环
				break;
		}
	}
}
