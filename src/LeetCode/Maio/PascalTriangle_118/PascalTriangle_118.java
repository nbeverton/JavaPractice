package LeetCode.Maio.PascalTriangle_118;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle_118 {
    public List<List<Integer>> generate (int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {

            if (i == 1){
                List<Integer> firstRow = new ArrayList<>();
                firstRow.add(1);
                res.add(firstRow);
            } else if (i == 2) {
                List<Integer> secondRow = new ArrayList<>();
                secondRow.add(1);
                secondRow.add(1);
                res.add(secondRow);
            } else {
                List<Integer> prevRow = res.get(i - 2);
                List<Integer> currentRow = new ArrayList<>();
                
                currentRow.add(1);
                for (int j = 0; j < prevRow.size() - 1; j++) {
                    currentRow.add(prevRow.get(j) + prevRow.get(j + 1));
                }
                currentRow.add(1);
                res.add(currentRow);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        PascalTriangle_118 pascalTriangle118 = new PascalTriangle_118();

        int input = 5;
        System.out.println(pascalTriangle118.generate(input));
    }
}
