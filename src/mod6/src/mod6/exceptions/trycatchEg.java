package mod6.exceptions;

public class trycatchEg {
	public static void main(String args[])
	{
		try
		{
		int numbers[] = new int[3];
		numbers[4] = 1231; 
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
//		int i =10;
//		int j = 0;
//		System.out.println(i/j);
	}
}