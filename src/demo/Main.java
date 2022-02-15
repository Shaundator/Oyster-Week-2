package demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumberChecker nc = new NumberChecker();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("write number: ");
            if(nc.isNumber(sc.nextLine())){
                System.out.println("This is a number");
            } else {
                System.out.println("Not a number");
            }
        }
    }
}
