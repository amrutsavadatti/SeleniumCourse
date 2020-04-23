package Module3;

public class Car {//object class

    static int wheels=4;

    String name;
    String company;
    int seats;
    String type;

    String interior;
    String color;
    String suspension;

    // Constructors
    public Car (){
        System.out.println("inside constructor");
    }

    public Car(String a, int b, String c){  //constructor overloading
        company=a;
        seats = b;
        type = c;
    }
    public Car(String company, int seats, String type, String interior, String color, String suspension){
        this.company=company;
        this.seats = seats;
        this.type = type;
        this.interior = interior;
        this.color = color;
        this.suspension = suspension;
    }
    // Constructors end

    public static void main(String[] args) {
        Car jacksCar = new Car();
        jacksCar.name ="jack";
        jacksCar.company = "BMW";
        jacksCar.seats = 2;
        jacksCar.type ="FastBack";

        System.out.println(jacksCar.company);

        jacksCar.start();
        jacksCar.AllInfo();

        Car jillsCar = new Car();
        jillsCar.name="jill";
        jillsCar.company="kia";
        jillsCar.seats=4;
        jillsCar.type="hatchBack";


        jillsCar.start();
        jillsCar.AllInfo();


        Car laurasCar = new Car("lamborghini",2," Sports car");
        Car BlaurasCar=new Car("RollsRoyce",5,"luxury car","leather","black Beige","soft");
        laurasCar.AllInfo();
        BlaurasCar.AllInfo();



    }
    public void start(){
        System.out.println(company + "started");
    }

    public void AllInfo(){
        System.out.println(name+"'s Car");
        System.out.println("company "+company);
        System.out.println("type "+type);
        System.out.println("seats "+seats);
        System.out.println("interior "+interior);
        System.out.println("color "+color);
        System.out.println("suspension "+suspension);
        System.out.println();
    }
}
