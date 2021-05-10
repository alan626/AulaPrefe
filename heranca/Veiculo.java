

public class Veiculo {

    private boolean motorizado;
    private String cor;
    private String marca;
    private String modelo;


    public void acelerar(){
        System.out.println("Acelerando...");
    }

    public void setMotorizado(boolean motorizado){
        this.motorizado = motorizado;
    }

    public boolean getMotorizado(){

        return motorizado;
    }
}
