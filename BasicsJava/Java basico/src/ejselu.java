import java.util.Scanner;

public class ejselu {
    public static void main(String[] args) {

        //definir datos de usuario y contraseña
        String usuario = "Seluishernandez";
        String password = "Seluishernandez";
        String dato = "";


        while (dato.equals(usuario) == false) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce Usuario: ");
            dato = entrada.next();
            if (dato.equals(usuario) == false) {
                System.out.println("este usuario no existe");
            }
        }
        dato="";

        while (dato.equals(password) == false) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce Contraseña: ");
            dato = entrada.next();
            if (dato.equals(password) == false) {
                System.out.println("esta contraseña no existe");
            }
        }
    }
}