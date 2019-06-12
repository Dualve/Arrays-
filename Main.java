package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr;
        int amount;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount of items: ");
        amount = input.nextInt();
        arr = new int[amount];
        for (int i = 0; i < amount; i++) {
            System.out.println("Enter " + (i + 1) + " item: ");
            arr[i] = input.nextInt();
        }


        int raw, col;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount of col: ");
        col = in.nextInt();
        System.out.println("Emter amount of raw: ");
        raw = in.nextInt();
        char[][] arr_ch = new char[raw][col];
        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter item in " + i + "raw and " + j + " col.");
                arr_ch[i][j] = in.next().charAt(0);
            }
        }
        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr_ch[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

}

