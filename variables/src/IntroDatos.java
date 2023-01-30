import javax.swing.*;

public class IntroDatos {
    public static void main(String[] args) {
        //leer dato
        String dato;

        dato=JOptionPane.showInputDialog(null,"dato?");
        int numdec= Integer.parseInt(dato);



        System.out.println("numdec = " + numdec);
        System.out.println("binario 0b" + Integer.toBinaryString(numdec));
        System.out.println("octal 0" + Integer.toOctalString(numdec));
        System.out.println("hexa 0x" + Integer.toHexString(numdec));


    }
}
