import java.util.Scanner;

public class Esfera extends Circulo{
    public Esfera(String Tipo) {
        super(Tipo);
    }
    private double rad;

    @Override
    void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Los dos puntos que se ingresen corresponderán al radio de la esfera: ");
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
        rad = listaPuntos.get(0).calcularDistancia3D(listaPuntos.get(1));
        double area = 4*Math.PI*(Math.pow(rad, 2));
        return area;
    }
    @Override
    double calcularVolumen() {
        double volumen = (4*Math.PI*(Math.pow(rad, 3)))/3;
        return volumen;
    }
}