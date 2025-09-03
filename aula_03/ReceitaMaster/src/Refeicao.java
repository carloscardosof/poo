import java.util.HashMap;

public class Refeicao {

    private String horario;
    public static final String CAFEMANHA = "café da manhã";
    public static final String ALMOCO = "almoço";
    public static final String LANCHE = "lanche";
    public static final String JANTA = "janta";

    private HashMap<String,Receita> receitas;


    Refeicao(String tempo){
        receitas = new HashMap<>();
        this.horario = tempo;
    }

    public void addReceita(String dia, Receita r){
        this.receitas.put(dia,r);
    }






}
