import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArch {
    public static void main(String[] args) {
        try{
            FileWriter escrib=new FileWriter("arch1.txt");
            escrib.write("escribirblavlbalab2\r");
            escrib.close();
        }catch (IOException e){
            System.out.println("error");
            System.out.println(e.toString());
        }

    }
}
