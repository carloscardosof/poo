public interface Educador {

    static int numeroAulas = 0;
    
    String getAula();

    void setAula(String aula);

    String getTurno();

    void setTurno(String turno);

    Turma getTurma();

    void setTurma(Turma turma);

    default void darAula(){
        System.out.println("Oi! Estou dando aula!");
        //Educador.numeroAulas++;
    }



}
