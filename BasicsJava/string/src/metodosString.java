public class metodosString {
    public static void main(String[] args) {
        String str1= "En un lugar de La Mancha, de cuyo nombre ";
        String str2="Pepe Perez";
        String str3="PEPE PEREZ";
        System.out.println(str1.length());
        System.out.println(str2.equals(str3));
        System.out.println(str2.equalsIgnoreCase(str3));
        //comparar
        System.out.println(str2.compareTo(str3));
        //quitar espacios principio y final
        System.out.println(str1+"|");
        System.out.println(str1.trim()+"|");
        //extraes caracter
        System.out.println("caracter 10= " + str1.charAt(10));
        //convertir en matriz
        char[] matriz= str1.toCharArray();
        System.out.println("matriz " + matriz[10]);
        //extraer cadena
        System.out.println("str1 = " + str1.substring(0,9));
        //buscar
        System.out.println("1 coinc= " + str1.indexOf('u'));
        System.out.println("2 coinc= " + str1.indexOf('u',6));
        System.out.println("palabra " + str1.indexOf("Mancha"));
        System.out.println("2 coinc= " + str1.lastIndexOf('u'));


    }
}
