package org.example;

import java.util.TimeZone;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Default Timezone: " + TimeZone.getDefault().getID());
        System.out.println("Default Timezone Display Name: " + TimeZone.getDefault().getDisplayName());
    }
}