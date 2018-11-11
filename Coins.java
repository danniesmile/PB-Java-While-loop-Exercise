package loops;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double reset = Double.parseDouble(scanner.nextLine()) * 100;
        int number = 0;


        while (reset > 0) {

            if (reset >= 200) {
                reset -= 200;
                number += 1;


            } else if (reset >= 100) {
                reset -= 100;
                number += 1;

            } else if (reset >= 50) {
                reset -= 50;
                number += 1;

            } else if (reset >= 20) {
                reset -= 20;
                number += 1;

            } else if (reset >= 10) {
                reset -= 10;
                number += 1;

            } else if (reset >= 5) {
                reset -= 5;
                number += 1;

            } else if (reset >= 2) {
                reset -= 2;
                number += 1;

            } else if (reset >= 1) {
                --reset;
                number += 1;

            } else {
                break;
            }
        }
        System.out.println(number);
    }
}
