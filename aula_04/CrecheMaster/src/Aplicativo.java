import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplicativo {

    //Pessoa pessoa = new Aluno("14","João",34, "");
    private ArrayList<Turma> turmas;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Responsavel> responsaveis;
    private ArrayList<Matricula> matriculas;

    private Scanner scanner;

    Aplicativo(){
        scanner = new Scanner(System.in);
        turmas = new ArrayList<>();
        alunos = new ArrayList<>();
        professores = new ArrayList<>();
        funcionarios = new ArrayList<>();
        responsaveis = new ArrayList<>();
        matriculas = new ArrayList<>();

        Turma turma = Turma.getTurma("dasdasda","Pré","vespertino",6,6);

        //Aluno aluno1 = new Aluno("214234","João da Silva",2,null);
        start();

    }

    public void start(){

        boolean ativo = true;

        while (ativo){
            ativo = selecionarOpcao();
        }


    }

    public void print(String msg){
        System.out.print(msg+"\n");
    }

    public String input(String msg){
        System.out.print(msg+"\n");
        return scanner.nextLine();
    }

    public Aluno getAluno(String nome){
        if(alunos.isEmpty()){
            return null;
        }
        for(Aluno a : alunos){
            if(a.getNome().equals(nome)){
                return a;
            }
        }
        return null;
    }


    public Professor getProfessor(String nome){
        if(professores.isEmpty()){
            return null;
        }
        for(Professor p : professores){
            if(p.getNome().equals(nome)){
                return p;
            }
        }
        return null;
    }

    public Responsavel getResponsavel(String nome){
        if(responsaveis.isEmpty()){
            return null;
        }
        for(Responsavel r : responsaveis){
            if(r.getNome().equals(nome)){
                return r;
            }
        }
        return null;
    }

    public Turma getTurma(String nome){
        if(turmas.isEmpty()){
            return null;
        }
        for(Turma t : turmas){
            if(t.getNome().equals(nome)){
                return t;
            }
        }
        return null;
    }

    public boolean selecionarOpcao(){

        String opcao = input(getMenu("geral"));

        switch (opcao){ //exibir  menu e pegar o input
            case "1":
                print("1. CADASTRAR ALUNO:\n");
                String nome = input("Nome do aluno:");
                int idade = Integer.parseInt(input("Idade:"));
                String necessidade = input("Necessidade especial:");
                Aluno aluno = new Aluno("2432432", nome, idade, necessidade);
                Responsavel responsavel = getResponsavel(input("Nome completo do responsável:"));
                if(responsavel == null){
                    System.out.println("Responsável não encontrado. Cadastro cancelado.");
                    return true;
                }
                aluno.setResponsavel(responsavel);
                Turma turmaAluno = getTurma(input("Nome da tuma:"));
                if(turmaAluno == null){
                    System.out.println("Turma não encontrada. Cadastro cancelado.");
                    return true;
                }
                if(!turmaAluno.addAluno(aluno)){
                    System.out.println("Aluno com idade inválida para a turma.");
                    return true;
                }
                alunos.add(aluno);
                System.out.println("Aluno "+aluno.getNome()+" cadastrado com sucesso!");
                return true;
            case "2":
                print("2. CADASTRAR RESPONSÁVEL:\n");
                String nomeRes = input("Nome do responsável");
                String parentesco = input("Nível de parentesco:");
                String tel = input("Número de telefone:");
                Responsavel resp = new Responsavel("32423423",nomeRes);
                resp.setTelefone(tel);
                resp.setParentesco(parentesco);
                responsaveis.add(resp);
                print("Responsável "+resp.getNome()+" adicionado com sucesso!");
                return true;
            case "3":
                print("3. CADASTRAR FUNCIONÁRIO:\n");
                String tipoFunc = getMenu("funcionario");
                Funcionario func;
                String nomeFunc = input("Nome do funcionário:");
                String cargo = "";
                if(tipoFunc.equals("1")){
                    cargo = "Professor";
                    func = new Professor("adsadasd",nomeFunc);
                } else if (tipoFunc.equals("2")){
                    cargo = "Coordenador";
                    func = new Coordenador("4324234",nomeFunc);
                } else if (tipoFunc.equals("3")){
                    cargo = "Cuidador";
                    String minC = input("Informe a idade mínima:");
                    String maxC = input("Informe a idade máxima:");
                    try{
                        int idadeMinCuidador = Integer.parseInt(minC);
                        int idadeMaxCuidador = Integer.parseInt(maxC);
                        func = new Cuidador("234234",nomeFunc,idadeMinCuidador,idadeMaxCuidador);
                    } catch (NumberFormatException e){
                        print("Idade inválida!");
                        return true;
                    }
                } else {
                    print("Opção inválida");
                    return true;
                }
                func.setCargo(cargo);
                funcionarios.add(func);
                if(func instanceof Professor){
                    professores.add((Professor) func);
                }
                print("Funcionário "+func.getNome()+" cadastrado com sucesso no cargo "+func.getCargo()+"!");
                return true;
            case "4":
                print("4. CADASTRAR TURMA:\n");
                String nomeTurma = input("Insira o nome da turma:");
                String turnoTurma = input("Turno da turma:");
                String min = input("Idade mínima:");
                String max = input("Idade máxima:");
                int idadeMin;
                int idadeMax;
                try{
                    idadeMin = Integer.parseInt(min);
                    idadeMax = Integer.parseInt(max);
                } catch (NumberFormatException e){
                    print("Idade inválida!");
                    return true;
                }
                Turma turma = Turma.getTurma("1231231",nomeTurma,turnoTurma,idadeMin,idadeMax);
                if(turma == null){
                    print("Turma inválida");
                    return true;
                }
                String nomeProfTurma = input("Nome do professor:");
                Professor prof = getProfessor(nomeProfTurma);
                if(prof == null){
                    print("Professor inexistente");
                    return true;
                }
                turma.setProfessor(prof);
                turmas.add(turma);
                print("Turma "+turma.getId()+" cadastrada com sucesso!");
                return true;
            case "5":
                print("5. CADASTRAR MATRÍCULA:");
                String nomeAluno = input("Nome do aluno:");
                Aluno alunoM = getAluno(nomeAluno);
                if(alunoM == null){
                    print("Aluno não encontrado!");
                    return true;
                }
                String nomeTurmaM = input("Nome da turma:");
                Turma turmaM = getTurma(nomeTurmaM);
                if(turmaM == null){
                    print("Turma não encontrada!");
                    return true;
                }
                String nomeRespM = input("Nome do responsável:");
                Responsavel respM = getResponsavel(nomeRespM);
                if(respM == null){
                    print("Responsável não encontrado!");
                    return true;
                }
                Matricula matricula = new Matricula();
                matricula.setNumero(matriculas.size()+1);
                matricula.setSituacao(Matricula.ATIVO);
                matricula.setAluno(alunoM);
                matricula.setTurma(turmaM);
                matricula.addResponsavel(respM);
                matricula.setData(LocalDateTime.now());
                matriculas.add(matricula);
                print("Matrícula número "+matricula.getNumero()+" realizada com sucesso!");
                return true;
            case "6":
                print("exibindo alunos");
                return true;
            case "7":
                print("exibindo funcionários");
                return true;
            case "8":
                print("exibindo responsáveis");
                return true;
            case "9":
                print("exibindo turmas");
                return true;
            case "10":
                print("exibindo matrículas");
                return true;
            case "11":
                print("Encerrando o sistema.");
                return false;
            default:
                print("Comando inválido");
        }
        return true;
    }



    public String getMenu(String tipo){
        if(tipo.equals("geral")) {
            return "Escolha o comando abaixo:\n" +
                    "[1] Cadastrar aluno\n" +
                    "[2] Cadastrar responsável\n" +
                    "[3] Cadastrar funcionário\n"+
                    "[4] Cadastrar turma\n"+
                    "[5] Cadastrar matrícula\n"+
                    "[6] Exibir alunos\n"+
                    "[7] Exibir funcionários\n"+
                    "[8] Exibir responsáveis\n"+
                    "[9] Exibir turmas\n"+
                    "[10] Exibir matrículas\n"+
                    "[11] Encerrar o programa\n";
        }
        return "Escolha a opção abaixo:\n"+
                "[1] Cadastrar professor"+
                "[2] Cadastrar coordenador"+
                "[3] Cadastrar cuidador";
    }

}
