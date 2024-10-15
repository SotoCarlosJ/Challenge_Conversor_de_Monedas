public class ResultadoConversion {
    private double valorInicial;
    private double valorFinal;

    public ResultadoConversion(double valorInicial, double valorFinal) {
        this.valorInicial = valorInicial;
        this.valorFinal = valorFinal;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    @Override
    public String toString() {
        return String.format("El valor %.2f corresponde al valor final de %.2f", valorInicial, valorFinal);
    }
}
