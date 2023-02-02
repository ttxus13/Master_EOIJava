public class Casting {
    public static void main(String[] args) {
        //widenning cast
        byte miByte=68;//1byte
        System.out.println("miByte = " + miByte);

        short miShort=miByte;//de 1 a 2 byte
        System.out.println("miShort = " + miShort);
        int miInt=miByte;//a4
        System.out.println("miInt = " + miInt);
        long miLong=miByte;//a8
        System.out.println("miLong = " + miLong);
        float mifloat=miLong;
        System.out.println("mifloat = " + mifloat);
        double miduble=mifloat;
        System.out.println("miduble = " + miduble);
        System.out.println("---------------------");



        //narrow
        miduble=56135135.54e12;
        System.out.println("miduble = " + miduble);
        mifloat=(float)miduble;
        System.out.println("mifloat = " + mifloat);
        miLong=(long)miduble;
        System.out.println("miLong = " + miLong);
        miInt=(int)miduble;
        System.out.println("miInt = " + miInt);
        miShort=(short)miduble;
        System.out.println("miShort = " + miShort);
        miByte=(byte) miduble;
        System.out.println("miByte = " + miByte);
        System.out.println("---------------------");//uso util
        mifloat=1455.6512565f;
        System.out.println("mifloat = " + mifloat);
        System.out.println("valor " + (int)mifloat);
        System.out.println("decimales " +(mifloat- (int)mifloat));






    }
}
