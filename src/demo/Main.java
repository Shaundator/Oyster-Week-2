package demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumberChecker nc = new NumberChecker();
        Scanner sc = new Scanner(System.in);
        while(true) {
            if(nc.isNumber(sc.nextLine())){
                System.out.println("\nTHIS IS A NUMBER!!!!!\n");
            } else {
                System.out.println("\nTHIS IS NOT A NUMBER!!!!!\n");
            }
        }
    }
}
