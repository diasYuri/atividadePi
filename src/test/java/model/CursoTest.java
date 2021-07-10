package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void escolaridadeCoordenador() {
        Professor coord = new Professor();
        Escolaridade escolaridade = new Escolaridade().setEscolaridade("Ensino superior");
        coord.setEscolaridade(escolaridade);
        Curso curso = new Curso().setCoordenador(coord);

        assertEquals(escolaridade, curso.escolaridadeCoordenador());
    }
}