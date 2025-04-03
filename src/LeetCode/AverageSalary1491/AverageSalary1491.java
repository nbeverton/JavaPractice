package LeetCode.AverageSalary1491;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AverageSalary1491 {
    public double average(int[] salary){
        double result = 0.0;

        List<Integer> salaries = new ArrayList<>();
        Arrays.sort(salary);

        for (int num: salary) {
            salaries.add(num);
        }

        for (int i = 1; i < salaries.size() - 1; i++) {
            result += salaries.get(i);
        }

        return result / (salaries.size() - 2);
    }

    public static void main(String[] args) {
        AverageSalary1491 averageSalary1491 = new AverageSalary1491();

        int[] input = {4000,3000,1000,2000};
        System.out.println(averageSalary1491.average(input));
    }
}
