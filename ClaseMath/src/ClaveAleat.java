import java.util.Arrays;
import java.util.Random;

public class ClaveAleat {
    public static void main(String[] args) {
        Random objRand= new Random();
        String mayus="ABCDEFG";
        String minus=mayus.toLowerCase();
        String simbolos="@#$%€&/";

        String clave="";
        clave=clave+mayus.charAt(objRand.nextInt(7))+minus.charAt(objRand.nextInt(7))+simbolos.charAt(objRand.nextInt(7))+objRand.nextInt(10);
        System.out.println("clave = " + clave);

        int n =14;
        System.out.println(Integer.toString(165498));


    }
}
