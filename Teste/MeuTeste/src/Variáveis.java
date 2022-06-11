public class Variáveis {
    public static void main(String[] args) {
        Nome("Fulano Silva");
        Idade(32);
        Altura(1.68);
        Sexo("Masculino");
        Sexo2('M');
    }
    public static void Nome(String nome) {
        System.out.println("Nome: " + nome);
    }
    public static void Idade(int idade) {
        System.out.println("Idade: " + idade);
    }
    public static void Altura(double altura) {
        System.out.println("Altura: " + altura);
    }
    public static void Sexo(String sexo) {
        System.out.println("Sexo: " + sexo);
    }
    public static void Sexo2(char sexo2) {
        System.out.println("Sexo2: " + sexo2);
    }
}
