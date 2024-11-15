//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         FigurasGeometricas figura1= new FigurasGeometricas();
         figura1.mostrarDatos();

         dosD figura2D1 = new dosD();
         figura2D1.mostrarDatos();
         figura2D1.mostrarDatos2d();

         tresD figura3D3 = new tresD();
         figura3D3.mostrarDatos();
         figura3D3.mostrarDatos3d();

         Circulo  circulo1 = new Circulo(5);
         circulo1.calcularArea();
         circulo1.mostrarDatos2d();
         circulo1.mostrarDatos();

    }
}