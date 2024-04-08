package org.example;

public class Main {
    public static void main(String[] args) {
        String name="Denys";
        int age= 26;
        float weight= 80;

        System.out.println("Name= " +name +", Age= " +age+ ", Weight= " +weight);

        int a = 1;
        int b = 2;
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        }
    }