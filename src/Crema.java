public class Crema extends Decorador {
    public Crema(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Crema";
    }

    @Override
    public double costo() {
        return bebida.costo() + 3.0; // Precio adicional por crema
    }
}