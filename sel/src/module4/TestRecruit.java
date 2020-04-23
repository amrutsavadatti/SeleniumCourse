package module4;

public class TestRecruit {

	public static void main(String[] args) {
		Lieutenant l= new Lieutenant();
		l.id();
		l.rank();
		// c.security();  
		//function of commander class exclusively thus cant be used in lieutenant class
		
		Commander c= new Commander();
		c.id();
		c.rank();
		c.security();
		
		//interface can point to child classes too...useful in selenium code
		Recruit r= new Commander();
		r.id();
		
		Recruit r1= new Lieutenant();
		r1.id();
		
		//Soldier s= new Soldier(); //since soldier is abstract class it cannot be called in main
		
		Person p= new Person();   //however child class of soldier can call all functions od interface and abstract class in main
		p.name();

	}

}
  