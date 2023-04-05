package codingStudy;

public class LowerCaseToUppercase {

	public static void main(String[] args) 
	{
		//changes are done in code
		String s="This is Sangmeshwar This is Sangmeshwar";
		
		int mid=s.length()/2;
		
		String lowerCase="";
		String upperCase="";
		
		for(int i=0;i<s.length();i++)
		{
			if(i<mid)
			{
				lowerCase=lowerCase+Character.toLowerCase(s.charAt(i));
				
		}
			else
			{
				upperCase=upperCase+Character.toUpperCase(s.charAt(i));
				}
			
			
			}
System.out.println(upperCase+lowerCase);
	}

}
