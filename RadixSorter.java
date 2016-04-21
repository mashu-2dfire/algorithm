/* @description: 基数排序
 * @author:mashu
 * @date:4/21
 */
abstract class Sorter
{
    public abstract void sort(int[] aray);
}
class RadixSorter extends Sorter
{
    private int radix;
    public RadixSorter()
    {
        radix=10;
    }
    @Override
    public void sort(int[] array)
    {
        int [][]bucket= new int [radix][array.length];
        int distance=getDistance(array);
        int temp=1;
        int round=1;
        for(;round<=distance;round++)
        {
            int[] counter=new int[radix];
            int which;
            for(int i=0;i<array.length;i++)
            {
                which=(array[i]/temp)%radix;
                bucket[which][counter[which]]=array[i];
                counter[which]++;
            }
            int index=0;
            for(int i=0;i<radix;i++)
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
    private int getDistance(int[] arr)
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
    private int getMax(int[] arr)
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
