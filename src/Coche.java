public class Coche {

    private static final String marca="Ford";
    private static String modelo;
    private final int potencia;

    public Coche (String modelo, int potencia) {

        this.modelo=modelo;
        this.potencia=potencia;
    }

    public static void frenar() {

        System.out.println("El coche esta frenando");

    }

    public void acelerar() {

        System.out.println("El coche esta acelerando");

    }

    public String toString() {
        return "El coche con marca "+marca+ " y modelo "+modelo+ " tiene una potencia de "+potencia+ "CV";
    }
}
