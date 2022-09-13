package com.daicent.exception;

import java.util.Scanner;

public class ExceptionHandling {
    Scanner scanner = new Scanner(System.in);

    public int checkInputOfInterger(String line) {
        boolean check = false;
        int out = 0;

        do {
            try {
                System.out.println(line);
                String input = scanner.nextLine();
                out = Integer.parseInt(input);
                check = true;
            } catch (NumberFormatException e) {
                System.out.println("----------------------");
                System.out.println("Nhập sai định dạng!!!");
            }
        } while (!check);
        return out;
    }

    public double checkInputOfDouble(String line) {
        boolean check = false;
        double out = 0;
        do {
            try {
                System.out.println(line);
                String input = scanner.nextLine();
                out = Double.parseDouble(input);
                check = true;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng vui lòng nhập lại");
            }
        } while (!check);
        return out;
    }
}
