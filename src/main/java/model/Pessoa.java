package model;

public class Pessoa {

    protected String nome;
    protected String localDeNascimento;
    protected Escolaridade escolaridade;
    protected Cidade naturalidade;

    public String getNome() {
        return nome;
    }

    public Pessoa setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getLocalDeNascimento() {
        return localDeNascimento;
    }

    public Pessoa setLocalDeNascimento(String localDeNascimento) {
        this.localDeNascimento = localDeNascimento;
        return this;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public Pessoa setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
        return this;
    }

    public Cidade getNaturalidade() {
        return naturalidade;
    }

    public Pessoa setNaturalidade(Cidade naturalidade) {
        this.naturalidade = naturalidade;
        return this;
    }
}
