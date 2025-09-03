import java.util.ArrayList;

public class Receita {

    private String nome;
    private ArrayList<Ingrediente> ingredientes;
    private String instrucoes = "";



    Receita(){

        ingredientes = new ArrayList<>();
    }


    void addIngrediente(Ingrediente ig){

        ingredientes.add(ig);
    }

    double calcularCalorias(){
        double calorias = 0;
        for(int i = 0; i< ingredientes.size(); i++){
            calorias += ingredientes.get(i).getAlimento().getCalorias();
        }
        return calorias;
    }


    void exibirReceita(){

        String receita = "Receita para "+ getNome() +":\n";
        receita += "Ingredientes:\n";

        for(Ingrediente i: ingredientes){
            receita += i.getQuantidade() +" x "+ i.getAlimento().getNome() +"\n";
        }

        receita += getInstrucoes();

        System.out.println(receita);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getInstrucoes() {
        return instrucoes;
    }

    public void setInstrucoes(String instrucoes) {
        this.instrucoes = instrucoes;
    }
}
