import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioCSV {
    static ArrayList<Alumno> listaleida=new ArrayList<>();
    public static void main(String[] args) {
        //crear array alumnos y guardar contenido en archivo
/*
        ArrayList<Alumno> listaalumnos = new ArrayList<>();
        Alumno uno = new Alumno("pepe", "perez");
        Alumno dos = new Alumno("ger", "sft");
        Alumno tres = new Alumno("ase", "las");
        Alumno cuatro = new Alumno("reo", "dos");
        listaalumnos.add(uno);
        listaalumnos.add(dos);
        listaalumnos.add(tres);
        listaalumnos.add(cuatro);

        escribirarchivo(listaalumnos);*/
        leerarchivo("listaalumnos.csv");
        for (Alumno alumno:listaleida){
            System.out.println("alumno = " + alumno);
        }




    }

    public static void escribirarchivo(ArrayList<Alumno> lista) {
        //escribir en un txt el contenido de la lista
        try{
            FileWriter escribe = new FileWriter("listaalumnos.csv");
            for (Alumno alumno : lista) {
                escribe.write(alumno.toString()+"\n");
            }
            escribe.close();
        }catch (IOException e){
            System.out.println("error");
        }


    }
    public static void leerarchivo(String ruta){
        try {
            File arch = new File(ruta);
            Scanner leer = new Scanner(arch);
            //int nl=1;

            while(leer.hasNextLine()){
                String linea= leer.nextLine();
                //System.out.println(linea);
                //System.out.println(linea.indexOf(' '));
                String nom=linea.substring(0,linea.indexOf(' '));
                //System.out.println("nom = " + nom);
                String ap=linea.substring(linea.indexOf(' '));
                //System.out.println("ap = " + ap);
                Alumno al=new Alumno(nom,ap);
                //System.out.println("al = " + al);
                listaleida.add(al);
               // nl++;
            }
            //System.out.println("fin del archivo");
        }catch (FileNotFoundException e){
            System.out.println("error escrit");
            System.out.println(e.toString());
        }
    }
}

