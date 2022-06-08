public class App {
    public static void main(String[] args) {
        meuMetodo();
        Somar(2,123);
        Subtrair(2, 123);
        Multiplicar(23, 12);
        Dividir(12, 4);
        calcularODelta(2, 4, 6);
    }

    public static void meuMetodo() {
        System.out.println("Impresso através do método.");
    }
    
    public static void Somar(int valorA, int valorB) {
        System.out.println("O resultado da soma é: " + (valorA + valorB));
    }
    public static void Subtrair(int valorA, int valorB) {
        System.out.println("O resultado da subtração é: " + (valorA - valorB));
    }
    public static void Multiplicar(int valorA, int valorB) {
        System.out.println("O resultado da multiplicação é: " + (valorA * valorB));
    }
    public static void Dividir(int valorA, int valorB) {
        System.out.println("O resultado da divisão é: " + (valorA / valorB));
    }
    public static void calcularODelta(int valorA, int valorB, int valorC) {
        System.out.println("O valor de Delta é: " + (Math.pow(valorB, 2) - 4 * valorA * valorC));
    }

}
