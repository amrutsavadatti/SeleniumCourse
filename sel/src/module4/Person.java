package module4;

public class Person extends Soldier {
	public void id(){
		System.out.println(20);
	}
	public void rank(){
		System.out.println(30);  
	}
	public void name(){  //overriding concept
		String name= "amrut";
		System.out.println("soldier name is "+name); //overriding of function concept used.
	}

}
