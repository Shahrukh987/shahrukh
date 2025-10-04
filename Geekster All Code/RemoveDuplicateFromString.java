package com.spring;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		String str = "Shahrukh Ansari";
		str=str.replace(" ", "");
		String result="";
		
		for(int i=0;i<str.length();i++)
		{
			boolean isDuplicate=false;
			
			for(int j=0;j<result.length();j++)
			{
				
				
				if(Character.toLowerCase(str.charAt(i))==Character.toLowerCase(str.charAt(j)))
				{
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate)
			{
				result+=str.charAt(i);
			}
		}
		System.out.print(result);

	}

}
