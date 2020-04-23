package Module3;

public class Function_overloading {

	public static void main(String[] args) {
		
		sumAll(3,4,6);
		sumAll("hello",34,61);
		

	}
	public static void sumAll(int a, int b, int c){
		int sum=a+b+c;
		System.out.println(sum);
	}
	public static void sumAll(String a,int b, int c){
		System.out.println(a);
		int difference=b+c;
		System.out.println(difference);
	}
}
