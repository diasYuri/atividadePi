package model;

public class Professor extends Pessoa{

    private Curso contratadoCurso;

    public TipoEnsino getTipoEnsinoContratado(){
        return contratadoCurso.getTipoEnsino();
    }

    public Professor getDiretor(){
        return contratadoCurso.getEscola().getDiretor();
    }

    public Cidade cidadeNascimento(){
        return naturalidade;
    }

    public Curso getContratadoCurso() {
        return contratadoCurso;
    }

    public Professor setContratadoCurso(Curso contratadoCurso) {
        this.contratadoCurso = contratadoCurso;
        return this;
    }
}
