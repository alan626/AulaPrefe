public class Item {

    public class Random{

        private static double gerador = 0;

        public static void main(String[] args) {


            Random gerador = new Random();


            for (double i = 0; i < 100; i++){

                System.out.println(gerador.nextDouble());
            
            }

        }

    }
}
