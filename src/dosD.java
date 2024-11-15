public class dosD extends FigurasGeometricas{
    double lado;
    int nlados;
    public dosD() {
    }
    public dosD(double lado, int nlados) {
        this.lado = lado;
        this.nlados = nlados;
    }

    public dosD(String tipo, double lado, int nlados) {
        super(tipo);
        this.lado = lado;
        this.nlados = nlados;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public int getNlados() {
        return nlados;
    }

    public void setNlados(int nlados) {
        this.nlados = nlados;
    }
    public void calcularArea() {
        System.out.println("Area: " + lado * lado);
    }
    public void calcularPerimetro() {
        System.out.println("Perimetro: " + lado * 2);
    }

    public void mostrarDatos2d() {
        System.out.println("Datos 2d" );
    }
 @Override public void mostrarDatos(){
     System.out.println("Datos de 2d ");

 }
}
