public class Te extends Bebida {
    public Te() {
        descripcion = "Té";
    }

    @Override
    public double costo() {
        return 7.0; // Precio base del té
    }
}