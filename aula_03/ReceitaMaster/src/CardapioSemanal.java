import java.util.HashMap;

public class CardapioSemanal {

    private HashMap<String,Refeicao> refeicoes;

    CardapioSemanal(){
        refeicoes = new HashMap<>();
    }

    public void addRefeicao(String horario,Refeicao r){
        refeicoes.put(horario,r);
    }





}
