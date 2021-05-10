

public class Carro {
    
    private String marca;
    private String cor;
    private static int portas;

    public Carro (String marca,String cor, int portas){

        this.marca = marca;
        this.cor = cor;
        this.portas = portas;

    }

    private boolean testCor(String cor){
        if(cor != "vermelho"){
            return true;
        }
        return false;
    }


    public void acelerar(){
        System.out.println("Acelerando");
    }
    public String getMarca(){
        return marca;
    }
    public String getCor(){
        return cor;
    }
    public int getPortas(){
        return portas;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setCor(String cor){
        if(testCor(cor)){
            this.cor = cor;
        }else{
            System.out.println("Cor vermelha não pode ser adicionada");
        }
    }
    public void setPortas (int portas){
        this.portas = portas;
    }
}

