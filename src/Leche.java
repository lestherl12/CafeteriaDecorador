public class Leche extends Decorador {
    public Leche(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Leche";
    }

    @Override
    public double costo() {
        return bebida.costo() + 2.0; // Precio adicional por leche
    }
}
