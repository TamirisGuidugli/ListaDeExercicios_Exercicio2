package ListaDeExercicio01_Exercicio2;


public class TestaExercicio2 {

    public static void main(String[] args) {

        //Criei 2 paises
        Pais pais = new Pais("BRA", "Brasil", 8514876, 2400000.0);
        Pais pais2 = new Pais("WAK", "Wakanda", 4000500, 400000.0);

        //Criei 1 continente
        Continente meuContinente = new Continente("This is America");

        //Adicionei os paises no meu continente
        meuContinente.setPais(pais);
        meuContinente.setPais(pais2);


        double dimensaoContinentte = meuContinente.getDimensaoContinente();
        int populacaoContinente = meuContinente.getPopulacaoContinente();
        double densidadeContinente = meuContinente.getDensidadePopulacionalContinente();
        String nomeMaiorPolulacao = meuContinente.getMaiorPopulacaoPaisNome();
        String nomeMenorPolulacao = meuContinente.getMenorDimensaoPopulacaoPaisNome();
        String nomeMaiorDimensao = meuContinente.getMaiorDimensaoPaisNome();
        String nomeMenorDimensao = meuContinente.getMenorPopulacaoPaisNome();
        double RazoDimensao = meuContinente.getRazaoDimensao();

        System.out.println("A popula��o do continente �: " + populacaoContinente);
        System.out.println("A dimens�o total do continente �: " + dimensaoContinentte);
        System.out.println("A densidade populacional do continente �: " + densidadeContinente);
        System.out.println("O pa�s com maior popula��o �: " + nomeMaiorPolulacao + " com a popula��o de : " + meuContinente.getMaiorPopulacaoPaisValor());
        System.out.println("O pa�s com menor popula��o �: " + nomeMenorPolulacao + " com a popula��o de : " + meuContinente.getMenorPopulacaoPaisValor());
        System.out.println("O pa�s com maior dimens�o �: " + nomeMaiorDimensao + " com a popula��o de : " + meuContinente.getMaiorDimensaoPaisValor());
        System.out.println("O pa�s com menor dimens�o �: " + nomeMenorDimensao + " com a popula��o de : " + meuContinente.getMenorDimensaoPaisValor());
        System.out.println("A raz�o territorial do maior pais em rela��o ao menor pa�s �: " + RazoDimensao);

    }

}