import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("nota?");
        String nota = entrada.next();
        switch (nota) {
            case "10":
                System.out.println("suspens");
                break;
            case "9":
                System.out.println("suspens");
                break;
            case "8":

            case "7":
                System.out.println("not");
                break;
            default:
                System.out.println("susp");
                break;
        }
        String camiseta="roja";
        String serig="";
        switch (camiseta){
            case "verde":
                serig="Azul";
                break;
            case "azul":
                serig="amarillo";
                break;
            default:
                serig="negro";
        }
        System.out.println(serig);
    }


}

