package model;

public class Cidade {
    private String nome;
    private Estado estado;

    public Estado getEstado() {
        return estado;
    }

    public Cidade setEstado(Estado estado) {
        this.estado = estado;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Cidade setNome(String nome) {
        this.nome = nome;
        return this;
    }
}
