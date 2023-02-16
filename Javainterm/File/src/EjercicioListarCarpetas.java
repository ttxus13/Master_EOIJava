import java.io.File;

public class EjercicioListarCarpetas {
    static int nivel=0;
    public static void main(String[] args) {
        File arch= new File(".");
        recorre(arch);
    }
    public static void recorre(File ruta){
        nivel++;

        File[] contenido= ruta.listFiles();

        for(File nombre:contenido) {
            for(int i=0;i<nivel;i++){
                System.out.print("\t");
            }

            if (nombre.isDirectory()) {
                System.out.println(nombre.getName() + " es un directorio, contenidos:");
                //System.out.println("\t"+);
                recorre(nombre);//recorre(nombre.getName());
            } else {
                System.out.println(nombre.getName() + " tamaño(Bytes)--> " + nombre.length());
            }
        }
        nivel--;
    }
}
