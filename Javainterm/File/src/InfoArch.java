import java.io.File;

public class InfoArch {
    public static void main(String[] args) {
        File arch = new File("arch1.txt");
        if(arch.exists()){
            System.out.println("arch.getName() = " + arch.getName());
            System.out.println("arch.getAbsolutePath() = " + arch.getAbsolutePath());
            System.out.println("arch.canExecute() = " + arch.canExecute());
            System.out.println("arch.canRead() = " + arch.canRead());
            System.out.println("arch.canWrite() = " + arch.canWrite());
            System.out.println("arch.length() = " + arch.length());
            System.out.println("arch.isDirectory() = " + arch.isDirectory());
            System.out.println("arch.isFile() = " + arch.isFile());
            System.out.println("arch.getTotalSpace() = " + arch.getTotalSpace());
            System.out.println("arch.isHidden() = " + arch.isHidden());
        }else{
            System.out.println("arch no encontrado");
        }
    }
}
