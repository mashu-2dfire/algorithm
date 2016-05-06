/* Name it "Dichotomy.java" 二分插入排序
 * Compile it by running "javac Dichotomy.java"
 * Run it by typing "java Dichotomy"
 */

class Dichotomy {
	public static void main(String args[])
	{
		int[] arr={49,38,65,97,176,213,227,49,78,34,12,164,11,18,1};
		System.out.println("before:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		sort(arr);
		System.out.println("after:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	private static void sort(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int temp=arr[i];
			int left=0;
			int right=i-1;
			int mid=0;
			while(left<=right)
			{
				mid=(left+right)/2;
				if(temp<arr[mid])
				{
					right=mid-1;
				}
				else
				{
					left=mid+1;
				}
			}
			//right---left之间是arr[i]应该插入的位置
			for(int j=i-1;j>=left;j--)
			{
				arr[j+1]=arr[j];
			}
			if(left!=i)
			{
				arr[left]=temp;
			}
		}
	}
}


