package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void getTipoEnsinoContratado() {
        TipoEnsino tipoEnsino = new TipoEnsino().setTipoEnsino("Ensino fundamental");
        Curso curso = new Curso().setTipoEnsino(tipoEnsino);
        Professor prof = new Professor().setContratadoCurso(curso);

        assertEquals(tipoEnsino, prof.getTipoEnsinoContratado());
    }

    @Test
    void getDiretor() {
        Professor prof = new Professor();
        Professor diretor = new Professor();

        Escola escola = new Escola().setDiretor(diretor);
        Curso curso = new Curso().setEscola(escola);

        prof.setContratadoCurso(curso);

        assertEquals(diretor, prof.getDiretor());
    }

    @Test
    void cidadeNascimento() {
        Cidade cidade = new Cidade();
        Professor prof = new Professor();
        prof.setNaturalidade(cidade);

        assertEquals(cidade, prof.cidadeNascimento());
    }

    @Test
    void escolaridadeProfessor(){
        Escolaridade escolaridade = new Escolaridade();
        Professor prof = new Professor();
        prof.setEscolaridade(escolaridade);

        assertEquals(escolaridade, prof.getEscolaridade());
    }
}