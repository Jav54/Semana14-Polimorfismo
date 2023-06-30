import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Figura> listaFiguras = new ArrayList<>();
        int cont = 0;

        while (cont == 0){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la figura que desee calcular perimetro y area: ");
            System.out.println("a: Triangulo");
            System.out.println("b: Cuadrado");
            System.out.println("c: Circulo");
            System.out.println("d: Piramide");
            System.out.println("e: Cubo");
            System.out.println("f: Esfera");
            System.out.println("g: Mostrar Figuras Ingresadas");
            String input = sc.next();

            switch (input){
                case "a":
                    Triangulo tr = new Triangulo("Triangulo");
                    tr.ingresarPuntos();
                    listaFiguras.add(tr);
                    break;
                case "b":
                    Cuadrado cua = new Cuadrado("Cuadrado");
                    cua.ingresarPuntos();
                    listaFiguras.add(cua);
                    break;
                case "c":
                    Circulo cr = new Circulo("Circulo");
                    cr.ingresarPuntos();
                    listaFiguras.add(cr);
                    break;
                case "d":
                    Piramide pr = new Piramide("Piramide");
                    pr.ingresarPuntos();
                    listaFiguras.add(pr);
                    break;
                case "e":
                    Cubo cu = new Cubo("Cubo");
                    cu.ingresarPuntos();
                    listaFiguras.add(cu);
                    break;
                case "f":
                    Esfera es = new Esfera("Esfera");
                    es.ingresarPuntos();
                    listaFiguras.add(es);
                    break;
                case "g":
                    for (int i=0; i< listaFiguras.size(); i++){
                        System.out.println("Tipo de figura: "+listaFiguras.get(i).Tipo);
                        System.out.println("Perimetro: "+listaFiguras.get(i).calcularPerimetro());
                        System.out.println("Area: "+listaFiguras.get(i).calcularArea());
                        System.out.println("Volumen: "+listaFiguras.get(i).calcularVolumen());
                    }
                    cont=1;
                    break;
                default:
                    System.out.println("Ingrese una letra correcta (en minusculas) para continuar: ");
            }
        }
    }
}