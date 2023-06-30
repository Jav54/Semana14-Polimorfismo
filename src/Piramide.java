import java.util.Scanner;

public class Piramide extends Triangulo{
    public Piramide(String Tipo) {
        super(Tipo);
    }

    private double a,b,c,d,e,f;

    public double areaAux(double a, double b, double c){
        double s= (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public void calcularBaricentro(){
        double bx= ((listaPuntos.get(0).getX()+listaPuntos.get(1).getX()+listaPuntos.get(2).getX())/3);
        double by= ((listaPuntos.get(0).getY()+listaPuntos.get(1).getY()+listaPuntos.get(2).getY())/3);
        double bz= ((listaPuntos.get(0).getZ()+listaPuntos.get(1).getZ()+listaPuntos.get(2).getZ())/3);
        Punto baricentro = new Punto(bx, by, bz);
        listaPuntos.add(baricentro);
    }
    @Override
    void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {
            System.out.println("Ingrese la componente X del punto "+i+": ");
            double x = sc.nextDouble();
            System.out.println("Ingrese la componente Y del punto "+i+": ");
            double y = sc.nextDouble();
            System.out.println("Ingrese la componente Z del punto "+i+": ");
            double z = sc.nextDouble();
            listaPuntos.add(new Punto(x,y,z));
        }
    }
    @Override
    double calcularPerimetro() {
        return 0;
    }
    @Override
    double calcularArea() {
        a = listaPuntos.get(0).calcularDistancia3D(listaPuntos.get(1));
        b = listaPuntos.get(1).calcularDistancia3D(listaPuntos.get(2));
        c = listaPuntos.get(0).calcularDistancia3D(listaPuntos.get(2));
        double area1 = areaAux(a,b,c);


        d = listaPuntos.get(0).calcularDistancia3D(listaPuntos.get(3));
        e = listaPuntos.get(1).calcularDistancia3D(listaPuntos.get(3));
        double area2 = areaAux(a,d,e);

        f = listaPuntos.get(2).calcularDistancia3D(listaPuntos.get(3));
        double area3 = areaAux(b,e,f);

        double area4 = areaAux(c,d,f);
        return area1+area2+area3+area4;
    }
    @Override
    double calcularVolumen(){
        calcularBaricentro();
        double area1 = areaAux(a,b,c);

        double altura = listaPuntos.get(3).calcularDistancia3D(listaPuntos.get(4));
        return ((area1)*(altura))/3;
    }
}