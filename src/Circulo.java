import java.util.Scanner;

public class Circulo extends Figura{
    public Circulo(String Tipo){
        this.Tipo=Tipo;
    }

    private double rad;

    @Override
    double calcularArea() {
        double area = Math.PI*(Math.pow(rad, 2));
        return area;
    }

    @Override
    void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Los dos puntos que se ingresen corresponderán al radio del circulo: ");
        for (int i = 1; i < 3; i++) {
            System.out.println("Ingrese la componente X del punto " + i + ": ");
            double x = sc.nextDouble();
            System.out.println("Ingrese la componente Y del punto " + i + ": ");
            double y = sc.nextDouble();
            System.out.println("Ingrese la componente Z del punto " + i + ": ");
            double z = sc.nextDouble();
            listaPuntos.add(new Punto(x, y, z));
        }
    }

    @Override
    double calcularPerimetro() {
        rad = listaPuntos.get(0).calcularDistancia(listaPuntos.get(1));
        double perimetro = 2*Math.PI*rad;
        return perimetro;
    }

    @Override
    double calcularVolumen() {
        return 0;
    }
}