

public class Main {
    
    public static void main(String[] args) {
        

        Chat c = new Chat();
        Mensagem m = new Mensagem();


        String msg = c.enviaMsg("Mensagem enviada pelo app chat");
        m.recebeMsg(msg);
        
        
        
    }
}
