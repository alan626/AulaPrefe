public abstract class Player {
    
    private double energy;
    private double power;



    public Player(double energy, double power){

        this.energy = energy;
        this.power = power;
  
    }
    public void Energy(Double energy){

        this.energy = energy;
    }
    public void Power(Double power){

        this.power = power;
    }

    

    public double getEnergy(){
        return energy;
    }

    public double getpower(){
        return power;
    }

}
