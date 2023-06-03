package com.learneasy.learnspringframework.game;

public class DrivingGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("Accelerate");
    }

    @Override
    public void down() {
        System.out.println("Decelerate");
    }

    @Override
    public void left() {
        System.out.println("Turn left");
    }

    @Override
    public void right() {
        System.out.println("Turn right");
    }
}
