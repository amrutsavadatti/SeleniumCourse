package module4;

public class InstituteDatabase {

    public static void main(String[] args) {
        school sc = new school();
        sc.name="SFIT";
        sc.max_studs=2000;
        sc.principal_name="principal";

        sc.T = new teacher();
        sc.T.name="sainath";
        sc.T.age=35;
        sc.T.hrs_worked=0;
        sc.T.sal=5000;

        System.out.println(sc.T.name);
        System.out.println(sc.name);



    }


}
