import java.util.ArrayList;
import java.util.List;

public abstract class Figura {

    public String Tipo;
    List<Punto> listaPuntos = new ArrayList<>();

    abstract double calcularArea();

    abstract void  ingresarPuntos();

    abstract double calcularPerimetro();
    abstract double calcularVolumen();

}

