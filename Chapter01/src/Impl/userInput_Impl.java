package Impl;

import Abs.userInput_Abs;

import java.util.Scanner;

public class userInput_Impl implements userInput_Abs {
    Scanner sc = new Scanner(System.in);

    @Override
    public int inputValue() {
        System.out.print("숫자를 입력하세요 : ");
        int value = sc.nextInt();
        return value;
    }

    @Override
    public int inputMenu() {
        System.out.println("\n= = = 메뉴 = = =");
        System.out.println("1. 더하기");
        System.out.println("2. 빼기");
        System.out.println("3. 곱하기");
        System.out.println("4. 나누기");
        System.out.print("메뉴를 선택하세요: ");

        int menu = sc.nextInt();
        System.out.println();

        return menu;
    }
}
