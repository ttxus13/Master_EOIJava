import java.io.File;

public class Crearcarpeta {
    public static void main(String[] args) {
        File arch= new File("carpeta2");
        System.out.println(arch.mkdirs());

    }
}
