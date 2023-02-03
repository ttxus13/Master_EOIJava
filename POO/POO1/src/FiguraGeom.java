public class FiguraGeom {
    //atributos
    String nombre;
    int lados;
    float longitud;
    float perimetro;
    double superficie;
    //metodos(comportamiento

    public FiguraGeom(String nombre, int lados, float longitud) {
        this.nombre = nombre;
        this.lados = lados;
        this.longitud = longitud;
        perimetro();
        superficie();
    }

    public void perimetro(){
       perimetro= lados*longitud;

    }
    public void superficie(){//s=n*l*a/2    a=L/2tan angul  angul=360/2n
        switch (lados){
            case 0:
            case 1:

                break;
            case 2:
                superficie=0;
                break;
                case 3;
                //raiz de 3) /4 * lado^2
                break;
            case 4:
                superficie=longitud*longitud;
                break;
            default:
        double anggrad=360/(2*lados);
        //System.out.println("anggrad = " + anggrad);
        double angul=Math.toRadians(anggrad);
        //System.out.println("angul = " + angul);
        double apot=longitud/2*Math.tan(angul);
        //System.out.println("apot = " + apot);
        superficie=lados*longitud*apot/2;
        //System.out.println("superficie = " + superficie);
        }
        }




    public String info() {
        return "FiguraGeom{" +
                "nombre='" + nombre + '\'' +
                ", lados=" + lados +
                ", longitud=" + longitud +
                ", perimetro=" + perimetro +
                ", superficie=" + superficie +
                '}';
    }


}
