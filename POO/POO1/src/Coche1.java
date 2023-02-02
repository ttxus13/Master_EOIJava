public class Coche1 {
    //atributos(estado/caracteristicas)
    private String marca;
    private String modelo;
    private String color;
    private String carroceria;
    float potencia;
    float cilindrada;
    String combustible;
    float rpm=0;
    private float km;
    private float deposito=50;
    final static int EN=112;
    static  String distintivo="E";
    private String numSerie;

    //getter y setter(encapsulado)


    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getCarroceria() {
        return carroceria;
    }
    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }
    public float getKm() {
        return km;
    }
//    public void setKm(float km) {
//        this.km = km;
//    }
    public float getDeposito() {
        return deposito;
    }
    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }
    public String getNumSerie() {
        return numSerie;
    }
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

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
        this.km += distancia;
        return this.deposito/distancia*100;
    }
    public float consumo(float distancia,float repostado){
        this.km += distancia;
        return repostado/distancia*100;
    }




}

