

public class Mensagem implements Comunicacao{
    

    public void recebeMsg(String msg){

        System.out.println("app Mensagem");
        System.out.println("Mensagem recebida: " + msg);


    }

    public String enviaMsg(String msg){

            return msg;

    }
}
