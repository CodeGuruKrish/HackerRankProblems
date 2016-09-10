package easy_problems;

import java.util.*;

public class SayWhatYouSee {
	
	public static void main(String args[])
	{
		String[] sample_text = new String[1];
		//sample_text[0] = "12345";
		sample_text[0] = "1112";
		
		
		char[] char_iterate = null;
		for(int i=0;i<sample_text.length;i++)
		{
			char_iterate = sample_text[i].toCharArray();
			spell_what_you_see(char_iterate);
			
		}
	}
	
	public static void spell_what_you_see(char[] sample)
	{
		int counter = 1;
		Map<Integer,List<Integer>> hmap = new HashMap();
		for(int i=0;i<sample.length-1;i++)
		{
			
			if(sample[i] == sample[i+1])
			{
				counter++;
				System.out.println("Repeating");
				System.out.println("Multi repeat " + sample[i] + " Count: "+ counter);
				//i = i + 1;
			}
			else if((i == sample.length-1) && (sample[i+1] != sample[i+2]))
			{
				counter = 1;
				System.out.println("No repeat Case 1  " + sample[i] + " Count: "+ counter);
			}
			else
			{
				counter = 1;
				System.out.println("No repeat Case 2  " + sample[i] + " Count: "+ counter);
			}
			
			
		}
	}

}
