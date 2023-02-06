public class Cuadrado {
    public static void main(String[] args) {
        FiguraGeom cuadrado=new FiguraGeom("cuadr",4,5);
        System.out.println("cuadrado.nombre = " + cuadrado.nombre);
        System.out.println("cuadrado.lados = " + cuadrado.lados);
        System.out.println("cuadrado.long = " + cuadrado.longitud);
        System.out.println("cuadrado.perim = " + cuadrado.perimetro);
        System.out.println("cuadrado.sup = " + cuadrado.superficie);
        FiguraGeom trian=new FiguraGeom("trian",3,5);
        System.out.println("trian.nombre = " + trian.nombre);
        System.out.println("trian.lados = " + trian.lados);
        System.out.println("trian.long = " + trian.longitud);
        System.out.println("trian.perim = " + trian.perimetro);
        System.out.println("trian.sup = " + trian.superficie);
        FiguraGeom penta=new FiguraGeom("penta",5,6);
        System.out.println("penta.nombre = " + penta.nombre);
        System.out.println("penta.lados = " + penta.lados);
        System.out.println("penta.long = " + penta.longitud);
        System.out.println("penta.perim = " + penta.perimetro);
        System.out.println("penta.sup = " + penta.superficie);
        FiguraGeom circulo=new FiguraGeom("circulo",0,6);
        System.out.println("circul.nombre = " + circulo.nombre);
        System.out.println("circul.lados = " + circulo.lados);
        System.out.println("circul.long = " + circulo.longitud);
        System.out.println("circul.perim = " + circulo.perimetro);
        System.out.println("circul.sup = " + circulo.superficie);
    }




}
