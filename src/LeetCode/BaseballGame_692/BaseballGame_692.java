package LeetCode.BaseballGame_692;

import java.util.Arrays;

public class BaseballGame_692 {
    public int calPoints(String[] operations){

        int result = 0;
        int number = 0;
        int[] numberArray = new int[operations.length];

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].matches("D")){
                int numParaMut;
                numParaMut = numberArray[i - 1] * 2;
                numberArray[i] = numParaMut;
                number += numParaMut; // Se liga
            } else if (operations[i].matches("C")) {
                Arrays.copyOf(numberArray, numberArray.length - 1);
            } else if (operations[i].matches("\\+")) {
                int numSomado;
                numSomado = numberArray[i - 1] + numberArray[i - 2];
                numberArray[i] = numSomado;
                number += numSomado; //Se liga
            } else {
                int numParaInserir = Integer.parseInt(operations[i]);
                numberArray[i] = numParaInserir;
                System.out.println("numberArray: " + numberArray[i]);
                number += numParaInserir;
            }

            System.out.println("Valor de número: " + number);

        }

        for (int i = 0; i < numberArray.length; i++) {
            result += numberArray[i];
        }


        return result;
    }

    public static void main(String[] args) {
        BaseballGame_692 baseballGame692 = new BaseballGame_692();

        String[] test = {"5","2","C","D","+"};
        System.out.println(baseballGame692.calPoints(test));
    }
}
