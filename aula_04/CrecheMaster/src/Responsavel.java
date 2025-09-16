public class Responsavel extends Pessoa{

    private String parentesco;
    private String telefone;


    Responsavel(String id, String nome, int idade) {
        super(id, nome, idade);
    }

    Responsavel(String id, String nome) {
        super(id, nome);
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


}


