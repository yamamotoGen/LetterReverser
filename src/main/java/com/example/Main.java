package com.example;

import com.example.util.StringUtil;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        StringUtil stringUtil = new StringUtil();
        System.out.println(stringUtil.reverseLetters(str));
    }
}
