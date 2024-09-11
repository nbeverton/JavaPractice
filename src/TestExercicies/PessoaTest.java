package TestExercicies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa pessoa2 = new Pessoa("João Banana", LocalDateTime.of(1991, 01, 01, 01, 01));
        Assertions.assertEquals(33, pessoa2.getIdade());
    }

    @Test
    void deveRetornarSeMaiorIdade(){
        Pessoa pessoa1 = new Pessoa("Everton", LocalDateTime.of(1991, 06, 10, 05, 38));
        Assertions.assertTrue(pessoa1.ehMaiorIdade());
    }
}
