public class Aluno extends Pessoa{
    private int ra;

    public Aluno(String nome, String data, Integer idade, int ra) {
        super(nome, data, idade);
        this.ra = ra;
    }

    public int getRa(){
            return ra;
    }

    public void setRa(){
        this.ra = ra;
    }

    public void exibirRa(){
        System.out.println("RA: " + ra);
    }
}
