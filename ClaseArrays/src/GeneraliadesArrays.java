public class GeneraliadesArrays {
    public static void main(String[] args) {
        //declaraciones
        String[] colores1={"azul","rojo","verde","naranja","gris"};
        String[] colores2= new String[5];
        for (int i = 0; i < colores1.length; i++) {
            System.out.println("colores1 = " + colores1[i]);
        }
        for (String color:colores2) {
            System.out.println("colores2[i] = " + color);
            }

        //asignar valores
        colores2[1]="nardo";
        for (String color:colores2) {
            System.out.println( color);
        }

        //copiar una matriz en otra
        System.out.println("-------------------");
        for (int i = 0; i < colores1.length; i++) {
            colores2[i]=colores1[i];

        }
        for (String color:colores2) {
            System.out.println( color);
        }
        //invertir matriz
        System.out.println("-------------------");
        for (int i = 0; i < colores1.length; i++) {
            colores2[i]=colores1[colores1.length-1-i];

        }
        for (String color:colores2) {
            System.out.println( color);
        }


    }
}
