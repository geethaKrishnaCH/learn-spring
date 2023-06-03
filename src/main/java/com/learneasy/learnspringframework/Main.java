package com.learneasy.learnspringframework;

import com.learneasy.learnspringframework.game.DrivingGame;
import com.learneasy.learnspringframework.game.GameRunner;

public class Main {

    public static void main(String[] args) {
        // CricketGame game = new CricketGame();
        // FootballGame game = new FootballGame();
        DrivingGame game = new DrivingGame();
        GameRunner runner = new GameRunner(game);
        runner.run();
    }

}
