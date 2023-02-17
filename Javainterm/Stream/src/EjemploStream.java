import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {
        /*
        Stream<String> nombres= Stream.of("maria","jorge","pepe","Juan");
        nombres.forEach(System.out::println);
        System.out.println("---------------------");

        //crear stream desde matriz
        String[] arraynom={"maria","jorge","pepe","Juan"};
        Stream<String> noms1 =Arrays.stream(arraynom);
        noms1.forEach(System.out::println);
        System.out.println("---------------------");
        //construir stream con stream bulder
        Stream<String> nombres2=Stream.<String>builder()
                .add("maria")
                .add("joerge")
                .add("kjbsfd")
                .add("pepe")
                .build();
        nombres2.forEach(System.out::println);
        */

        //crear stream desde lista
        ArrayList<String> nombres3=new ArrayList<>();
        nombres3.add("maria");
        nombres3.add("ron");
        nombres3.add("alde");
        nombres3.add("saro");
        /*

        Stream<String>nom3=nombres3.stream();
        nombres3.forEach(System.out::println);
        */

        //operador map y peek
        Stream<String>nombres4=Stream.of("maria","jorge","pepe","Juan");
        nombres4//.peek(nom-> System.out.println("nom = " + nom))
                .map(nom->nom.toUpperCase())
                .map(nom->nom.toLowerCase())
                //.peek(nom-> System.out.println("nom = " + nom))
                .forEach(System.out::println);
               // .map(nom->nom.toUpperCase());
        System.out.println("---------------------");


        //convertir en coleccion
        Stream<String> nombres5=nombres3.stream();

        List<String> lista=nombres5.map(n->n.toUpperCase())
                .map(n->n.toLowerCase())
                .collect(Collectors.toList());
        lista.forEach(System.out::println);
        //convertir en objetos Usuario
        Stream<String> nombres6=nombres3.stream();
        nombres6.map(n->new Usuario(n,null))
                .peek(us-> System.out.println("us = " + us.getNombre()))
                .forEach(System.out::println);





    }

}
