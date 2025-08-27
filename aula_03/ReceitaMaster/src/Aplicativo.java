public class Aplicativo {


        Aplicativo(){

            Alimento banana = new Alimento("Banana",94);
            Alimento abacaxi = new Alimento("Abacaxi",86);
            Alimento laranja = new Alimento("Laranja",86);
            Alimento sorvete = new Alimento("Sorvete",120);

            Receita saladaDeFruta = new Receita();
            saladaDeFruta.nome = "Salada de fruta";

            Ingrediente igBanana = new Ingrediente(banana, 4);
            Ingrediente igAbacaxi = new Ingrediente(abacaxi, 2);
            Ingrediente igLaranja = new Ingrediente(laranja,3);

            saladaDeFruta.addIngrediente(igBanana);
            saladaDeFruta.addIngrediente(igAbacaxi);
            saladaDeFruta.addIngrediente(igLaranja);

            saladaDeFruta.exibirReceita();


        }





}
