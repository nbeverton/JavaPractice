package LeetCode.BaseballGame_692;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame_692 {
    public int calPoints(String[] operations){

        int result = 0;
        List<Integer> numberList = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].matches("D")){
                int numParaMut;
                numParaMut = numberList.get(numberList.size() - 1) * 2;
                numberList.add(numParaMut);
            }

            else if (operations[i].matches("C")) {
                numberList.remove(numberList.size() - 1);

            }

            else if (operations[i].matches("\\+")) {
                int numSomado;
                numSomado = numberList.get(numberList.size() - 1) + numberList.get(numberList.size() - 2);
                numberList.add(numSomado);
            }

            else {
                int numParaInserir = Integer.parseInt(operations[i]);
                numberList.add(numParaInserir);
            }

        }

        for (int i = 0; i < numberList.size(); i++) {
            result += numberList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        BaseballGame_692 baseballGame692 = new BaseballGame_692();

        String[] test = {"5","-2","4","C","D","9","+","+"};
        System.out.println(baseballGame692.calPoints(test));
    }
}
