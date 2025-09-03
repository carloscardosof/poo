public class Alimento {




    private String nome;
    private double calorias;
    private double proteinas;
    private double carboidratos;
    private double gorduras;
    private double fibras;
    private double vitaminas;
    private double minerais;
    private int indiceGlicemico;



    Alimento(String nm, double cl){
        setNome(nm);
        setCalorias(cl);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        if(proteinas<0){
            System.out.println("Valor inválido.");
            //throw new IllegalArgumentException("Valor inválido!");
        } else {
            this.proteinas = proteinas;
        }
    }

    public double getCarboidratos() {
        return carboidratos;
    }

    public void setCarboidratos(double carboidratos) {
        this.carboidratos = carboidratos;
    }

    public double getGorduras() {
        return gorduras;
    }

    public void setGorduras(double gorduras) {
        this.gorduras = gorduras;
    }

    public double getFibras() {
        return fibras;
    }

    public void setFibras(double fibras) {
        this.fibras = fibras;
    }

    public double getVitaminas() {
        return vitaminas;
    }

    public void setVitaminas(double vitaminas) {
        this.vitaminas = vitaminas;
    }

    public double getMinerais() {
        return minerais;
    }

    public void setMinerais(double minerais) {
        this.minerais = minerais;
    }

    public int getIndiceGlicemico() {
        return indiceGlicemico;
    }

    public void setIndiceGlicemico(int indiceGlicemico) {
        this.indiceGlicemico = indiceGlicemico;
    }
}
