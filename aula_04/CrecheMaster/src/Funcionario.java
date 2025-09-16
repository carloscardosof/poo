public abstract class Funcionario extends Pessoa{

    private String cargo;
    private String vinculo;
    private double salario;

    Funcionario(String id, String nome,int idade){
        super(id,nome,idade);
    }

    Funcionario(String id, String nome){
        super(id,nome);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }
}
