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
        try{if(dato.charAt(0)!='0'){
            numdec= Integer.parseInt(dato);
            //decimal
        } else if(dato.charAt(1)=='b'){
            dato=dato.substring(2);
            numdec= Integer.parseInt(dato,2);

            }else if(dato.charAt(1)=='x'){
            dato=dato.substring(2);
            numdec= Integer.parseInt(dato,16);

        }else{
            dato=dato.substring(2);
            numdec= Integer.parseInt(dato,8);

        }



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
