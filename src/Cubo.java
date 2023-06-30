import java.util.Scanner;

public class Cubo extends Cuadrado{
    public Cubo(String Tipo) {
        super(Tipo);
    }
    private double a;

    @Override
    void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Los dos puntos que se ingresen corresponderán a la arista del cubo: ");
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
        return 0;
    }
    @Override
    double calcularArea() {
        a = listaPuntos.get(0).calcularDistancia3D(listaPuntos.get(1));
        double area = (a*a)*6;
        return area;
    }
    @Override
    double calcularVolumen() {
        double volumen = (a*a*a);
        return volumen;
    }
}
