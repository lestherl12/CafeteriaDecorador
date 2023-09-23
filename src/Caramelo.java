public class Caramelo extends Decorador {
    public Caramelo(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Caramelo";
    }

    @Override
    public double costo() {
        return bebida.costo() + 1.0; // Precio adicional por caramelo
    }
}
