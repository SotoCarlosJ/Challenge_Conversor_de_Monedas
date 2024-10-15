public record TasaDeCambio(String base_code, String target_code, double conversion_rate) {
    @Override
    public String toString() {
        return "Moneda base=" + base_code +
                ", Moneda objetivo=" + target_code +
                ", tasa=" + conversion_rate;
    }
}
