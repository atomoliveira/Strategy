public class Disciplina {
    private MediaStrategy mediaStrategy;

    public Disciplina(MediaStrategy mediaStrategy) {
        this.mediaStrategy = mediaStrategy;
    }

    public boolean estaAprovado(double[] notas) {
        return mediaStrategy.estaAprovado(notas);
    }
}