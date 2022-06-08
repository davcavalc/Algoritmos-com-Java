public class ExpressõesMatematicas {
    public static void main(String[] args) {
        System.out.println("Resultado da multiplicação: " + Multiplicar(2.34, 3.88));   
    }

    public static float Multiplicar(double d, double e) {
        return (float) (d * e / 3); 
    }
}