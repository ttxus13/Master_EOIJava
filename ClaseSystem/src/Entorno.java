import javax.imageio.IIOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class Entorno {
    public static void main(String[] args) {

        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.dir"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("java.version"));
        //
        // todas las variables
        Properties propiedades = System.getProperties();
        propiedades.list(System.out);

        //cargar variables de sistema desde un archivo
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            propiedades.load(archivo);
            System.setProperties(propiedades);
            propiedades.list(System.out);

        } catch (FileNotFoundException e){
            if(debug) System.out.println("e = " + e);

        } catch (IOException e){
            //todo
        }

        //cargar variables de entorno SO
        Map<String, String> varEntorno = System.getenv();
        System.out.println("varEntorno = " + varEntorno);
        System.out.println("System.getenv(\"USERNAME\") = " + System.getenv("USERNAME"));
        System.out.println("System.getenv(\"javahomeAME\") = " + System.getenv("JAVA_HOME"));

        System.out.println("varEntorno.keySet() = " + varEntorno.keySet());
        for (String clave : varEntorno.keySet()) {
            System.out.println("clave = " + clave + "--> valor" + System.getenv(clave));

        }


    }
}
