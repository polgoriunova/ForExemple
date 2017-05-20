package com.gorunov.java;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Fedor on 20.05.2017.
 */
public class ShowAFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        String myTytle = "Void frame";
        frame.setTitle(myTytle);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String str = scanner.nextLine();
        scanner.close();
        System.out.println("End!  "  + i +" "+ str);
    }
}
