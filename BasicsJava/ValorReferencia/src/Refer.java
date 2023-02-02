public class Refer {
    public static void main(String[] args) {
        int[] arg= {10,20,30,40};
        for (int i = 0; i < arg.length; i++) {
            System.out.println("arg "+i+ " = " + arg[i]);
        }
        miMet(arg);
        for (int i = 0; i < arg.length; i++) {
            System.out.println("arg "+i+ " = " + arg[i]);
        }


    }

    public static void miMet(int[] argum){
        for (int i = 0; i < argum.length; i++) {
            argum[i] +=5;
        }
    }
}
