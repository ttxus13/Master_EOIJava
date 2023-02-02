import java.util.Scanner;

public class EjLogin {
    public static void main(String[] args) {
        /*
        definir datos validos user password
        solicitar user pasword
        solo metodos string y logicos
        true si coinciden

         */
        String user="Ttxus13";
        String pass="P3n3";
        Scanner entrada= new Scanner(System.in);
        String dato="";
       // Scanner entrada= new Scanner(System.String);
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

/*

            if()


        }


*/

    }
}
