package easy_problems;

public class String_to_Integer {
	
	public static void main(String args[])
	{
	    //get_numeric("-123456");
		
		System.out.println(get_numeric("-123456"));
		System.out.println(get_numeric("+123456"));
		System.out.println(get_numeric("A123456"));
		System.out.println(get_numeric("123 456"));
		System.out.println(get_numeric("1234VBN56"));
		
	}
	
	public static long get_numeric(String num)
	{
		if(!num.isEmpty())
		{
	    char[] temp = num.toCharArray();
		int length = temp.length;
		long result = 0;
		int multiplier = 1;
		int index = 0;
		boolean isPositive = true;
		int sign = (int)temp[0];
		
		if(sign == 45 || sign == 43)
		{
			if(sign == 45)
			{
			isPositive = false;
			}
			index = 1;
		}
		
		while(index < length)
		{
			int single_int_ascii = (int)temp[index];
			if(single_int_ascii >= 48 && single_int_ascii<=57)
			{
				result = result * 10;
				result = result + Character.getNumericValue((int)temp[index]);
				index++;
			}
			else
			{
				return 0;
			}
		}
		
		if(!isPositive)
		{
			result = -result;
		}
		
		return result;
		}
		return 0;
		
	}

}
