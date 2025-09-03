import java.util.ArrayList;
import java.util.Date;

public class Ingrediente {

    private Alimento alimento;
    private Tempero tempero;
    private int quantidade;
    public static final String UNIDADE = "unidade";
    public static final String PORCAO = "porcao";
    public static final String GRAMA = "grama";
    public static final String QUILO = "quilo";
    private String medida;



    Ingrediente(Alimento alimento, int quantidade, String medida){
        this.alimento = alimento;
        this.quantidade = quantidade;
    }

    Ingrediente(Alimento alimento, int quantidade){
        this.alimento = alimento;
        this.quantidade = quantidade;
        this.medida = Ingrediente.GRAMA;
    }

    //@Override
    Ingrediente(Tempero tempero, int quantidade, String medida){
        this.tempero = tempero;
        this.setQuantidade(quantidade);
    }




    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade<0){
            System.out.println("Valor inválido!");
            return;
        }
        this.quantidade = quantidade;
    }

    public double getCalorias(){
        if(this.alimento == null){
            return this.tempero.getCalorias()*this.quantidade;
        }
        return this.alimento.getCalorias()*this.quantidade;

    }
}
