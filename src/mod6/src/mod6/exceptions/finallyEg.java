package mod6.exceptions;

public class finallyEg {
	final int z=100;
	

	public static void main(String[] args) {
		
		try{
			// file pointer, check path - exception
			
			
			// connecting db - success
			// query - pull  - exception
			System.out.println("A");
			// int i=2/0;
			System.out.println("B");
			
			
		}catch(Exception e){
			System.out.println("Some exception" + e.getStackTrace());
		}finally{
			// close - if established
			System.out.println("Finally");
		}
		
	}

}
