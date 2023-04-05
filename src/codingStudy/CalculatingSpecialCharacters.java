package codingStudy;

public class CalculatingSpecialCharacters {

	public static void main(String[] args) 
	{
//		String s= "cloudtech!@#$%^&*";
//		
//		String str=s.replaceAll("[a-z]", "");
//		System.out.println(str);
//		System.out.println(str.length());
//		System.out.println("================");
		
//		String s1 = "sangmeshwar!@#$%^&*shivankar9902415411";
//		
//		String str1=s1.replaceAll("[a-z!@##$%^&*]", "");
//		
//		System.out.println(str1);
//		System.out.println(str1.length());
//		System.out.println("================");
//		
//        String s2="sangmeshwarsuryakantshivankar";
////		
//		String str3=s2.replaceAll("suryakant", "");
//		System.out.println(str3);
//		System.out.println(str3.length());
//		System.out.println("================");
		long l=12345678912345l;
		System.out.println(l);
        int count=0;
        while(l>0)
        {
	     count++;
	
        l=l/10;
        }
        
        System.out.println("count is "+count);
    }

}
