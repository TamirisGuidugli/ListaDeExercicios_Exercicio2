package ListaDeExercicio01_Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Continente {

    //Propriedades
    private String nome;
    private List<Pais> paises;

    //Inicializador
    public Continente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Método para adicionar países ao continente
    public void setPaises(List<Pais> paises) {
        this.paises.addAll(paises);
    }

    //Método para adicionar um país ao continente
    public void setPais(Pais pais) {
        if (this.paises == null) {
            this.paises = new ArrayList<>();
        }
        this.paises.add(pais);
    }

    //Método para retornar a Dimensao do Continente
    public double getDimensaoContinente() {
        double DimensaoContinente = 0;
        for (int i = 0; i < paises.size(); i++) {
            Pais pais = paises.get(i);
            DimensaoContinente += pais.getDimensao();
        }
        return DimensaoContinente;
    }

    //Método para retornar a população total do continente;
    public int getPopulacaoContinente() {

        int totalPopulacao = 0;
        for (int i = 0; i < paises.size(); i++) {
            Pais pais = paises.get(i);
            totalPopulacao += pais.getPopulacao();
        }
        return totalPopulacao;
    }


    public String getMaiorPopulacaoPaisNome() {

        int maiorPopulacao = 0;

        for (int i = 0; i < paises.size(); i++) {
           

            if (paises.get(0).getPopulacao() < paises.get(i).getPopulacao()) {
                maiorPopulacao = i;
            }

        }
        return paises.get(maiorPopulacao).getNome();
    }

    public String getMenorPopulacaoPaisNome() {

        int maiorPopulacao = 0;

        for (int i = 0; i < paises.size(); i++) {
           

            if (paises.get(0).getPopulacao() > paises.get(i).getPopulacao()) {
                maiorPopulacao = i;
            }

        }
        return paises.get(maiorPopulacao).getNome();
    }

    public int getMaiorPopulacaoPaisValor() {

        int maiorPopulacao = 0;

        for (int i = 0; i < paises.size(); i++) {
           
            if (paises.get(0).getPopulacao() < paises.get(i).getPopulacao()) {
                maiorPopulacao = i;
            }

        }
        return paises.get(maiorPopulacao).getPopulacao();
    }

    public int getMenorPopulacaoPaisValor() {

        int menorPopulacao = 0;

        for (int i = 0; i < paises.size(); i++) {
          

            if (paises.get(0).getPopulacao() > paises.get(i).getPopulacao()) {
                menorPopulacao = i;
            }

        }
        return paises.get(menorPopulacao).getPopulacao();
    }

    public String getMaiorDimensaoPaisNome() {

        int maiorDimensao = 0;

        for (int i = 0; i < paises.size(); i++) {
        

            if (paises.get(0).getPopulacao() < paises.get(i).getPopulacao()) {
                maiorDimensao = i;
            }

        }
        return paises.get(maiorDimensao).getNome();
    }

    public String getMenorDimensaoPopulacaoPaisNome() {

        int menorPopulacao = 0;

        for (int i = 0; i < paises.size(); i++) {
           

            if (paises.get(0).getPopulacao() > paises.get(i).getPopulacao()) {
                menorPopulacao = i;
            }

        }
        return paises.get(menorPopulacao).getNome();
    }

    public double getMaiorDimensaoPaisValor() {

        int maiorDimensao = 0;

        for (int i = 0; i < paises.size(); i++) {
         

            if (paises.get(0).getPopulacao() < paises.get(i).getPopulacao()) {
                maiorDimensao = i;
            }

        }
        return paises.get(maiorDimensao).getDimensao();
    }

    public double getMenorDimensaoPaisValor() {

        int menorDimensao = 0;

        for (int i = 0; i < paises.size(); i++) {
           
            if (paises.get(0).getPopulacao() > paises.get(i).getPopulacao()) {
                menorDimensao = i;
            }

        }
        return paises.get(menorDimensao).getDimensao();
    }



    public double getDensidadePopulacionalContinente() {

        if (this.getDimensaoContinente() != 0.0) {
            return getPopulacaoContinente()/ getDimensaoContinente();
        } else {
            return 0.0;
        }
    }

    public double getRazaoDimensao() {

        if (this.getMenorDimensaoPaisValor() != 0.0) {
            return getMaiorDimensaoPaisValor()/ getMenorDimensaoPaisValor();
        } else {
            return 0.0;
        }
    }



}
