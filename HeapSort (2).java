/**
*@Description:<p>�������㷨��ʵ�֣��Դ󶥶�Ϊ��</p>
*@author������
*@time:2016/4/2
*
*/
class HeapSort 
{
	public static void heapAdjust(int[] arr,int start ,int end)
	{
		int temp=arr[start];
		for(int i=2*start+1;i<=end;i=i*2+1)//��һ������Ϊ0�����Һ��ӵĽڵ�Ϊ2i+1��2i+2
		{
			if(i<end&&arr[i]<arr[i+1])//ѡ���ϴ�Ľڵ�
			{
				i++;
			}
			if(temp>=arr[i])//������ڴ�Ľڵ㣬˵�����ϣ�ֱ������
			{
				break;
			}
			arr[start]=arr[i];//���������
			start=i;			//��ʼ�ӽڵ�ĵ���
		}
		arr[start]=temp;
	}
	public static void heapSort(int[] arr)
	{
		if(arr==null||arr.length==0)
			return;
		for(int i=arr.length/2;i>=0;i--) //�����һ���м䲿�ֿ�ʼ�齨��
		{
			heapAdjust(arr,i,arr.length-1);
		}
		for(int p=0;p<arr.length;p++)
			{
				System.out.println("paiwan1-----------"+arr[p]);
			}
		for(int i=arr.length-1;i>0;i--) //�󶥶��Ѿ������ã�Ȼ�����Ϊ������
		{
			swap(arr,0,i);
			heapAdjust(arr,0,i-1);
		}
	}
	public static void swap(int[]arr ,int i,int j)//����
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
