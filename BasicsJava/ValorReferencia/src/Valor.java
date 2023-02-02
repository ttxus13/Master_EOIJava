public class Valor {
    public static void main(String[] args) {
        int ar=484561;
        System.out.println("ar = " + ar);
        int res= miMetodo(ar);
        System.out.println("res = " + res+ "ar "+ ar);




    }

    public static int miMetodo(int arg){
        System.out.println("arg = " + arg);
        arg=54;
        System.out.println("arg = " + arg);
        return arg;
    }



}
