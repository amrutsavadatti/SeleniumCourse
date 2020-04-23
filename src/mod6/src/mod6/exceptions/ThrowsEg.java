package mod6.exceptions;

public class ThrowsEg {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws InterruptedException  {
//		throw new Exception("Some description");
		clickLink();
	
	}
	
	public static void clickLink() throws InterruptedException{
		
		loadPage();
	}

	public static void loadPage() throws InterruptedException{
		
		
			//int i[]=new int[3];
			//i[3]=303;
		System.out.println("A");
		Thread.sleep(5000L);
		System.out.println("B");
		Thread.sleep(5000L);
		System.out.println("C");
		Thread.sleep(5000L);
		
		
	}

	
}
