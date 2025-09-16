import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Matricula {

    private int numero;
    private LocalDateTime data;
    private String situacao;
    private String observacoes;
    private String endereco;
    private Aluno aluno;
    private ArrayList<Responsavel> responsaveis = new ArrayList<>();
    private Funcionario funcionario;
    private Turma turma;
    public static final String ATIVO = "ativo";
    public static final String INATIVO = "inativo";

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public void addResponsavel(Responsavel responsavel){
        this.responsaveis.add(responsavel);
    }
}
