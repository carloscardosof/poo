import java.util.ArrayList;

public class Receita {

    String nome;
    ArrayList<Ingrediente> ingredientes;

    Receita(){

        ingredientes = new ArrayList<>();
    }


    void addIngrediente(Ingrediente ig){

        ingredientes.add(ig);
    }

    double calcularCalorias(){
        double calorias = 0;
        for(int i=0;i< ingredientes.size();i++){
            calorias += ingredientes.get(i).alimento.calorias;
        }
        return calorias;
    }


    void exibirReceita(){

        String receita = "Receita para "+nome+":\n";

        for(Ingrediente i:ingredientes){
            receita += i.quantidade +" x "+i.alimento.nome+"\n";
        }

        System.out.println(receita);
    }



}
