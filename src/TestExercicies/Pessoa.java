package TestExercicies;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

import static java.time.temporal.ChronoUnit.YEARS;

public class Pessoa {

    public String name;
    public LocalDateTime nascimento;

    public Pessoa(String name,LocalDateTime nascimento){
        this.name = name;
        this.nascimento = nascimento;
    }

    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
    }

    public boolean ehMaiorIdade(){
        return getIdade() >= 18;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(name, pessoa.name) && Objects.equals(nascimento, pessoa.nascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nascimento);
    }
}
