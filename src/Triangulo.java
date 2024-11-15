public class Triangulo extends dosD {
    double base;
    double altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double lado, int nlados, double base, double altura) {
        super(lado, nlados);
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(String tipo, double lado, int nlados, double base, double altura) {
        super(tipo, lado, nlados);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public void mostrarDatos(){
        System.out.println("mostrar datos");
    }

}