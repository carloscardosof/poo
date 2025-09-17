import java.util.ArrayList;
import java.util.Date;

public class Ingrediente {

    private Componente componente;
    private int quantidade;
    public static final String UNIDADE = "unidade";
    public static final String PORCAO = "porcao";
    public static final String GRAMA = "grama";
    public static final String QUILO = "quilo";
    private String medida;



    Ingrediente(Componente componente, int quantidade, String medida){
        this.componente = componente;
        this.quantidade = quantidade;
    }

    Ingrediente(Componente componente, int quantidade){
        this.componente = componente;
        this.quantidade = quantidade;
        this.medida = Ingrediente.GRAMA;
    }

    //@Override
    /*Ingrediente(Tempero tempero, int quantidade, String medida){
        this.tempero = tempero;
        this.setQuantidade(quantidade);
    }*/




    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
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
        return this.componente.getCalorias()*this.quantidade;

    }
}
