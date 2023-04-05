package codingStudy;

import java.util.StringJoiner;

public class StringJoinerStudy {

	public static void main(String[] args)
	{
		//A,B,C
		//P:Q
		//A,B,C,P:Q
		//[A,B,C,P:Q]
		
	StringJoiner s = new StringJoiner(",","(",")");
	
	s.add("A").add("B").add("C").add("D");
	System.out.println(s);
	
	StringJoiner s1= new StringJoiner("*","{","}");
	s1.add("P").add("Q");
	System.out.println(s1);
	
	s.merge(s1);
	System.out.println(s);
	}

}
