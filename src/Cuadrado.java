public class Cuadrado extends dosD{
   double lado;
    public Cuadrado(){}

    public Cuadrado(String tipo, double lado, int nlados, double lado1) {
        super(tipo, lado, nlados);
        this.lado = lado1;
    }

    public Cuadrado(double lado, int nlados, double lado1) {
        super(lado, nlados);
        this.lado = lado1;
    }

    public Cuadrado(double lado){
        this.lado = lado;
    }
    public double getLado(){
        return lado;
    }
    public void setLado(double lado){
        this.lado = lado;
    }
    @Override
    public void mostrarDatos(){
        System.out.println("mostrar datos cuadrado ");
    }

}
