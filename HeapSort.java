import java.util.Arrays;
class HeapSort 
{
	public static void main(String[] args) 
	{
		int[] arr={49,38,65,98,76,13,27,49,78,34,12,64};
		int arrLength=arr.length;
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arrLength;i++)
		{
			buildMaxHeap(arr,arrLength-1-i);
			swap(arr,0,arrLength-1-i); 
			System.out.println(Arrays.toString(arr));
		}
	}
	public static void buildMaxHeap(int[] data,int lastIndex)
	{
		//��lastIndex���ڵ㣨���һ���ڵ㣩�ĸ��ڵ㿪ʼ
		for(int i=(lastIndex-1)/2;i>=0;i--)
		{
			//k���������жϵĽڵ�
			int k=i;
			//�����ǰk�ڵ���ӽڵ����
			while(k*2+1<=lastIndex)
			{
				//k�ڵ�����ӽڵ������
				int biggerIndex=2*k+1;
				//���biggerIndexС��lastIndex����biggerIndex+1�����k�ڵ�����ӽڵ����
				if(biggerIndex<lastIndex)
				{
					if(data[biggerIndex]<data[biggerIndex+1])
					{
						//biggerIndex���Ǽ�¼�ϴ��ӽڵ������
						biggerIndex++;
					}
				}
				//���k�ڵ��ֵС����ϴ���ӽڵ��ֵ
				if(data[k]<data[biggerIndex])
				{
					swap(data,k,biggerIndex);
					//��biggerIndex����k����ʼwhileѭ������һ��ѭ�������±�֤k�ڵ��ֵ���������ҽڵ��ֵ
					k=biggerIndex;
				}
				else
					break;
			}
		}
	}
	public static void swap(int[] arr,int a,int b)
	{
		int temp;
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}
