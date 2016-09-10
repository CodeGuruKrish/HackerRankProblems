package easy_problems;

import java.util.HashSet;

/*
Sample Input

3
abcdde
baccd
eeabg
Sample Output

2
Explanation

Only "a" and "b" are the two kinds of gem-elements, since these are the only characters that occur in every rock
   
 */

public class Gemstones {
	
	public static void main(String[] args)
	{
		String[] test_Input = new String[10];
		test_Input[0] = "abcde";
		test_Input[1] = "bcde";
	    test_Input[2] = "de";
	    
	    check_gems(test_Input);
	}
	
	public static void check_gems(String[] array_Gems)
	{
        HashSet<?>[] hset = new HashSet<?>[array_Gems.length];
        
        for(int i=0;i<array_Gems.length;i++)
        {
        	char[] Stringify = array_Gems[i].toCharArray();
        	
        	
        	for(int j=0;j<Stringify.length;j++)
        	{
        	((HashSet<String>)hset[i]).add(Stringify[j]+"");
        	}
        }
        
        
        
		
	}

}
