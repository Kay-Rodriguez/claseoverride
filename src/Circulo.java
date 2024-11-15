public class Circulo extends dosD{
    double raio;
    public Circulo(){}

public Circulo(double raio){
        this.raio = raio;
}

    public Circulo(double lado, int nlados, double raio) {
        super(lado, nlados);
        this.raio = raio;
    }

    public Circulo(String tipo, double lado, int nlados, double raio) {
        super(tipo, lado, nlados);
        this.raio = raio;
    }

    public double getRaio(){
        return raio;
}
public void setRaio(double raio){
        this.raio = raio;
}

public void calcularArea(){
        double area = Math.PI * Math.pow(this.raio, 2);
        System.out.println("Area: " + area);
}
public void calcularPerimetro(){
        double perimetro = 2 * Math.PI * this.raio;
        System.out.println("Perimetro: " + perimetro);
}
    @Override
    public void mostrarDatos(){
        System.out.println("mostrar datos circulo");
    }



}
