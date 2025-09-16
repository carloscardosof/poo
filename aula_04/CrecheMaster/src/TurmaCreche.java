public class TurmaCreche extends Turma{

    private String horaCochilo;

    TurmaCreche(String id, String nome, String turno){
        super(id,nome,turno);
        this.idadeMin = 2;
        this.idadeMax = 3;
    }

    public String getHoraCochilo() {
        return horaCochilo;
    }

    public void setHoraCochilo(String horaCochilo) {
        this.horaCochilo = horaCochilo;
    }
}
