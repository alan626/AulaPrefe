public class Main {
    
    public static void main(String[] args) {
        
        Calculadora c = new Calculadora();
        int res = c.Soma(4, 8);

        System.out.println("O resultado da soma eh: " + res);

        float res2 = c.Soma(8.1f, 6.3f);
        System.out.println("O resultado da soma eh: "+ res2);

        int res3 = c.Soma(7,6,3);
        System.out.println("O resultado da soma eh: " + res3);
    }
    
}
