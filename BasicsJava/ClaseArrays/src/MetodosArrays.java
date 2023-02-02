import java.util.Arrays;

public class MetodosArrays {
    public static void main(String[] args) {
        String[] colores1={"azul","rojo","verde","naranja","gris"};
        int[] num={1,2,3,4,3,5};
        int[] num2={2,5,8,3,2,9};
        //buscar
        System.out.println("Arrays.binarySearch(num,6) = " + Arrays.binarySearch(num,3));//primera oinc
        System.out.println("Arrays.binarySearch(num,6) = " + Arrays.binarySearch(num,5,5,3));//despues del tres
        Arrays.sort(colores1);
        for (String color:colores1) {
            System.out.println("color = " + color);
        }
        //comparar
        System.out.println("-------------");
        System.out.println("Arrays.equals(num,num2) = " + Arrays.equals(num, num2));
        System.out.println("Arrays.equals(num,num2) = " + Arrays.compare(num, num2));
        System.out.println("Arrays.equals(num,num2) = " + Arrays.compare(num,2,4, num2,3,5));

        //copiar
        int[] copia= Arrays.copyOf(num2,num2.length);
        for (int numer:num2) {
            System.out.println("color = " + numer);
        }
        //rellenar
        int[] mimatriz=new int[8];
        Arrays.fill(mimatriz,1);
        for (int numer:mimatriz) {
            System.out.println("color = " + numer);
        }
        //bidimensional
        System.out.println("bidim-------------");

        int[][] bidi=new int[3][4];
        bidi[0][0]=23;
        int[][] bidi2={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[][] bidi3=new int[4][];
        bidi3[0]=new int[4];
        bidi3[1]=new int[2];
        bidi3[2]=new int[3];
        bidi3[3]=new int[7];
        
        int[][] bidi4={{1,3,2,1,2},{2,3,2},{6,6}};
        for (int i = 0; i < bidi4.length; i++) {
            for (int j = 0; j < bidi4[i].length; j++) {
                System.out.println("bidi "+i+""+j+"  = " + bidi4[i][j]);
            }
        }
        }




    }

