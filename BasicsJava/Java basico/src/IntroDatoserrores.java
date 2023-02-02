import java.util.Scanner;

public class IntroDatoserrores {
    public static void main(String[] args) {
        //leer dato
        String dato;
        System.out.print("entero? ");
        Scanner entrada= new Scanner(System.in);
        dato=entrada.nextLine();
        System.out.println("dato = " + dato);

        int numdec= 0;


        //control error
        try{
            numdec= Integer.parseInt(dato);

        }catch(NumberFormatException e){
            System.out.println("e = " + e);
            System.out.println("tiene que ser un Numero entero");
            main(args);
            System.exit(0);
        }




        //dif sist
        System.out.println("numdec = " + numdec);
        System.out.println("binario 0b" + Integer.toBinaryString(numdec));
        System.out.println("octal 0" + Integer.toOctalString(numdec));
        System.out.println("hexa 0x" + Integer.toHexString(numdec));


    }
}
