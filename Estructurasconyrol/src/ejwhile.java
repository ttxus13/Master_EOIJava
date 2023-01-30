public class ejwhile {
    public static void main(String[] args) {
        //recorrer 20
        //while
        int cont=0;
        while(cont <= 20){
            System.out.println("cont = " + cont);
        cont++;
        }
        //do while
        cont=0;
        do {
            System.out.println(cont);
            cont++;
        }while (cont<=20);
        //recorrer matriz
        String[] carros={"ford","casio","seat","toyota"};
        int i=0;
        while (i< carros.length){
            System.out.println("carros "+ i+" = " + carros[i]);
        i++;
        }

        for (String marca:carros) {
            if(marca=="casio"){
                break;
            }
            System.out.println("marca = " + marca);
        }




    }
}
