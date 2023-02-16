import java.io.File;

public class BorrarArchivo {
    public static void main(String[] args) {
        File arch=new File("arch1.txt");
        if(arch.exists()){
            if(arch.delete()){
                System.out.println(arch.getName()+" ha sido eliminado");
            }else{
                System.out.println("no se ha podido eliminar el archivo "+arch.getName());
            }
        }else {
            System.out.println(arch.getName()+" no existe");
        }
    }
}
