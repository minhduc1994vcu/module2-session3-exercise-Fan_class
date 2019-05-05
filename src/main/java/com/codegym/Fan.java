package com.codegym;

public class Fan {
    public static final int slow = 1, medium = 2, fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    @Override
    public String toString() {
        if (on) {
            return "Fan is on " +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color=" + color;
        } else {
            return "Fan is off" +
                    ", radius=" + radius +
                    ", color=" + color;
        }

    }
}
