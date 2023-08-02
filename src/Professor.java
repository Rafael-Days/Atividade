public class Professor extends Pessoa{

    private String materia;
    public Professor(String nome, String data, Integer idade, String materia){
        super(nome, data, idade);
        this.materia = materia;
    }

    public String getMateria(){
        return materia;
    }

    public void setMateria(){
        this.materia = materia;
    }

    public void exibirMateria(){
        System.out.println("Matéria: " + materia);
    }
}
