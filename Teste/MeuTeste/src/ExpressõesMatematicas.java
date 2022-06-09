public class ExpressõesMatematicas {
    public static void main(String[] args) {
        // System.out.println("Resultado da multiplicação: " + Multiplicar(2.34, 3.88));   
        System.out.println("A média é: " + calcularMedia(8.5, 7.8, 9.5, 10.0));   
    }

    public static float Multiplicar(double d, double e) {
        return (float) (d * e / 3); 
    }

    public static float calcularMedia(double n1, double n2, double n3, double n4 ) {
        return (float) ((n1 + n2 + n3 + n4) / 4);
    }

}