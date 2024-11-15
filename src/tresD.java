public class tresD extends FigurasGeometricas{

     double lado;
     int nCaras;
     int nlados;

     public tresD() {}
    public tresD(double lado, int nCaras, int nlados) {
         this.lado = lado;
         this.nCaras = nCaras;
         this.nlados = nlados;
    }

    public tresD(String tipo, double lado, int nCaras, int nlados) {
        super(tipo);
        this.lado = lado;
        this.nCaras = nCaras;
        this.nlados = nlados;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public int getnCaras() {
        return nCaras;
    }

    public void setnCaras(int nCaras) {
        this.nCaras = nCaras;
    }

    public int getNlados() {
        return nlados;
    }

    public void setNlados(int nlados) {
        this.nlados = nlados;
    }

    public void calcularArea(){
    System.out.println("area");
}
public void calcularPerimetro(){
    System.out.println("perimetro");
}
public void mostrarDatos3d (){
    System.out.println("datos 3d");
}
}
