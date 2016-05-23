class  HouseRobber
{
	public static void main(String[] args) 
	{
		int arr[]= {15,15,76,14,45,80,10};
		int a=new HouseRobber().houseRobber(arr,0,arr.length-1);
		System.out.println(a);
	}
	public int houseRobber(int arr[],int left,int right)
	{
		if(right<0)
			return 0;
		else if(right==0)
			return arr[0];
		else
			return 
				((houseRobber(arr,left,right-2)+arr[right])>houseRobber(arr,left,right-1))?
				(houseRobber(arr,left,right-2)+arr[right]):houseRobber(arr,left,right-1);
	}
}
