public class TurmaInfantil extends Turma{

    private String aulaPsicomotricidade;

    TurmaInfantil(String id, String nome, String turno) {
        super(id, nome, turno);
        this.idadeMin = 4;
        this.idadeMax = 5;
    }

    public String getAulaPsicomotricidade() {
        return aulaPsicomotricidade;
    }

    public void setAulaPsicomotricidade(String aulaPsicomotricidade) {
        this.aulaPsicomotricidade = aulaPsicomotricidade;
    }
}
