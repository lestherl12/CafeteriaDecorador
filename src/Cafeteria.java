public class Cafeteria {
    public static void main(String[] args) {
        Bebida cafeConLeche = new Leche(new Cafe());
        Bebida teConCarameloYCrema = new Crema(new Caramelo(new Te()));
        Bebida cafeSimple = new Cafe();
        System.out.println("Café simple: " + cafeSimple.getDescripcion() + ", Costo: Q" + cafeSimple.costo());
        System.out.println("Café con leche: " + cafeConLeche.getDescripcion() + ", Costo: Q "+ cafeConLeche.costo());
        System.out.println("Té con caramelo y crema: " + teConCarameloYCrema.getDescripcion() + ", Costo: Q" + teConCarameloYCrema.costo());
    }
}


