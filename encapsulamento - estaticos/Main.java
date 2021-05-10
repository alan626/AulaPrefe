


public class Main {
    public static void main(String[] args){

        Carro c = new Carro("fiat","verde",4);
        Carro cl = new Carro("Ferrari","amarelo",2);

        c.setCor("azul");
        cl.setCor("Vermelho");

    
        System.out.println ("A cor do carro e "+c.getCor());
        System.out.println("A cor do carro 1 e "+cl.getCor());

        c.setPortas(5);

        System.out.println("Portas do carro: "+c.getPortas());
        System.out.println("Portas do carro 1 "+cl.getPortas());

        System.out.println(Settings.testPortas(c));

        c.acelerar();
    }
    
}