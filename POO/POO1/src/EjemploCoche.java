import java.util.Scanner;

public class EjemploCoche {
    public static void main(String[] args) {
        //instanciar(crear)
        Coche micoche= new Coche();

        Scanner entrada = new Scanner(System.in);
        micoche.marca="Ford";
        micoche.modelo="Focus";
        micoche.color="Rojo";
        micoche.combustible="Diesel";
        micoche.cilindrada=120;
        System.out.println(micoche.consumo(600,38));




    }
}
