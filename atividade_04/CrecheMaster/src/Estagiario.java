public class Estagiario extends Pessoa implements Educador{

    private Turma turma;
    private String aula;
    private String turno;

    Estagiario(String id, String nome, int idade) {
        super(id, nome, idade);
    }


    @Override
    public String getAula() {
        return aula;
    }

    @Override
    public void setAula(String aula) {
        this.aula = aula;
    }

    @Override
    public String getTurno() {
        return "";
    }

    @Override
    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public Turma getTurma() {
        return null;
    }



    public void darAula(){
        
    }

}
