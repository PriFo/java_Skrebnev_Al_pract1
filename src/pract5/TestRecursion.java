package pract5;

import java.util.Scanner;

public class TestRecursion {
    public static void main(String[] args){
        Recursion rec = new Recursion();
        rec.printChoice();
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        while (rec.choice(k)){
            rec.printChoice();
            k = in.nextInt();
        }
    }
}
