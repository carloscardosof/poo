public class TurmaPre extends Turma{

    private String aulaAlfabetizacao;

    TurmaPre(String id, String nome, String turno) {
        super(id, nome, turno);
        this.idadeMin = 6;
        this.idadeMax = 6;
    }

    public String getAulaAlfabetizacao() {
        return aulaAlfabetizacao;
    }

    public void setAulaAlfabetizacao(String aulaAlfabetizacao) {
        this.aulaAlfabetizacao = aulaAlfabetizacao;
    }
}
