


public class Settings {
    
    public static float minPortas = 1;
    public static float maxPortas = 4;

    public static boolean testPortas(Carro car){

        if(car.getPortas() <= maxPortas && car.getPortas() >= minPortas){
            return true;
        }return false;

    }

}
