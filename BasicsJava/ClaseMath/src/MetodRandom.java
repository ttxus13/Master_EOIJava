public class MetodRandom {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

            System.out.println(Math.random());
        }
        //uno al 100
        for (int i = 0; i < 100; i++) {
            int n =  (int) (Math.random() * 101);
            System.out.println("n " + n);
        }
        //dos dec
        for (int i = 0; i < 100; i++) {
int n =(int)(Math.random()*100);
            System.out.println("n "+n);
            float f =n;
            System.out.println("f/100 = " + f/100);
        }
        //bingo 1 al 90
        for (int i = 0; i < 100; i++) {
            int n = 1+ (int) (Math.random() * 90);
            System.out.println("n " + n);
        }
    }
}
