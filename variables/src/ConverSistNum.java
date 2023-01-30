public class ConverSistNum {
    public static void main(String[] args) {
        int numdec=0b1111;
        System.out.println("numdec = " + numdec);
        System.out.println("binario 0b" + Integer.toBinaryString(numdec));
        System.out.println("octal 0" + Integer.toOctalString(numdec));
        System.out.println("hexa 0x" + Integer.toHexString(numdec));

    }
}
