public class Coche {
    //atributos(estado/caracteristicas)
    String marca;
    String modelo;
    String color;
    String carroceria;
    float potencia;
    float cilindrada;
    String combustible;
    float rpm=0;
    float km;
    float deposito=50;
    final static int EN=112;
    static  String distintivo="E";

    //metodos comportamiento
    public void arrancar(){
        rpm=800;
    }
    public void acelerar(float aceleracion){
        rpm+=aceleracion;
    }
    public void decelerar(float deceleracion){
        rpm-=deceleracion;
    }
    public String detallescoche(){
        return "marca: "+marca+" modelo: "+modelo;
    }
    public static void llamaEm(){
        System.out.println("llamo a "+EN);
    }
    public float consumo(float distancia){
        //siempre lleno y vacio deposito
        return this.deposito/distancia*100;
    }
    public float consumo(float distancia,float repostado){
        return repostado/distancia*100;
    }




}

