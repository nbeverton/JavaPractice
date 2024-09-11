package TestExercicies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTest {

@Test
    void deveRetornarSeMaiorIdade(){
        Pessoa pessoa1 = new Pessoa("Everton", LocalDateTime.of(1991, 06, 10, 05, 38));
    Assertions.assertTrue(pessoa1.ehMaiorIdade());
    }
}
