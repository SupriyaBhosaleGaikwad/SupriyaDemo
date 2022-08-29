package com.test.main;

public class Sample {
	public static void main(String[] args) {
		String s="hcgvsuhdkiljcaskDNZ gjy";
		
		StringBuilder b= new StringBuilder();
		//b.append(s);
	//	b.reverse();
	//	System.out.println(b);
	boolean skip = false;
	char[] c=s.toCharArray();
	for(int i=0;i< s.length();i++)
	{
		for(int j=i-1;j>0;j--)
		{
			//System.out.println(i+"->"+j );
			
			if (c[i] == c[j]) {
				System.out.println(c[i]);
				skip = true;
				//continue;
				
			}
			 
		}
		if(!skip) {
			b.append(c[i]);
		}else {
			skip = false;
		}
		
		}
	System.out.println(b.toString());
}
}