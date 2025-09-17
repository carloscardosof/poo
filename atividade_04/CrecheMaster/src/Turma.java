import java.util.ArrayList;

public abstract class Turma {

    private String id;
    private String nome;
    private String turno;
    private ArrayList<Aluno> alunos;
    private Educador professor;
    protected int idadeMin;
    protected int idadeMax;

    Turma(String id, String nome, String turno){
        this.id = id;
        this.nome = nome;
        this.turno = turno;
    }

    public static Turma getTurma(String id, String nome, String turno, int idadeMin, int idadeMax){
        if(idadeMin==2 && idadeMax==3){
            return new TurmaCreche(id,nome,turno);
        }
        if(idadeMin==4 && idadeMax==5){
            return new TurmaInfantil(id,nome,turno);
        }
        if(idadeMin==6 && idadeMax==6){
            return new TurmaPre(id,nome,turno);
        }
        return null;
    }

    public boolean addAluno(Aluno aluno){
        if(aluno.getIdade()<idadeMin || aluno.getIdade()>idadeMax){
            System.out.println("Idade do aluno é inválida para esta turma.");
            return false;
        }
        alunos.add(aluno);
        aluno.setTurma(this);
        return true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Educador getProfessor() {
        return professor;
    }

    public void setProfessor(Educador professor) {
        this.professor = professor;
        professor.setTurma(this);
        professor.setTurno(this.turno);
    }

    public int getIdadeMin() {
        return idadeMin;
    }

    public int getIdadeMax() {
        return idadeMax;
    }
}
