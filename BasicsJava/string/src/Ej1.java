import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        String dato;
        System.out.print("nombre archivo: ");
        Scanner entrada= new Scanner(System.in);
        dato=entrada.nextLine();

        //metodo 1
        /*
        String[] datot = dato.split("\\.");
        System.out.println("nombre  " + datot[0]);
        System.out.println("extension ." + datot[1]);
        */
        //metodo2

        int posp=dato.lastIndexOf('.');
        //String[] part = new String[0];
        //part[0]=dato.substring(0,posp);
        //part[1]=dato.substring(posp);
        System.out.println("nom" + dato.substring(0,posp));
        System.out.println("ext " + dato.substring(posp));

        


    }
}
