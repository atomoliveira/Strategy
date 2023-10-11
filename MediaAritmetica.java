ublic class MediaAritmetica implements MediaStrategy {
    @Override
    public double calcularMedia(double[] notas) {
        if (notas.length == 0) {
            return 0.0;
        }
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    @Override
    public boolean estaAprovado(double[] notas) {
        double media = calcularMedia(notas);
        return media > 5.0;
    }
}