package ListaDeExercicio01_Exercicio2;

import java.util.Objects;

public class Pais {

    private String codigo;
    private String nome;
    private Integer populacao;
    private Double dimensao;

    public boolean verificaIgualdade(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pais country = (Pais) o;
        return Objects.equals(codigo, country.codigo);
    }

    public Pais(String codigo, String nome, Integer populacao, Double dimensao) {
        this.codigo = codigo;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    public String getCodigoISO() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Integer populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(Double dimensao) {
        this.dimensao = dimensao;
    }

    public double calculaDensidadePopulacional() {
        if (this.populacao != null && this.dimensao != null && this.dimensao != 0.0) {
            return this.populacao / this.dimensao;
        } else {
            return 0.0;
        }
    }
}
