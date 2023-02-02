import java.util.Arrays;

public class MetodosPropiosArrays {
    public static void main(String[] args) {
        //ordenar array en orden descendente
        int[] num={5,4,7,8,-9,1,2,5,4};
        int[] num2={1,2,3};
        int[] num3={4,5,6};
        String[] colors= {"lavar","azul","Verde","negro","gris"};
        String[] str1= {"lavar","azul"};
        String[] str2= {"Verde","negro","gris"};
        System.out.println(maxsort(num));
        int[] numsum=pull(num2);
        for (int numer:numsum) {
            System.out.println("numer = " + numer);
        }


//        int[] suma=unirMatrices(num2,num3);
//        for (int numer:suma) {
//            System.out.println("numer = " + numer);
//        }
//        String[] suma=unirMatrices(str1,str2);
//        for (String numer:suma) {
//            System.out.println("numer = " + numer);
//        }

//        for(int numer:num){
//            System.out.println("a " + numer);
//        }
//        System.out.println(search(num,1));

        System.out.println("------------------" );

        invert(num);
        invert(colors);
//        for(String numer:colors){
//            System.out.println("inv? = " + numer);
//        }


    }

    public static void invert(int[] a){
        Arrays.sort(a);
        int[] b = Arrays.copyOf(a, a.length);



        for (int i = 0; i < a.length; i++) {
            a[i]=b[a.length-1-i];
            //System.out.println("a" + a[a.length-1-i]+"bi " + b[i]+" i "+i);
        }

    }
    public static void invert(String[] a){
//        for (int i=0;i<a.length;i++) {
//            a[i].toLowerCase(a[i]);
//        }
        Arrays.sort(a);
        String[] b = Arrays.copyOf(a, a.length);



        for (int i = 0; i < a.length; i++) {
            a[i]=b[a.length-1-i];
            //System.out.println("a" + a[a.length-1-i]+"bi " + b[i]+" i "+i);
        }

    }

    public static String[] unirMatrices(String[] a, String[]b) {
        String[] res= new String[a.length+ b.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            res[a.length+i] = b[i];
        }
        
        
        return res;
    }
    public static int[] unirMatrices(int[] a, int[]b) {
        int[] res= new int[a.length+ b.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            res[a.length+i] = b[i];
        }


        return res;
    }
    public static int search(int arr[], int x) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    public static int search(String arr[], String x) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            if (arr[i].equals(x))
                return i;
        }
        return -1;
    }
    public static int max(int[] arr){
        int res=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>res){res=arr[i];}
        }
        return res;
    }
    public static int min(int[] arr){
        int res=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<res){res=arr[i];}
        }
        return res;
    }
    public static int maxsort(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static int minsort(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    public static int[] push(int[] a, int b) {
        int[] res= new int[a.length+ 1];
        res= Arrays.copyOf(a,a.length+1);
        res[a.length] = b;
        return res;
    }//suma b al final
    public static int[] pull(int[] a) {
        int[] res= new int[a.length+ 1];
        res= Arrays.copyOf(a,a.length-1);

        return res;
    }//quita el último miembro de la matriz


    

}
