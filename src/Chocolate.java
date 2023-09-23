public class Chocolate extends Decorador {
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Chocolate";
    }

    @Override
    public double costo() {
        return bebida.costo() + 0.8; // Precio adicional por chocolate
    }
}