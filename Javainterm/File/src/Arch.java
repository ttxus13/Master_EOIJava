import java.io.File;
import java.io.IOException;

public class Arch {
    public static void main(String[] args) {
        try {
            File arch1 = new File("arch1.txt");
            //System.out.println(arch1.createNewFile());
//            if(arch1.createNewFile()){
//                System.out.println("arch creado");
//            }else{
//                System.out.println("el arch ya existe");
//            }
            if(!arch1.exists()){
                arch1.createNewFile();
                System.out.println("arch creado");
            }else{
                System.out.println("el arch ya existe");
            }
        }catch (IOException e){
            System.out.println("error al crear el archivo");
            System.out.println(e.toString());
        }
        //System.out.println(arch1.canExecute());


    }
}
