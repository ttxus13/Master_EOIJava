import java.util.Random;

public class JavaUtilRandom {
    public static void main(String[] args) {
        Random objRand = new Random();
        int numInt= objRand.nextInt();
        //rangos 0..90
        numInt= objRand.nextInt(92);
        System.out.println("numInt = " + numInt);

        for (int i = 0; i < 100; i++) {
            float numFloat = objRand.nextFloat(58);
            System.out.println("numFloat = " + numFloat);
        }

        //rango n...m
        numInt= objRand.nextInt(1,91);




    }
}
