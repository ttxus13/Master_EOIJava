import java.util.Arrays;

public class Bingo {
    public static int numero() {//metodo que saca numero aleatorio
        int n = 1+ (int) (Math.random() * 90);//esto es lo mismo que en el otro sacar un numero de bingo
        return n;
    }
    public static void main(String[] args) {


        //bingo opcion 1

        int [] bingo = new int[91];
        int cont=0;
        while(cont<90){
            int n= numero();
            if (bingo[n]!=n){
                System.out.println("n = " + n);
                bingo[n]=n;
                cont++;
            }

        }
        //bingo opcion 2
        System.out.println("---------------------------------------------------");

        int [] bingo2 = new int[90];
        cont=0;
        while(cont<90){
            int n= numero();
            if (bingo2[n-1]!=n){
                System.out.println("n = " + n);
                bingo2[n-1]=n;
                cont++;
            }

        }
        //bingo opcion 3
        System.out.println("---------------------------------------------------");

        int [] bingo3 = new int[90];
        cont=0;
        boolean salir=false;
        while(!salir){
            int n= numero();
            if (bingo3[n-1]!=n){
                System.out.println("n = " + n);
                bingo3[n-1]=n;
                salir=true;
            }

        }

    }
}
