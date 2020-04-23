package module4;

public class animal {
    String name;
    static int legs=4;

    public static void main(String[] args) {
        animal a = new animal();
        a.name = "cat";

        animal b = new animal();
        b.name="dog";

        wildLife c = new wildLife();
        c.name = "tiger";
        c.carnivores="Y";
        c.furColor="orange";


        System.out.println(legs);
        System.out.println(c.carnivores);
        System.out.println(c.furColor);

        c.eats();
        c.sleeps();

        wildLife d = new wildLife();


        System.out.println(legs);
        d.name = "cheetah";
        d.carnivores="Y";
        d.furColor="yellow";
        System.out.println(d.carnivores);
        System.out.println(d.furColor);

        d.eats();
        d.sleeps();



    }
}
