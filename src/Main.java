public class Main {

    public static void main(String[] args) {
        int choice = 3;

        if (choice == 2) {
            aluno(args);
        } else if (choice == 3) {
            professor(args);
        } else {
            pessoa(args);
        }
    }


    public static void pessoa(String[] args){
        Pessoa pessoaObj = new Pessoa("Pedro", "05/06/2015", 8);
        pessoaObj.exibirNome();
        pessoaObj.exibirData();
        pessoaObj.exibirIdade();
    }

    public static void professor(String[] args){
        Professor profObj = new Professor("Roberto", "14/11/1983", 40, "Matemática");
        profObj.exibirNome();
        profObj.exibirData();
        profObj.exibirIdade();
        profObj.exibirMateria();
    }

    public static void aluno(String[] args){
    Aluno pessoaObj = new Aluno("João", "10/12/2002", 20, 2222);
        pessoaObj.exibirNome();
        pessoaObj.exibirData();
        pessoaObj.exibirIdade();
        pessoaObj.exibirRa();
    }
}
