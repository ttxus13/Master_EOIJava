public class General {
    public static void main(String[] args) {
        System.out.println(Math.max(5,7));
        System.out.println("Math.sqrt) = " + Math.sqrt(54));
        System.out.println("Math.pow(4,4) = " + Math.pow(4,4));
        //grad a rad
        //360-2*PI
        //rad=grad*2*PI/360
        double rad=(Math.toRadians(90));
        System.out.println("rad = " + rad);
        System.out.println("sin = " +Math.sin(rad));
        System.out.println("cos = " +Math.cos(rad));
        System.out.println("log = " +Math.log(rad));
        System.out.println("log10 = " +Math.log10(2));
        System.out.println("ceil = " +Math.ceil(8.4));
        System.out.println("floor = " +Math.floor(2.9));
        System.out.println("Math.round(8.5) = " + Math.round(8.5));
        System.out.println("Math.round(8.5) = " + Math.abs(-5.4));


    }
}
