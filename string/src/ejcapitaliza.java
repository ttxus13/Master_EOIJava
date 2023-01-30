import java.util.Arrays;

public class ejcapitaliza {
    public static void main(String[] args) {
        //def variables
        //convertir todas en nombre  propio
        //inprimir nomvbre completo
        String nom="pepe";
        String ap1="lopez";
        String ap2="baez";
        //p1
        /*
        nom=nom.substring(0,1).toUpperCase()+nom.substring(1).toLowerCase();
        ap1=ap1.substring(0,1).toUpperCase()+nom.substring(1).toLowerCase();
        ap2=ap2.substring(0,1).toUpperCase()+nom.substring(1).toLowerCase();
        String complet=nom+" "+ap1+" "+ap2;
        System.out.println("complet = " + complet);
        */
        //parte2
        /*


        nom="pepe";
        ap1="lopez-soria";
        ap2="baez gonzalez";
        complet=nom+" "+ap1+" "+ap2;
        String[] matriz= complet.split(" ");
        for(int i=0;i < matriz.length ; i++){
            System.out.println(matriz[i]=matriz[i].substring(0,1).toUpperCase()+matriz[i].substring(1).toLowerCase());

        }
        */
        //p3
        nom="pepe";
        ap1="lopez-soria";
        ap2="baez gonzalez";
        String complet=nom+" "+ap1+" "+ap2;
        complet=complet.replace("-"," - ");
        String[] matriz= complet.split(" ");
        for(int i=0;i < matriz.length ; i++){
            System.out.println(matriz[i]=matriz[i].substring(0,1).toUpperCase()+matriz[i].substring(1).toLowerCase());

        }
        complet=complet.replace(" - ","-");




    }
}
