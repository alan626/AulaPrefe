
public class Main {

    public static void main(String[] args) {


        Hero h = new Hero();
        h.Energy();
        h.Power();


        Enemy e = new Enemy();

        e.Energy();
        e.Power();

        System.out.println(h.energy);
        
    }
    
}
