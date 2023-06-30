public class Punto {

    double x, y, z;

    public Punto(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double calcularDistancia(Punto punto2){
        double dist = Math.sqrt(Math.pow(x- punto2.getX(),2)+Math.pow(y- punto2.getY(),2));
        return dist;
    }
    public double calcularDistancia3D(Punto punto2){
        double dist = Math.sqrt(Math.pow(x- punto2.getX(),2)+Math.pow(y- punto2.getY(),2)+Math.pow(z- punto2.getZ(),2));
        return dist;
    }
}
