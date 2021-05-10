package heranca;

public class Main {

    public static void main(String[] args) {
        
        Carro c = new Carro();
        Aviao a = new Aviao();
        Bicicleta b = new Bicicleta();


        b.setMotorizado(false);
        c.setMotorizado(true);
        a.setMotorizado(true);

        System.out.println("Carro motorizado " + c.getMotorizado());
        System.out.println("Avião motorizado "+ c.getMotorizado());
        System.out.println("Bicicleta motorizado "+ c.getMotorizado());

    }
    
}
