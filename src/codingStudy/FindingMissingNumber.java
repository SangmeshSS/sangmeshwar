package codingStudy;

public class FindingMissingNumber {

	public static void main(String[] args) 
	{
		int ar[]= {1,2,3,4,5,6,7,9,10,11,12,13,14,15,16,17,18,19,20};
		//missing number is 7
		
		int sum=(20*21)/2;
		
		int actualsum=0;
		
		for(int i=0;i<ar.length;i++)
		{
			actualsum=actualsum+ar[i];
		}
		System.out.println(sum);
		System.out.println(actualsum);
		System.out.println("missing number is "+(sum-actualsum));
		
		int ar1[]= {2,4,6,8,10,12,14,18,20};
		//missing number is 16
		
		int sum1=(10*11);
		
		int actualsum1=0;
		
		for(int i=0;i<ar1.length;i++)
		{
			actualsum1=actualsum1+ar1[i];
		}
		
		
		System.out.println("missing no is "+(sum1-actualsum1));
		

	}

}
