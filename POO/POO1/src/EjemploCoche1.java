public class EjemploCoche1 {
    public static void main(String[] args) {
        Coche1 cochemaria=new Coche1();
        cochemaria.setMarca("opel");
        cochemaria.setDeposito(50);
        System.out.println(cochemaria.getMarca());
        System.out.println(cochemaria.consumo(800));
        System.out.println(cochemaria.consumo(700));
        System.out.println(cochemaria.getKm());
        //cochemaria.setKm(400);
        System.out.println(cochemaria.getKm());

    }
}
