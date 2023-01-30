public class EjecutarOS {
    public static void main(String[] args) {
        Runtime rt= Runtime.getRuntime();
        Process proceso;
        try {
            if(System.getProperty("os.name").toLowerCase().contains("windows")==true){
                proceso =rt.exec("notepad");
            }else{
                //macOS o Linux
                proceso =rt.exec("open -a Calculator");

            }

        }catch (Exception e){
            System.err.println("comando desconocido"+e.getLocalizedMessage());
            System.exit(1);
        }

    }
}
