package HackerRank;

import java.io.*;
import java.util.*;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    };


    static class HPBook extends Book{

        @Override
        String getTitle() {
            return super.getTitle();
        }

        @Override
        void setTitle(String s) {
            this.title = s;
        }
    }

}
public class Solution2 {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);

        Book.HPBook hpBook = new Book.HPBook();

        String hpTitle = scanner.nextLine();
        hpBook.setTitle(hpTitle);

        System.out.println(hpBook.getTitle());


    }
}
