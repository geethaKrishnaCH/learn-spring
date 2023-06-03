package com.learneasy.learnspringframework.game;

public class CricketGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Hit Straight");
    }

    @Override
    public void down() {
        System.out.println("Dil Scoop");
    }

    @Override
    public void left() {
        System.out.println("Flick");
    }

    @Override
    public void right() {
        System.out.println("Cover Drive");
    }
}
