package module4;

//Inheritance
// we cant extend to more than one class
public class wildLife extends animal{

    String furColor;
    String carnivores;

    public void eats(){
        System.out.println( name+ " ate its food ");
    }

    public void sleeps(){
        System.out.println(name+" slept ");
    }


}
