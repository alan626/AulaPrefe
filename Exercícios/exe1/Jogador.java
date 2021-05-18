public class Jogador {

    private String nome;
    private String posicao;
    private int anoNascimento;
    private String nacionalidade;
    private float altura;
    private float peso;

    public Jogador (String nome, String posicao, int anoNascimento, String nacionalidade, float altura, float peso){

        this.nome = nome;
        this.posicao = posicao;
        this.anoNascimento = anoNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;

    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public String getPosicao(){
        return posicao;
    }
    public int getAnoNascimento(){
        return anoNascimento;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public float getAltura(){
        return altura;
    }
    public float getPeso(){
        return peso;
    }

   
    private int idade = 0;
    public void idadeJogador(int anoNascimento){
        idade = 2021 - anoNascimento;
    }
    public int getIdadeJogador(){
        return idade;
    }
    /*
    public int aposentar;

    public void aposentadoria(){
        if(posicao = "defesa"){
            aposentar = idade - 40;
        }else if(posicao = "meio-campo"){
            aposentar = idade - 38;
        }else{
            aposentar = idade - 35;
        }
    }
    public int getAposentadoria(){
        return aposentar;
    }*/

    public void dadosJogador(){
        
        System.out.println("Os dados do jogador sao: ");
        System.out.println("Nome: " + getNome());
        System.out.println("posicao" + getPosicao());
        System.out.println("Ano de nascimento " + getAnoNascimento());
        System.out.println("Idade: " + getIdadeJogador());
       // System.out.println("Tempo para aposentadoria: " + getAposentadoria());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
    }

}
