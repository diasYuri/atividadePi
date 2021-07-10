package model;

public class Curso {

    private String nome;
    private TipoEnsino tipoEnsino;
    private Professor coordenador;
    private Escola escola;

    public Escolaridade escolaridadeCoordenador(){
        return coordenador.getEscolaridade();
    }

    public TipoEnsino getTipoEnsino() {
        return tipoEnsino;
    }

    public Curso setTipoEnsino(TipoEnsino tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Curso setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Escola getEscola() {
        return escola;
    }

    public Curso setEscola(Escola escola) {
        this.escola = escola;
        return this;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public Curso setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
        return this;
    }
}
