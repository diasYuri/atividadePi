package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    void escolaridadeDiretor() {
        Escolaridade escolaridade = new Escolaridade().setEscolaridade("Phd");
        Professor diretor = new Professor();
        diretor.setEscolaridade(escolaridade);
        Escola escola = new Escola().setDiretor(diretor);

        assertEquals(escolaridade, escola.escolaridadeDiretor());
    }
}