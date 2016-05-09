import java.util.Arrays;
class MergeSort 
{
	public static void main(String[] args) 
	{
		int []a={49,38,65,97,76,12,27,49,78,34,12,64,1,8};
		System.out.println("����֮ǰ�� "+Arrays.toString(a));
		mergeSort(a,0,a.length-1);
		System.out.println("����֮�� "+Arrays.toString(a));
	}
	private static void mergeSort(int[]a,int left,int right)
	{
		if(left<right)
		{
			int middle=(left+right)/2;
			//����߽��еݹ�
			mergeSort(a,left,middle);
			//���ұ߽��еݹ�
			mergeSort(a,middle+1,right);
			//�ϲ�
			merge(a,left,middle,right);
		}
	}
	private static void merge(int[]a,int left,int middle,int right)
	{
		int[] tempArray=new int[a.length];
		int mid=middle+1;//�����Ҳ࿪ʼ����
		int third=left;//����������
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
		//����ʣ��Ԫ��
		while(left<=middle)
		{
			tempArray[third++]=a[left++];
		}
		while(mid<=right)
		{
			tempArray[third++]=a[mid++];
		}
		//���м����鸴�ƻ�ԭ����
		while(tmp<=right)
		{
			a[tmp]=tempArray[tmp];
			tmp++;
		}
	}
}