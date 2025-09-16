public class Cuidador extends Funcionario {

    private int idadeMin;
    private int idadeMax;

    Cuidador(String id, String nome, int idade) {
        super(id, nome, idade);
    }

    Cuidador(String id, String nome) {
        super(id, nome);
    }

    Cuidador(String id, String nome, int idadeMin, int idadeMax) {
        super(id, nome);
        this.idadeMin = idadeMin;
        this.idadeMax = idadeMax;
    }

    public int getIdadeMin() {
        return idadeMin;
    }

    public void setIdadeMin(int idadeMin) {
        this.idadeMin = idadeMin;
    }

    public int getIdadeMax() {
        return idadeMax;
    }

    public void setIdadeMax(int idadeMax) {
        this.idadeMax = idadeMax;
    }
}
