package com.assignment4;
import java.util.*;
public class GuessNumber {
    Random myRand = new Random();
    public void play_game() {
        int res;
        int num = myRand.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your language\n1. English\n2. Español\n3. Français\n4. 简体中文");
        int choice = sc.nextInt();
        if (choice == 1) {
            Language myLang = new English();
            System.out.println(myLang.make_guess());
            res = sc.nextInt();
            while (true) {
                if (res == num) {
                    System.out.println(myLang.correct());
                    break;
                } else if (res < num) {
                    System.out.println(myLang.too_low());
                } else if (res > num) {
                    System.out.println(myLang.too_high());
                }
                System.out.println(myLang.make_guess());
                res = sc.nextInt();
            }
        } else if (choice == 2) {
            Language myLang = new Spanish();
            System.out.println(myLang.make_guess());
            res = sc.nextInt();
            while (true) {
                if (res == num) {
                    System.out.println(myLang.correct());
                    break;
                } else if (res < num) {
                    System.out.println(myLang.too_low());
                } else if (res > num) {
                    System.out.println(myLang.too_high());
                }
                System.out.println(myLang.make_guess());
                res = sc.nextInt();
            }
        } else if (choice == 3) {
            Language myLang = new French();
            System.out.println(myLang.make_guess());
            res = sc.nextInt();
            while (true) {
                if (res == num) {
                    System.out.println(myLang.correct());
                    break;
                } else if (res < num) {
                    System.out.println(myLang.too_low());
                } else if (res > num) {
                    System.out.println(myLang.too_high());
                }
                System.out.println(myLang.make_guess());
                res = sc.nextInt();
            }
        } else if (choice == 4) {
            Language myLang = new SimplifiedChinese();
            System.out.println(myLang.make_guess());
            res = sc.nextInt();
            while (true) {
                if (res == num) {
                    System.out.println(myLang.correct());
                    break;
                } else if (res < num) {
                    System.out.println(myLang.too_low());
                } else if (res > num) {
                    System.out.println(myLang.too_high());
                }
                System.out.println(myLang.make_guess());
                res = sc.nextInt();
            }
        }
    }
}
