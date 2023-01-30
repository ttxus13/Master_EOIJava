import java.util.Arrays;
import java.util.Scanner;

public class EjLogin2 {
    public static void main(String[] args) {
        /*
        definir datos validos user password
        solicitar user pasword
        solo metodos string y logicos
        true si coinciden
String complet=nom+" "+ap1+" "+ap2;
        complet=complet.replace("-"," - ");
        String[] matriz= complet.split(" ");
        for(int i=0;i < matriz.length ; i++){
            System.out.println(matriz[i]=matriz[i].substring(0,1).toUpperCase()+matriz[i].substring(1).toLowerCase());

        }
         */
        String[] user = {"Ttxus13", "opsYBERETiNf", "CtOnKErenswA", "ROpONALeBeDi", "RIGeOmAtRYnC", "IPTeRYPERiVE"};
        String[] pass = {"P3n3", "6YCqduAQzHoN", "CN5mqFtbaZQnPaNgs", "StrionUz61RnssH2A", "LnFLsW6UvNXBQ", "KendE48xmw6kPxVhfK"};
        String[] animac ={"|","\\","-","/"};
        Scanner entrada = new Scanner(System.in);
        String dato = "";
        int pos = -1;

        while (pos == -1) {
            //System.out.println(user[7]);
            System.out.print("Usuario: ");
            dato = entrada.nextLine();
            for (int i = 0; i < user.length; i++) {
                if (dato.equals(user[i])) {
                    pos = i;
                }

                //System.out.println(matriz[i]=matriz[i].substring(0,1).toUpperCase()+matriz[i].substring(1).toLowerCase());

            }
            if(pos == -1) {
                System.out.println("El usuario no existe");
            }
        }
        while(dato.equals(pass[pos])==false){
            System.out.print("Password: ");
            dato = entrada.nextLine();

                if (dato.equals(pass[pos])==false) {
                    System.out.println("Contrase\u00f1a incorrecta");;
                }



        }
        System.out.println("BIENVENIDO");

        do{
            for (int i=0;i<=3;i++){
                System.out.print("\b"+animac[i]);
            }
            dato =entrada.nextLine();
        } while(dato.equals("")==false);
    }
}

        /*METODO VIEJO
        while (dato.equals(user)==false) {
            System.out.print("Usuario: ");
            dato = entrada.nextLine();
            if (dato.equals(user) == false) {
                System.out.println("El usuario no existe");
            }
        }
        dato="";
        while (dato.equals(pass)==false) {
            System.out.print("Password: ");
            dato = entrada.nextLine();
            if (dato.equals(pass) == false) {
                System.out.println("La contrase\u00f1a es incorrecta");
            }
        }
*/

