package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void getCoordenadorCurso() {
        Aluno aluno = new Aluno();
        Curso curso = new Curso();
        Professor coord = new Professor();
        coord.setNome("Marco");
        curso.setCoordenador(coord);
        aluno.setCursoMatriculado(curso);

        assertEquals(coord, aluno.getCoordenadorCurso());
    }

    @Test
    void estadoNaturalidade() {
        Aluno aluno = new Aluno();
        Cidade cidade = new Cidade();
        Estado estado = new Estado();
        estado.setEstado("Rio de janeiro");
        cidade.setEstado(estado);
        aluno.setNaturalidade(cidade);

        assertEquals(estado, aluno.estadoNaturalidade());
    }

    @Test
    void estadoEstuda() {
        Aluno aluno = new Aluno();
        Cidade cidade = new Cidade();
        Estado estado = new Estado();
        estado.setEstado("Rio de janeiro");
        cidade.setEstado(estado);
        Escola escola = new Escola();
        escola.setCidade(cidade);
        Curso curso = new Curso();
        curso.setEscola(escola);
        aluno.setCursoMatriculado(curso);


        assertEquals(estado, aluno.estadoEstuda());
    }
}