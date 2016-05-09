/**
*Ï£¶ûÅÅÐò
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
		int d=a.length;
		while(true)
		{
			d=d/2;
			for(int x=0;x<d;x++)
			{
				for(int i=x+d;i<a.length;i=i+d)
				{
					int j;
					int temp=a[i];
					for(j=i-d;j>=0&&a[j]>temp;j=j-d)
					{
						a[j+d]=a[j];
					}
					a[j+d]=temp;
				}
			}
			if(d==1)
				break;
		}
	}
}
