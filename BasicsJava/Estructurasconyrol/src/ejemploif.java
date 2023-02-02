import java.util.Scanner;

public class ejemploif {
    public static void main(String[] args) {
        String usuario = "abc";
        String password = "123";
        Scanner entrada = new Scanner(System.in);
        System.out.print("user: ");
        String us = entrada.next();
        System.out.print("pass: ");
        String ps = entrada.next();
        //comp rrobar login
        //sol1
        boolean login = usuario.equals(us) && ps.equals(password);
        System.out.println("log=" + login);
        //sol2
        String mensaje = usuario.equals(us) && ps.equals(password) ? "has accedio" : "credenciales erroneas";
        System.out.println("mensaje = " + mensaje);
        //variante
        if (usuario.equals(us) && ps.equals(password)) {
            System.out.println("has accedido");
        } else {
            System.out.println("cred erroneas");
            main(args);
            System.exit(0);
        }
        entrada.close();

        //if..ellse..if
        int a=2;
        int b=3;
        int c=2;
        if(a<b) {
            System.out.println("1");
        }else if(b<a){
            System.out.println("2");
        }else{
            System.out.println("3");
        }
        }


    }



