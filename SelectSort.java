/**
*@Descroption��<p>��ѡ��������㷨ʵ��</p>
*@author ����
*/
public class SelectSort 
{
	public static void selectSort(int[] arr) 
	{
		if(arr==null||arr.length=0)
		{
			return;
		}
		for(int i=0;i<arr.length-1;i++)
		{
			int minIndex=i;				//��¼�����minIndex��λ��
			for(int j=i+1,j<arr.length-1;j++)
			{
				if(arr[minIndex]>arr[j])
					minIndex=j;
			}
			if(minIndex!=i)				//������ǣ�˵����Сֵ��������Ϊi����򽻻�
				swap(arr,i,minIndex);
		}
	}
	public static void swap(int[]arr,int i,int j)
	{
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
//һ��ѡ��һ�����ֺ��������еıȽϣ�����С�ķ��뵱ǰλ��