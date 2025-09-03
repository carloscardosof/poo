public class Aplicativo {


        Aplicativo(){

            Alimento banana = new Alimento("Banana",94);
            Alimento abacaxi = new Alimento("Abacaxi",86);
            Alimento laranja = new Alimento("Laranja",86);
            Alimento sorvete = new Alimento("Sorvete",120);

            System.out.println(banana.getProteinas());
            banana.setProteinas(-10);
            //banana.gorduras = -20;
            Tempero acucar = new Tempero("açúcar",800);

            Receita saladaDeFruta = new Receita();
            saladaDeFruta.setNome("Salada de fruta");

            Ingrediente igBanana = new Ingrediente(banana, 4, Ingrediente.UNIDADE);
            Ingrediente igAbacaxi = new Ingrediente(abacaxi, 2, Ingrediente.UNIDADE);
            Ingrediente igLaranja = new Ingrediente(laranja,3, Ingrediente.UNIDADE);

            saladaDeFruta.addIngrediente(new Ingrediente(acucar,20,Ingrediente.GRAMA));



            saladaDeFruta.addIngrediente(igBanana);
            saladaDeFruta.addIngrediente(igAbacaxi);
            saladaDeFruta.addIngrediente(igLaranja);

            Refeicao cafeManha = new Refeicao(Refeicao.CAFEMANHA);
            cafeManha.addReceita("segunda",saladaDeFruta);
            cafeManha.addReceita("terca",saladaDeFruta);
            cafeManha.addReceita("quarta",saladaDeFruta);
            cafeManha.addReceita("quinta",saladaDeFruta);
            cafeManha.addReceita("sexta",saladaDeFruta);
            cafeManha.addReceita("sabado",saladaDeFruta);
            cafeManha.addReceita("domingo",saladaDeFruta);

            Refeicao almoco = new Refeicao(Refeicao.ALMOCO);
            almoco.addReceita("segunda",saladaDeFruta);
            almoco.addReceita("terca",saladaDeFruta);
            almoco.addReceita("quarta",saladaDeFruta);
            almoco.addReceita("quinta",saladaDeFruta);
            almoco.addReceita("sexta",saladaDeFruta);
            almoco.addReceita("sabado",saladaDeFruta);
            almoco.addReceita("domingo",saladaDeFruta);

            Refeicao lanche = new Refeicao(Refeicao.LANCHE);
            lanche.addReceita("segunda",saladaDeFruta);
            lanche.addReceita("terca",saladaDeFruta);
            lanche.addReceita("quarta",saladaDeFruta);
            lanche.addReceita("quinta",saladaDeFruta);
            lanche.addReceita("sexta",saladaDeFruta);
            lanche.addReceita("sabado",saladaDeFruta);
            lanche.addReceita("domingo",saladaDeFruta);

            Refeicao janta = new Refeicao(Refeicao.JANTA);
            janta.addReceita("segunda",saladaDeFruta);
            janta.addReceita("terca",saladaDeFruta);
            janta.addReceita("quarta",saladaDeFruta);
            janta.addReceita("quinta",saladaDeFruta);
            janta.addReceita("sexta",saladaDeFruta);
            janta.addReceita("sabado",saladaDeFruta);
            janta.addReceita("domingo",saladaDeFruta);

            CardapioSemanal cardapio = new CardapioSemanal();
            cardapio.addRefeicao(Refeicao.CAFEMANHA,cafeManha);
            cardapio.addRefeicao(Refeicao.ALMOCO,almoco);
            cardapio.addRefeicao(Refeicao.LANCHE,lanche);
            cardapio.addRefeicao(Refeicao.JANTA,janta);

            saladaDeFruta.exibirReceita();


        }





}
