package easy_problems;

public class Jesse_Cookies {
	
	public static void main(String args[])
	{
	
		int[] main_array = new int[7];
		main_array[0] = 1;
		main_array[1] = 2;
		main_array[3] = 3;
		main_array[4] = 9;
		main_array[5] = 10;
		main_array[6] = 12;
		
		int array_size = main_array.length;
		int sweet_goal = 7;
		 
		int final_operation_count = get_operations(main_array, sweet_goal);
		System.out.println("Final operations requried: "+ final_operation_count);
	}
	
	
	public static int get_operations(int[] main_Array, int goals)
	{
		
		int[] temp_Array = new int[main_Array.length];
		int operation_Counter = 0;
		
		for(int i=0;i < main_Array.length;i++)
        {
			//System.out.println("Scanning " + i +" element : " + main_Array[i]);
             if(main_Array[i] < goals)
                 {
                    temp_Array[i] = 1*main_Array[i] + 2*main_Array[i+1];
                    i = i + 1;
                    operation_Counter++;
             }
             else
                 {
                     temp_Array[i] = main_Array[i];
             }
             
    }
		
		for(int i =0;i<temp_Array.length;i++)
		{
			System.out.println("Altered array : "+ temp_Array[i]);
		}
		
		return operation_Counter;
		
	}
	

}
