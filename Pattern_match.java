//package easy_problems;
//
//public class Pattern_match {
//	
//	/*
//	 * Complete the function below.
//	 */
//
//	    static int wordpattern(String pattern, String input) {
//	        
//	        
//	    //Pattern generation
//	        
//	    String output = pattern;
//	    String temp;
//	    while (true) {
//	        temp = output.replaceAll("(.+)\\1", "$1");
//	        if (temp.equals(output)) break;
//	        output = temp;
//	    }
//	    //System.out.println(output);
//	        
//	    int[] pattern_array = new int[pattern.length()];
//	        
//	    char[] output_split = output.toCharArray();
//	    char[] pattern_split = pattern.toCharArray();
//	        
//	    for(int i=0;i<output.length();i++)
//	        {
//	        for(int j=0;j<pattern.length();j++)
//	            {
//	            if(output_split[i] == pattern_split[i])
//	                {
//	                    pattern_array[j] = i;
//	            }
//	        }
//	         
//	    }
//	        
//	    //Input generation
//	        
//	    String output_2 = input;
//	    String temp_input;
//	    while (true) {
//	        temp_input = output_2.replaceAll("(.+)\\1", "$1");
//	        if (temp_input.equals(output_2)) break;
//	        output_2 = temp_input;
//	    }
//	    //System.out.println(output);
//	        
//	    int[] input_array = new int[input.length()];
//	        
//	    char[] output_split_2 = output_2.toCharArray();
//	    char[] input_split_2 = input.toCharArray();
//	        
//	        
//	        for(int k=0;k<output_2.length();k++)
//	        {
//	        for(int l=0;l<input.length();l++)
//	            {
//	            if(output_split_2[k] == input_split_2[k])
//	                {
//	                    input_array[l] = k;
//	            }
//	        }
//	         
//	    }
//	        
//	        if(Arrays.equals(pattern_array, input_array))
//	            {
//	                return 1;
//	        }
//	        
//	        return 0;
//	        
//	    
//	        
//
//
//	    }
//
//
//
//}
