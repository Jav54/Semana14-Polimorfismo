import java.util.Scanner;

public class Cuadrado extends Figura{

    public Cuadrado(String Tipo){
        this.Tipo=Tipo;
    }

    private double a;

    @Override
    double calcularArea() {
        double area = a*a;
        return area;
    }

    @Override
    void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Los dos puntos que se ingresen corresponderan al lado del cuadrado: ");
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
        a = listaPuntos.get(0).calcularDistancia(listaPuntos.get(1));
        double perimetro = a*4;
        return perimetro;
    }

    @Override
    double calcularVolumen() {
        return 0;
    }
}