package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(age(5, 3));
        System.out.println(age(3, 16));
        System.out.println(age(28, 7));
        System.out.println(age(16, 30));
        System.out.println(age(9, 4));

        System.out.println(age(generateRandomAge(), 36));


    }

    public static String age(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30)
            return " mojno idti gulat";
        else if (age < 20 && temperature > 0 && temperature < 20)
            return "mojno idti gulat";
        else if (age > 45 && temperature > -10 && temperature < 45)
            return "mojno idti gulat";
        else return "ostatsa doma";


    }

    public static int generateRandomAge() {
        Random age = new Random();
        return age.nextInt(90) + 1;


    }

}
