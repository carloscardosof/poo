public abstract class Pessoa {

    private String id;
    private String nome;
    protected int idade;
    private String cpf;

    Pessoa(String id, String nome, int idade){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    Pessoa(String id, String nome){
        this.id = id;
        this.nome = nome;
    }


    public void setIdade(int idade){
        this.idade = idade;
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

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
