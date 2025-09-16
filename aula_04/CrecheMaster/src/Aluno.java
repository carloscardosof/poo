public class Aluno extends Pessoa {

    private Responsavel responsavel;
    private Turma turma;
    private String necessidadeEspecial;

    Aluno(String id, String nome, int idade, String necessidadeEspecial){
        super(id,nome,idade);
        this.necessidadeEspecial = necessidadeEspecial;
        this.idade = 4;
        this.necessidadeEspecial = "nenhuma";
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getNecessidadeEspecial() {
        return necessidadeEspecial;
    }

    public void setNecessidadeEspecial(String necessidadeEspecial) {
        this.necessidadeEspecial = necessidadeEspecial;
    }
}
