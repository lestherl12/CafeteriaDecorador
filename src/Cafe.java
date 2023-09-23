
public class Cafe extends Bebida {
    public Cafe() {
        descripcion = "Café";
    }

    @Override
    public double costo() {
        return 5.0; // Precio base del café
    }
}