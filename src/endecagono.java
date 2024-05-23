public class endecagono extends FigurasGeometricas{
    Double longitud;

    public endecagono(Double longitud, int numLados) {}
    public endecagono(){}

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
        return (((numLados * Math.pow(longitud, 2))/4) * (Math.tan(Math.PI / 11)));
    }
}
