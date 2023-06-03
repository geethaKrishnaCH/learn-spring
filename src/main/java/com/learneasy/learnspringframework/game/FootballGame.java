package com.learneasy.learnspringframework.game;

public class FootballGame implements GamingConsole{

    @Override
    public void up() {
        System.out.println("Kick forward");
    }

    @Override
    public void down() {
        System.out.println("Backward flip kick");
    }

    @Override
    public void left() {
        System.out.println("Kick left");
    }

    @Override
    public void right() {
        System.out.println("Kick right");
    }
}
