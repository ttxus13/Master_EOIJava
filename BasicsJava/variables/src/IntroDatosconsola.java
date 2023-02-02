import javax.swing.*;
import java.util.Scanner;

public class IntroDatosconsola {
    public static void main(String[] args) {
        //leer dato
        String dato;
        System.out.print("entero? ");
        Scanner entrada= new Scanner(System.in);
        dato=entrada.nextLine();
        System.out.println("dato = " + dato);

        int numdec= Integer.parseInt(dato);



        System.out.println("numdec = " + numdec);
        System.out.println("binario 0b" + Integer.toBinaryString(numdec));
        System.out.println("octal 0" + Integer.toOctalString(numdec));
        System.out.println("hexa 0x" + Integer.toHexString(numdec));


    }
}
