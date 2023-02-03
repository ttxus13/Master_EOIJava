public class EjemploCoche1 {
    public static void main(String[] args) {
        Coche1 cochemaria=new Coche1();
        System.out.println(cochemaria.getKm());
        System.out.println(cochemaria.getMarca());

        cochemaria.setMarca("opel");
        cochemaria.setDeposito(50);
        System.out.println(cochemaria.getMarca());
        System.out.println(cochemaria.consumo(800));
        System.out.println(cochemaria.consumo(700));
        System.out.println(cochemaria.getKm());
        //cochemaria.setKm(400);
        System.out.println(cochemaria.getKm());
        System.out.println("--------------");
        Coche1 elcoche= new Coche1("ford");
        System.out.println(elcoche.getKm());
        System.out.println(elcoche.getMarca());
        System.out.println("--------------");
        Coche1 elcoche2= new Coche1("subaru","sintra");
        System.out.println(elcoche.getKm());
        System.out.println(elcoche.getMarca());



    }
}
