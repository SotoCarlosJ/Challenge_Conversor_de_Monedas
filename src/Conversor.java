import java.util.Scanner;

public class Conversor {
    public ResultadoConversion obtenerResultado(Scanner scanner, TasaDeCambio tasa) {
        System.out.println("Ingrese el valor que desea convertir:");
        double valorInicial = scanner.nextDouble();
        double valorFinal = valorInicial * tasa.conversion_rate();
        return new ResultadoConversion(valorInicial, valorFinal);
    }
}
