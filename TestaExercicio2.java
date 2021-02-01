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

        System.out.println("A população do continente é: " + populacaoContinente);
        System.out.println("A dimensão total do continente é: " + dimensaoContinentte);
        System.out.println("A densidade populacional do continente é: " + densidadeContinente);
        System.out.println("O país com maior população é: " + nomeMaiorPolulacao + " com a população de : " + meuContinente.getMaiorPopulacaoPaisValor());
        System.out.println("O país com menor população é: " + nomeMenorPolulacao + " com a população de : " + meuContinente.getMenorPopulacaoPaisValor());
        System.out.println("O país com maior dimensão é: " + nomeMaiorDimensao + " com a população de : " + meuContinente.getMaiorDimensaoPaisValor());
        System.out.println("O país com menor dimensão é: " + nomeMenorDimensao + " com a população de : " + meuContinente.getMenorDimensaoPaisValor());
        System.out.println("A razão territorial do maior pais em relação ao menor país é: " + RazoDimensao);

    }

}