public class Pessoa {
    private String nome;
    private String data;
    private Integer idade;

    public Pessoa(String nome, String data, Integer idade) {
        this.nome = nome;
        this.data = data;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirNome() {
        System.out.println("Nome: " + nome);
    }
    //data nascimento
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void exibirData() {
        System.out.println("Data Nascimento: " + data);
    }
    // Idade

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void exibirIdade() {
        System.out.println("A idade é: " + idade);
    }
}
