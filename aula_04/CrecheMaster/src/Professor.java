public class Professor extends Funcionario implements Educador{

    private Turma turma;
    private String turno;
    private String aula;


    Professor(String id, String nome, int idade) {
        super(id, nome, idade);
    }

    Professor(String id, String nome) {
        super(id, nome);
    }

    public Turma getTurma() {
        return turma;
    }

    @Override
    public void setTurma(Turma turma) {
        this.turma = turma;
    }


    @Override
    public String getAula() {
        return "";
    }

    @Override
    public void setAula(String aula) {

    }

    public String getTurno() {
        return turno;
    }

    @Override
    public void setTurno(String turno) {
        this.turno = turno;
    }

}
