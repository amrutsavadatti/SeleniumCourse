package Module3;

public class Static_non_static {
    static int pid=2094;
    int nh_pid=6578;
    public static void main(String[] args) {
        int lid=6543;
        sfun1();
       // nsfun1();
    }
    public static void sfun1(){
       //System.out.println(" nhpid="+nh_pid);
        System.out.println("pid="+pid);

    }
    public void nsfun1(){
        System.out.println(" nhpid="+nh_pid);
        System.out.println("pid="+pid);

    }
}

