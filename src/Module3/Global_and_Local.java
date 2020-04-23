package Module3;

public class Global_and_Local {
    static int pid=1234;
    String name = "john";

    public static void main(String[] args) {
        int l_id=5432;
        System.out.println("PId Global ="+pid);
        System.out.println("Lid Global ="+l_id);
        function1();
    }


    public static void function1(){
        int l_id2=5655;
        System.out.println("pid global="+pid);
        //System.out.println("lid local="+l_id);
        System.out.println("Lid local="+l_id2);

    }





}
