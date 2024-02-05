package assignments;

public class TwoSum {
	
	public static int[] twoSum(int num[],int target)
	{
		int result[]=new int[2];
		for(int i=0;i<num.length-1;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]+num[j]==target)
				{
					result[0]=i;
					result[1]=j;
					return result;
				}
			}
		}
		return new int[0];
	}
	public static void main(String[] args)
	{
		int num[]= {2,7,11,19};
		int target=30;
		
		TwoSum ans=new TwoSum();
		int result[]=ans.twoSum(num, target);
		
		if(result.length==2)
		{
			System.out.println("target :"+result[0] +" and "+ result[1]);
		}
		else
		{
			System.out.println("the target not found in the array");
		}
	}

}

