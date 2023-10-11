public class CalcMedia {
    public static void main(String[] args) {
        double[] notas = { 8.0, 9.0, 7.0 };

        MediaStrategy aritmetica = new MediaAritmetica();
        MediaStrategy geometrica = new MediaGeometrica();

        Disciplina disciplinaAritmetica = new Disciplina(aritmetica);
        Disciplina disciplinaGeometrica = new Disciplina(geometrica);

        System.out.println("Aprovado (Média Aritmética): " + disciplinaAritmetica.estaAprovado(notas));
        System.out.println("Aprovado (Média Geométrica): " + disciplinaGeometrica.estaAprovado(notas));
    }
}