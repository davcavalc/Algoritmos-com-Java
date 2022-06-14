import java.util.Locale;

public class SaidaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        OlaMundo();
        Dia();
        imprimirNumero(32);
        imprimirNumeroDouble(10.35784);
        imprimirNumeroDouble2Casas(10.35784);
        imprimirNumeroDouble4Casas(10.35784);
        concatenacaoDePalavras();
        concatenacaoDeMaisPalavras(12.33344);
        DadosImpressos();
    }

    public static void OlaMundo () {
        System.out.print("1) Olá Mundo! Sem quebra de linha");
    }
    public static void Dia () {
        System.out.println("2) Bom dia! Com quebra de linha");
    }
    public static void imprimirNumero (int y) {
        System.out.println("3) O número impresso é: " + y);
    }
    public static void imprimirNumeroDouble (double z) {
        System.out.println("4) O número double impresso é: " + z);
    }
    public static void imprimirNumeroDouble2Casas(double q) {
        System.out.printf("5) %.2f%n", q);
    }
    public static void imprimirNumeroDouble4Casas(double f) {
        System.out.printf("6) %.4f%n", f);
    }
    public static void concatenacaoDePalavras() {
        System.out.println("7) Resultado = " + 10.21 + " metros");
    }
    public static void concatenacaoDeMaisPalavras(double d) {
        System.out.printf("8) Resultado = %.2f metros%n", d);
    }
    public static void DadosImpressos() {
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("9) %s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
