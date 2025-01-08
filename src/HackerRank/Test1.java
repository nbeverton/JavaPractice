package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Test1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        BigInteger bigNumber = new BigInteger(n);
        boolean primo = bigNumber.isProbablePrime(100);

        if (primo == true){
            System.out.println("prime");
        } else
            System.out.println("not prime");

        bufferedReader.close();
    }

}
