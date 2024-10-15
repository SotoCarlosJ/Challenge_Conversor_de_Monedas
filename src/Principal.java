import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // 1) Dolar ==>> Peso argentino
        // 2) Peso argentino ==>> Dolar
        // 3) Dolar ==>> Real brasileño
        // 4) Real brasileño ==>> Dolar
        // 5) Dolar ==>> Peso colombiano
        // 6) Peso colombiano ==>> Dolar
        // 7) Salir
        ConsultaAPI consulta = new ConsultaAPI();
        Conversor conversor = new Conversor();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("***********************************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda");
            System.out.println("1) Dólar ==>> Peso argentino");
            System.out.println("2) Peso argentino ==>> Dólar");
            System.out.println("3) Dólar ==>> Real brasileño");
            System.out.println("4) Real brasileño ==>> Dólar");
            System.out.println("5) Dólar ==>> Peso colombiano");
            System.out.println("6) Peso colombiano ==>> Dólar");
            System.out.println("7) Salir");
            System.out.println("Elija una opcion valida:");
            System.out.println("***********************************************");

            int opcion = scanner.nextInt();
            TasaDeCambio tasa;

            switch (opcion) {
                case 1:
                    tasa = consulta.obtenerTasaDeCambio("USD", "ARS");
                    ResultadoConversion resultado1 = conversor.obtenerResultado(scanner, tasa);
                    System.out.println("El valor %.2f [USD] corresponde al valor final de ==>> %.2f [ARS]".formatted(resultado1.getValorInicial(), resultado1.getValorFinal()));
                    break;
                case 2:
                    tasa = consulta.obtenerTasaDeCambio("ARS", "USD");
                    ResultadoConversion resultado2 = conversor.obtenerResultado(scanner, tasa);
                    System.out.println("El valor %.2f [ARS] corresponde al valor final de ==>> %.2f [USD]".formatted(resultado2.getValorInicial(), resultado2.getValorFinal()));
                    break;
                case 3:
                    tasa = consulta.obtenerTasaDeCambio("USD", "BRL");
                    ResultadoConversion resultado3 = conversor.obtenerResultado(scanner, tasa);
                    System.out.println("El valor %.2f [USD] corresponde al valor final de ==>> %.2f [BRL]".formatted(resultado3.getValorInicial(), resultado3.getValorFinal()));
                    break;
                case 4:
                    tasa = consulta.obtenerTasaDeCambio("BRL", "USD");
                    ResultadoConversion resultado4 = conversor.obtenerResultado(scanner, tasa);
                    System.out.println("El valor %.2f [BRL] corresponde al valor final de ==>> %.2f [USD]".formatted(resultado4.getValorInicial(), resultado4.getValorFinal()));
                    break;
                case 5:
                    tasa = consulta.obtenerTasaDeCambio("USD", "COP");
                    ResultadoConversion resultado5 = conversor.obtenerResultado(scanner, tasa);
                    System.out.println("El valor %.2f [USD] corresponde al valor final de ==>> %.2f [COP]".formatted(resultado5.getValorInicial(), resultado5.getValorFinal()));
                    break;
                case 6:
                    tasa = consulta.obtenerTasaDeCambio("COP", "USD");
                    ResultadoConversion resultado6 = conversor.obtenerResultado(scanner, tasa);
                    System.out.println("El valor %.2f [COP] corresponde al valor final de ==>> %.2f [USD]".formatted(resultado6.getValorInicial(), resultado6.getValorFinal()));
                    break;
                case 7:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }
        System.out.println("Gracias por usar la aplicación.");
        scanner.close();
    }
}
