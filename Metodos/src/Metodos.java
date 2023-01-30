import javax.swing.*;

public class Metodos {
    public static void main(String[] args) {
        bienvenida();

        //System.out.println(suma(5,15));
        imprimeNombre("Robert Polson",159);

        System.out.println(suma(3,4,5,6,7,7));

        System.out.println("el factorial de 5 es" + factorial(5));
        String DNI=datoVEmergente("introduce el DNI");
        System.out.println("su letra es "+ letraDNI(Integer.parseInt(DNI)));
        System.out.println(DNI);

    }
    public static void imprimeNombre(String nombre,int edad){
        System.out.println("se llama "+nombre+" tiene "+edad+" años");
    }
    public static int factorial(int num){
        int res=1;
        for (int i = 1; i <= num ; i++) {
            res*=i;
        }
        return res;
    }
    public static char letraDNI(int dni){//calcula la letra del dni
        String letras= "TRWAGMYFPDXBNJZSQVHLCKE";
        return (letras.charAt(dni%23));

        }

    public static String datoVEmergente(String mess){//pide dato en ventana
        return JOptionPane.showInputDialog(mess);
    }

    public static int suma(int a, int b){
        return a+b;
    }
    public static int suma(int ... num){
        int resultado=0;
        for (int i = 0; i < num.length; i++) {
            resultado+=num[i];

        }
        return resultado;
    }
    public static void bienvenida(){
        System.out.println("WELCOME TO JAVAISION");
    }


}
