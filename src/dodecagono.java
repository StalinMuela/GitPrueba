public class dodecagono extends FigurasGeometricas{
    Double longitud;

    public dodecagono(Double longitud, int numLados) {}
    public dodecagono() {}

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public double perimetro(){
        return longitud * numLados;
    }


    public double area(){
        return (3 * (2 + Math.sqrt(3)) * Math.pow(longitud, 2));
    }

}
