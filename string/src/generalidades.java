import java.util.Arrays;

public class generalidades {
    public static void main(String[] args) {
        String nombre = new String("eduardo");
        System.out.println("nombre = " + nombre);
        String apellido= "perez";
        System.out.println("apellido = " + apellido);

        //escapar
        String conComillas="pedro \"el kynki\"";
        System.out.println("conComillas = " + conComillas);
        //concat
        System.out.println("nombre completo="+nombre+" "+apellido);
        String nombreCompleto= nombre+" "+apellido;
        System.out.println("nombreCompleto = " + nombreCompleto);
        //comparar
        String uno="Pepe Perez";
        String dos="Pepe Perez";
        System.out.println("uno = " + uno);
        System.out.println("dos = " + dos);
        System.out.println(uno == dos);
        System.out.println("uno=2? "+(uno.equals(dos)));
    }

}
