package main.java.it.unibo.dragondash.view.api;


public interface Window {

    void start();

    BasicScene createMenuScene();

    ActivityScene createActivityScene();

    BasicScene createGameOverScene(/*int LIVELLO??? PUNTEGGIO*/);
}
