import java.io.File;

public class Listarcontenido {
    public static void main(String[] args) {
        File arch= new File(".");

        //solo nombres
//        String[] contenido= arch.list();
//        for(String nombre:contenido){
//            System.out.println(nombre);
//        }

                File[] contenido= arch.listFiles();
        for(File nombre:contenido){
            System.out.println(nombre.getName()+" "+ nombre.isDirectory());
        }




    }
}
