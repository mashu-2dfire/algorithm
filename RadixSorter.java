/* @description: 基数排序
 * @author:mashu
 * @date:4/21
 */
abstract class Sorter//排序的接口
{
    public abstract void sort(int[] aray);
}
class RadixSorter extends Sorter//基数排序
{
    private int radix;
    public RadixSorter()
    {
        radix=10;
    }
    @Override
    public void sort(int[] array)//排序
    {
        int [][]bucket= new int [radix][array.length];
        int distance=getDistance(array);
        int temp=1;
        int round=1;
        for(;round<=distance;round++)//对其每一位进行装桶，取出
        {
            int[] counter=new int[radix];//每一个桶有多少个数字，设置数组，下标为桶序号，值为个数
            int which;//判断往哪一位的桶存入
            for(int i=0;i<array.length;i++)//数组中的每一个都进行判断
            {
                which=(array[i]/temp)%radix;
                bucket[which][counter[which]]=array[i];//将值装入二维数组（桶）中
                counter[which]++;
            }
            int index=0;
            for(int i=0;i<radix;i++)//取出
            {
                if(counter[i]!=0)
                    for(int j=0;j<counter[i];j++)
                    {
                        array[index]=bucket[i][j];
                        index++;
                    }
                counter[i]=0;
            }
            temp=temp*radix;
        }
    }
    private int getDistance(int[] arr)//序列的最大值一共有几位
    {
        int max=getMax(arr);
        if(max==0)
            return 0;
        int d=1;
        while((max=max/radix)!=0)
        {
            d++;
        }
        return d;
    }
    private int getMax(int[] arr)//拿到数组序列的最大值
    {
        int max=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if (max<arr[i])
                max=arr[i];
        }
        return max;
    }
}
