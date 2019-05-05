package com.codegym;

public class Test {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.fast);
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan1.setRadius(10);
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.medium);
        System.out.println(fan2.toString());
    }
}
