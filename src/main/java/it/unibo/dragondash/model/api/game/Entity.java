package it.unibo.dragondash.model.api.game;

import it.unibo.dragondash.view.api.GameView.Sprite;

public class Entity {
    protected  int x,y;

    public Sprite sprite;
    
    protected int width, height;

    public Entity(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
