public class ejfor {
    public static void main(String[] args) {
        for(int i=0;i<=20;i++){
            System.out.println("i = " + i);
        }

        //mostrara caracteres asci del 65 l 90
        char car='k';
        for (int i=65;i<91;i++){

            System.out.println(Character.toString(i));
        }
        //recorrer matriz
        String[] carros={"ford","casio","seat","toyota"};
        for (String carro : carros) {
            System.out.println(carro);
        }
        //bucles anidados
        int[][] numeros={ {1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < numeros.length; i++) {
            for (int k=0; k<numeros[i].length;k++) {
                System.out.println(numeros[i][k]);

            }
        }
        for(int[] mat:numeros){
            for (int valor:mat
                 ) {
                System.out.println(valor);
            }
        }

    }
}
