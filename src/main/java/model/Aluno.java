package model;

public class Aluno extends Pessoa{
    private Curso cursoMatriculado;


    public Professor getCoordenadorCurso(){
        return cursoMatriculado.getCoordenador();
    }

    public Estado estadoNaturalidade(){
        return naturalidade.getEstado();
    }

    public Estado estadoEstuda(){
        return cursoMatriculado.getEscola().getCidade().getEstado();
    }

    public Curso getCursoMatriculado() {
        return cursoMatriculado;
    }

    public Aluno setCursoMatriculado(Curso cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
        return this;
    }
}
