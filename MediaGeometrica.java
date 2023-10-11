public class MediaGeometrica implements MediaStrategy {
    @Override
    public double calcularMedia(double[] notas) {
        if (notas.length == 0) {
            return 0.0;
        }
        double produto = 1.0;
        for (double nota : notas) {
            produto *= nota;
        }
        return Math.pow(produto, 1.0 / notas.length);
    }

    @Override
    public boolean estaAprovado(double[] notas) {
        double media = calcularMedia(notas);
        return media > 7.0;
    }
}